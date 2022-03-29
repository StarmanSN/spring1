package homework2;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;

@Component
public class InjectionProductStuffBPP implements BeanPostProcessor {
    int id;

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

        for (Field field : bean.getClass().getDeclaredFields()) {
            InjectionProduct annotation = field.getAnnotation(InjectionProduct.class);
            if (annotation != null) {
                field.setAccessible(true);
                if (field.getClass().equals(Integer.class)) {
                    ReflectionUtils.setField(field, bean, this.id);
                }
            }
        }
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }
}

package homework2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProductConfiguration.class);
        ProductMessageRender messageRender = context.getBean(ProductMessageRender.class);
        messageRender.getProductData();
        messageRender.addProduct(1);
        messageRender.addProduct(2);
        messageRender.addProduct(3);
        messageRender.addProduct(4);
        messageRender.addProduct(5);
        messageRender.delProduct(1);
        messageRender.countProdInCart();
        context.close();
    }
}

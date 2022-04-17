package homework7;

import homework7.entity.Product;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
@Component
@Transactional
public class ProductRepository {

    @Autowired
    private SessionFactory sessionFactory;

    public List findAll() {
        return sessionFactory.getCurrentSession().getNamedQuery("Product.findAll").getResultList();
    }

    public Product edit(Product product) {
        sessionFactory.getCurrentSession().update(product);
        return product;
    }

    public Optional<Product> findById(Long id) {
        Product product = (Product) sessionFactory.getCurrentSession().getNamedQuery("Product.findById")
                .setParameter("id", id).getResultList();
        return Optional.of(product);
    }

    public Product save(Product product) {
        sessionFactory.getCurrentSession().save(product);
        return product;
    }

    public void deleteById(Long id) {
        sessionFactory.getCurrentSession().getNamedQuery("Product.deleteById").setParameter("id", id);
    }
}

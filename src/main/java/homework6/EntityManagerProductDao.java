package homework6;

import homework6.entity.Product2;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
@Transactional
public class EntityManagerProductDao implements ProductDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    private EntityManagerFactory entityManagerFactory;

    @Override
    public List<Product2> findAll() {
        return entityManager.createQuery("select p from Product2 p").getResultList();
    }

    @Override
    public Product2 edit(Product2 product) {
        if (product.getId() == null) {
            entityManager.persist(product);
        } else {
            entityManager.merge(product);
        }
        return product;
    }

    @Override
    public String findTitleById(Long id) {
        TypedQuery<String> namedQuery = entityManager.createNamedQuery("Product2.findTitleById", String.class);
        namedQuery.setParameter("id", id);
        return namedQuery.getSingleResult();
    }

    @Override
    public Product2 findById(Long id) {
        TypedQuery<Product2> namedQuery = entityManager.createNamedQuery("Product2.findById", Product2.class);
        namedQuery.setParameter("id", id);
        return namedQuery.getSingleResult();
    }

    @Override
    public Product2 saveOrUpdate(Product2 product) {
        if (product.getId() == null) {
            entityManager.persist(product);
        } else {
            entityManager.merge(product);
        }
        return product;
    }

    @Override
    public void deleteById(Long id) {
        Product2 product = new Product2();
        product.setId(id);
        delete(product);
    }

    @Override
    public void delete(Product2 product) {
        Product2 mergedManufacturer = entityManager.merge(product);
        entityManager.remove(mergedManufacturer);
    }
}

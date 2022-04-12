package homework6.service;

import homework6.ProductDao;
import homework6.entity.Product2;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductDao productDao;

    public Product2 saveOrUpdate(Product2 product) {
        return productDao.saveOrUpdate(product);
    }

    public Product2 edit(Product2 product) {
        return productDao.edit(product);
    }

    public Product2 findById(Long id) {
        return productDao.findById(id);
    }

    public List<Product2> findAll() {
        return productDao.findAll();
    }

    public void deleteById(Long id) {
        productDao.deleteById(id);
    }
}

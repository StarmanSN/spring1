package homework3.service;

import homework3.model.Product;
import homework3.repository.ProdRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProdRepository repository;

    public Product save(Product product) {
        return repository.save(product);
    }

    public Product edit(Product product) {
        return repository.edit(product);
    }

    public Product findById(Integer id) {
        return repository.findById(id).orElse(new Product());
    }

    public List<Product> findAll() {
        return repository.findAll();
    }

    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}

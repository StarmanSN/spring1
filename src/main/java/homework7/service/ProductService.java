package homework7.service;

import homework7.ProductRepository;
import homework7.entity.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class ProductService {

    public void deleteById(Long id) {
        productRepository.deleteById(id);
    }

    @Autowired
    private final ProductRepository productRepository;

    public Product save(Product product) {
        return (Product) productRepository.save(product);
    }

    @Transactional(readOnly = true)
    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }

    public List findAll() {
        return productRepository.findAll();
    }

//    public List<Product> findAllSortedById() {
//        return productRepository.findAll(Sort.by(Sort.Direction.DESC, "id"));
//    }
//
//    public List<Product> findAllSorterById(int page, int size) {
//        return productRepository.findAll(PageRequest.of(page, size, Sort.by(Sort.Direction.DESC, "id"))).getContent();
//    }
}

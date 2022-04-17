//package homework3.repository;
//
//import homework3.model.Product;
//import org.springframework.context.annotation.Primary;
//import org.springframework.stereotype.Component;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//@Component
//@Primary
//public class ProdRepository {
//
//    List<Product> products = new ArrayList<>();
//
//    private int count;
//
//    public Optional<Product> findById(Integer id) {
//        if (id < products.size()) {
//            return Optional.of(products.get(id));
//        } else {
//            return Optional.empty();
//        }
//    }
//
//    public List<Product> findAll() {
//        return new ArrayList<>(products);
//    }
//
//    public Product save(Product product) {
//        product.setId(count++);
//        products.add(product);
//        return Product.builder()
//                .id(product.getId())
//                .title(product.getTitle())
//                .cost(product.getCost())
//                .build();
//    }
//
//    public Product edit(Product product) {
//        return products.set(product.getId(), product);
//    }
//
//    public void deleteById(Integer id) {
//        if (id < products.size()) {
//            products.remove(id.intValue());
//        }
//    }
//}
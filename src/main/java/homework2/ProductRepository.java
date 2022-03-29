package homework2;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Primary
public class ProductRepository implements ProductRepInterface {

    @InjectionProduct
    List<Product> products = List.of(
            new Product(1, "Apple", 150),
            new Product(2, "Orange", 190),
            new Product(3, "Banana", 100),
            new Product(4, "Carrot", 50),
            new Product(5, "Cherry", 200)
    );

    @Override
    public Product addById(int id) {
        System.out.println("Add product by id: " + id);
        return products.get(id - 1);
    }

    @Override
    public Product delById(int id) {
        System.out.println("Delete product by id: " + id);
        return products.get(id - 1);
    }

    @Override
    public String getProductData() {
        String assortment = "Product assortment: \n";
        for (Product product : products) {
            assortment += product.getData() + "\n";
        }
        return assortment;
    }
}

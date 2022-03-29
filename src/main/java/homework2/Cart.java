package homework2;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Component
@Scope("prototype")
public class Cart {

    List<Product> productsInCart = new LinkedList<>();

    public void addProduct(Product product) {
        if (product != null) {
            productsInCart.add(product);
            System.out.println("Added product: " + product.getTitle());
        }
    }

    public void delProduct(Product product) {
        if (productsInCart.contains(product)) {
            productsInCart.remove(product);
            System.out.println("Deleted product: " + product.getTitle());
        }
    }

    public String countProductsInCart() {
        return "Amount of products in cart: " + (long) productsInCart.size();
    }

}

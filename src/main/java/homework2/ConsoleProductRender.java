package homework2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public class ConsoleProductRender implements ProductMessageRender {

    private ProductRepository productRepository;
    private Cart cart;

    @Autowired
    public ConsoleProductRender(ProductRepository productRepository, Cart cart) {
        this.productRepository = productRepository;
        this.cart = cart;
    }

    @Override
    public void getProductData() {
        System.out.println(productRepository.getProductData());
    }

    @Override
    public void addProduct(int id) {
        cart.addProduct(productRepository.addById(id));
    }

    @Override
    public void delProduct(int id) {
        cart.delProduct(productRepository.delById(id));
    }

    @Override
    public void countProdInCart() {
        System.out.println(cart.countProductsInCart());
    }

    @Override
    @Autowired
    public void setProductRepository(ProductRepository repository) {
        this.productRepository = repository;
    }

    @Override
    @Lookup
    public ProductRepository getProductRepository() {
        return this.productRepository;
    }

    @Override
    @Autowired
    public void setCart(Cart cartProd) {
        this.cart = cartProd;
    }

    @Override
    @Lookup
    public Cart getCart() {
        return this.cart;
    }
}

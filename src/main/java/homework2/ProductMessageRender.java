package homework2;

public interface ProductMessageRender {

    void getProductData();

    void addProduct(int id);

    void delProduct(int id);

    void countProdInCart();

    void setProductRepository(ProductRepository repository);

    ProductRepository getProductRepository();

    void setCart(Cart cartProd);

    Cart getCart();
}

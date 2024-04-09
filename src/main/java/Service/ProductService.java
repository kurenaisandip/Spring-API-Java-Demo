package Service;

import model.Product;

import java.util.List;

public interface ProductService {

    Product getProductById(Long id);
    void saveProduct(Product product);
    void updateProduct(Product product);
    void deleteProduct(Long id);

    List<Product> getAllProducts();
}

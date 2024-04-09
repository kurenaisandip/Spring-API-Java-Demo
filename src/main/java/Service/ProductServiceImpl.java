package Service;

import Repository.ProductRepository;
import model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService{


    private final ProductRepository repository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository){
        this.repository = productRepository;
    }
    @Override
    public Product getProductById(Long id) {
        Optional<Product> optionalProduct = repository.findById(id);
        return optionalProduct.orElse(null);
    }

    @Override
    public void saveProduct(Product product) {
        repository.save(product);
    }

    @Override
    public void updateProduct(Product product) {
        repository.save(product);
    }

    @Override
    public void deleteProduct(Long id) {
        repository.deleteById(id);

    }

    // Additional method to get all products (optional)
    public List<Product> getAllProducts() {
        return repository.findAll();
    }
}

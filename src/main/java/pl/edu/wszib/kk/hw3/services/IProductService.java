package pl.edu.wszib.kk.hw3.services;

import pl.edu.wszib.kk.hw3.model.Product;
import java.util.List;

public interface IProductService {
    Product getProductById(int id);
    void updateProduct(Product product);
    List<Product> getAllProducts();
    void addProduct(Product product);
    //void deleteProductById(int id);
    void deleteProduct(Product product);
}


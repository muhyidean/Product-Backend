package miu.main.service;

import miu.main.domain.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    public Optional<Product> findById(Long id);

    public List<Product> findAll();

    public void addProduct(Product product);

    public void deleteProduct(long id);

}

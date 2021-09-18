package miu.main.controller;

import miu.main.domain.Product;
import miu.main.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@CrossOrigin(origins = { "http://localhost:3000"})
@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductService productService;

    @PreAuthorize("hasRole('ADMIN') or hasRole('USER')")
    @GetMapping()
    public List<Product> getProducts(){
        List<Product> products =  productService.findAll();
        return products;
    }

    @GetMapping("/{id}")
    public Optional<Product> getPostById(@PathVariable String id){
        Optional<Product> p=  productService.findById(Long.parseLong(id));
        return  p;
    }

    @PostMapping
    public void addProduct(@RequestBody Product product){
        productService.addProduct(product);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id){
        productService.deleteProduct(id);
    }


}

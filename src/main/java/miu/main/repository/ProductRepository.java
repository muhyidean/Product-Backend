package miu.main.repository;

import miu.main.domain.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository

public interface ProductRepository extends CrudRepository<Product, Long> {

    Optional<Product> findById(Long id);

    List<Product> findAll();
}

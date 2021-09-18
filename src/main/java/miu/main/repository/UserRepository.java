package miu.main.repository;

import miu.main.domain.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends CrudRepository <User, Long> {

    public List<User> findAll();

    public Optional<User> findById(long id);

    public User findByName(String name);

    public Optional<User> findByUsername(String username);

}

package io.github.onetwostory.salon.repositories;

import io.github.onetwostory.salon.domain.Role;
import io.github.onetwostory.salon.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    List<User> findAll();
    List<User> findByRole(Role role);
    User save(User user);

}

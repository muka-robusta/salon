package io.github.onetwostory.salon.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import io.github.onetwostory.salon.domain.Client;

import java.util.List;
import java.util.Optional;

@Repository
public interface ClientRepo extends CrudRepository<Client, Long> {

    List<Client> findAll();
    Optional<Client> findById(Long id);
    Optional<Client> findByFirstName(String firstName);
    Optional<Client> findByLastName(String lastName);
    Client save(Client client);

}

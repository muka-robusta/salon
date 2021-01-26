package io.github.onetwostory.salon.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import io.github.onetwostory.salon.domain.Client;

import java.util.List;
import java.util.Optional;

@Repository
public interface ClientRepo extends CrudRepository<Client, Long> {

    Optional<Client> findByLastName(String lastName);

}

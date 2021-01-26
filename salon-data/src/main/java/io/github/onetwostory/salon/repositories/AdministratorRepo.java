package io.github.onetwostory.salon.repositories;

import io.github.onetwostory.salon.domain.Administrator;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface AdministratorRepo extends CrudRepository<Administrator, Long> {
}

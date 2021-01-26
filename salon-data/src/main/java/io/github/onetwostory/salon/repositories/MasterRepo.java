package io.github.onetwostory.salon.repositories;

import io.github.onetwostory.salon.domain.Master;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface MasterRepo extends CrudRepository<Master, Long> {

    Optional<Master> findByLastName(String lastName);

}

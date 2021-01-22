package io.github.onetwostory.salon.repositories;

import io.github.onetwostory.salon.domain.ServiceElement;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping
public interface ServiceOfSalonRepository extends CrudRepository<ServiceElement, Long> {
    List<ServiceElement> findAll();
}

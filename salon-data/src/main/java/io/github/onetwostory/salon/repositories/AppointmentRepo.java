package io.github.onetwostory.salon.repositories;

import io.github.onetwostory.salon.domain.Appointment;
import org.springframework.data.repository.CrudRepository;

public interface AppointmentRepo extends CrudRepository<Appointment, Long> {
}

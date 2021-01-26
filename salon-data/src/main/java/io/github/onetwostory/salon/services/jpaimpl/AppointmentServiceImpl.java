package io.github.onetwostory.salon.services.jpaimpl;

import io.github.onetwostory.salon.domain.Appointment;
import io.github.onetwostory.salon.repositories.AppointmentRepo;
import io.github.onetwostory.salon.services.AppointmentService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class AppointmentServiceImpl implements AppointmentService {

    private final AppointmentRepo appointmentRepo;

    public AppointmentServiceImpl(AppointmentRepo appointmentRepo) {
        this.appointmentRepo = appointmentRepo;
    }

    @Override
    public Set<Appointment> findAll() {
        Set<Appointment> appointments = new HashSet<>();
        appointmentRepo.findAll().forEach(appointments::add);
        return appointments;
    }

    @Override
    public Appointment findById(Long aLong) {
        return appointmentRepo.findById(aLong).orElse(null);
    }

    @Override
    public Appointment save(Appointment object) {
        return appointmentRepo.save(object);
    }

    @Override
    public void delete(Appointment object) {
        appointmentRepo.save(object);
    }

    @Override
    public void deleteById(Long aLong) {
        appointmentRepo.deleteById(aLong);
    }
}

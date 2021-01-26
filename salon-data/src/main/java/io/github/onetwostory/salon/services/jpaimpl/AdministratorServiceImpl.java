package io.github.onetwostory.salon.services.jpaimpl;

import io.github.onetwostory.salon.domain.Administrator;
import io.github.onetwostory.salon.repositories.AdministratorRepo;
import io.github.onetwostory.salon.services.AdministratorService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class AdministratorServiceImpl implements AdministratorService {

    private final AdministratorRepo administratorRepo;

    public AdministratorServiceImpl(AdministratorRepo administratorRepo) {
        this.administratorRepo = administratorRepo;
    }

    @Override
    public Set<Administrator> findAll() {
        Set<Administrator> administrators = new HashSet<>();
        administratorRepo.findAll().forEach(administrators::add);
        return administrators;
    }

    @Override
    public Administrator findById(Long aLong) {
        return administratorRepo.findById(aLong).orElse(null);
    }

    @Override
    public Administrator save(Administrator object) {
        return administratorRepo.save(object);
    }

    @Override
    public void delete(Administrator object) {
        administratorRepo.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        administratorRepo.deleteById(aLong);
    }
}

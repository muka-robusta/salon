package io.github.onetwostory.salon.services.jpaimpl;

import io.github.onetwostory.salon.domain.ServiceOption;
import io.github.onetwostory.salon.repositories.ServiceOptionRepo;
import io.github.onetwostory.salon.services.ServiceOptionService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class ServiceOptionServiceImpl implements ServiceOptionService {

    private final ServiceOptionRepo serviceOptionRepo;

    public ServiceOptionServiceImpl(ServiceOptionRepo serviceOptionRepo) {
        this.serviceOptionRepo = serviceOptionRepo;
    }

    @Override
    public Set<ServiceOption> findAll() {
        Set<ServiceOption> serviceOptions = new HashSet<>();
        serviceOptionRepo.findAll().forEach(serviceOptions::add);
        return serviceOptions;
    }

    @Override
    public ServiceOption findById(Long id) {
        return serviceOptionRepo.findById(id).orElse(null);
    }

    @Override
    public ServiceOption save(ServiceOption object) {
        return serviceOptionRepo.save(object);
    }

    @Override
    public void delete(ServiceOption object) {
        serviceOptionRepo.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        serviceOptionRepo.deleteById(aLong);
    }
}

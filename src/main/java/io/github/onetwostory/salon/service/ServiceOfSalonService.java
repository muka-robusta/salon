package io.github.onetwostory.salon.service;

import io.github.onetwostory.salon.domain.ServiceElement;
import io.github.onetwostory.salon.repositories.ServiceOfSalonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceOfSalonService {

    private final ServiceOfSalonRepository salonRepository;

    public ServiceOfSalonService(ServiceOfSalonRepository salonRepository) {
        this.salonRepository = salonRepository;
    }

    public List<ServiceElement> getServiceList() {
        return salonRepository.findAll();
    }

}

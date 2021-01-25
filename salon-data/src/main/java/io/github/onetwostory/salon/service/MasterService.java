package io.github.onetwostory.salon.service;

import io.github.onetwostory.salon.domain.Master;
import io.github.onetwostory.salon.repositories.MasterRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MasterService {

    private final MasterRepo masterRepo;

    public MasterService(MasterRepo masterRepo) {
        this.masterRepo = masterRepo;
    }

    public List<Master> findAllMasters() {
        return masterRepo.findAll();
    }

}

package io.github.onetwostory.salon.services.jpaimpl;

import io.github.onetwostory.salon.domain.Master;
import io.github.onetwostory.salon.repositories.MasterRepo;
import io.github.onetwostory.salon.services.MasterService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class MasterServiceImpl implements MasterService {

    private final MasterRepo masterRepo;

    public MasterServiceImpl(MasterRepo masterRepo) {
        this.masterRepo = masterRepo;
    }

    @Override
    public Set<Master> findAll() {
        Set<Master> masters = new HashSet<>();
        masterRepo.findAll().forEach(masters::add);
        return masters;
    }

    @Override
    public Master findById(Long aLong) {
        return masterRepo.findById(aLong).orElse(null);
    }

    @Override
    public Master save(Master object) {
        return masterRepo.save(object);
    }

    @Override
    public void delete(Master object) {
        masterRepo.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        masterRepo.deleteById(aLong);
    }
}

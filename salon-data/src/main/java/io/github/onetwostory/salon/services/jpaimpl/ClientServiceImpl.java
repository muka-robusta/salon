package io.github.onetwostory.salon.services.jpaimpl;

import io.github.onetwostory.salon.domain.Client;
import io.github.onetwostory.salon.repositories.ClientRepo;
import io.github.onetwostory.salon.services.ClientService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class ClientServiceImpl implements ClientService {

    private final ClientRepo clientRepo;

    public ClientServiceImpl(ClientRepo clientRepo) {
        this.clientRepo = clientRepo;
    }

    @Override
    public Client findByLastName(String lastName) {
        return clientRepo.findByLastName(lastName).orElse(null);
    }

    @Override
    public Set<Client> findAll() {
        Set<Client> clientSet = new HashSet<>();
        clientRepo.findAll().forEach(clientSet::add);
        return clientSet;
    }

    @Override
    public Client findById(Long aLong) {
        return clientRepo.findById(aLong).orElse(null);
    }

    @Override
    public Client save(Client object) {
        return clientRepo.save(object);
    }

    @Override
    public void delete(Client object) {
        clientRepo.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        clientRepo.deleteById(aLong);
    }
}

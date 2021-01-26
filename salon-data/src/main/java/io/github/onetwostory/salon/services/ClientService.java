package io.github.onetwostory.salon.services;

import io.github.onetwostory.salon.domain.Client;

public interface ClientService extends CrudService<Client, Long> {
    Client findByLastName(String lastName);
}

package com.syventa.server.repository;

import com.syventa.server.schema.ClientSchema;
import java.util.List;
import java.util.Optional;

public interface ClientRepository {
    List<ClientSchema> findAll();
    Optional<ClientSchema> findById(int id);
    ClientSchema save(ClientSchema schema);
    ClientSchema update(int id, ClientSchema schema);
    Boolean delete(int id);
}

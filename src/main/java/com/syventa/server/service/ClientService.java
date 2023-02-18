package com.syventa.server.service;

import com.syventa.server.jpa.ClientJpa;
import com.syventa.server.repository.ClientRepository;
import com.syventa.server.schema.ClientSchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService implements ClientRepository {
    @Autowired
    private ClientJpa jpa;
    /**
     * @return
     */
    @Override
    public List<ClientSchema> findAll() {
        return (List<ClientSchema>) jpa.findAll();
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Optional<ClientSchema> findById(int id) {
        return (Optional<ClientSchema>) jpa.findById(id);
    }

    /**
     * @param schema
     * @return
     */
    @Override
    public ClientSchema save(ClientSchema schema) {
        return jpa.save(schema);
    }

    /**
     * @param id
     * @param schema
     * @return
     */
    @Override
    public ClientSchema update(int id, ClientSchema schema) {
        schema.setId(id);
        return jpa.saveAndFlush(schema);
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Boolean delete(int id) {
        return findById(id).map(item ->{
            jpa.deleteById(id);
            return true;
        }).orElse(false);
    }
}

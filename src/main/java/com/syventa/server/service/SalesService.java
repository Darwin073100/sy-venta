package com.syventa.server.service;

import com.syventa.server.jpa.SalesJpa;
import com.syventa.server.repository.SalesRepository;
import com.syventa.server.schema.SalesSchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SalesService implements SalesRepository {
    @Autowired
    private SalesJpa jpa;
    /**
     * @return 
     */
    @Override
    public List<SalesSchema> findAll() {
        return (List<SalesSchema>) jpa.findAll();
    }

    /**
     * @param id 
     * @return
     */
    @Override
    public Optional<SalesSchema> findById(int id) {
        return (Optional<SalesSchema>) jpa.findById(id);
    }

    /**
     * @param schema 
     * @return
     */
    @Override
    public SalesSchema save(SalesSchema schema) {
        return jpa.save(schema);
    }

    /**
     * @param id 
     * @param schema
     * @return
     */
    @Override
    public SalesSchema update(int id, SalesSchema schema) {
        schema.setId(id);
        return jpa.saveAndFlush(schema);
    }

    /**
     * @param id 
     * @return
     */
    @Override
    public Boolean delete(int id) {
        return findById(id).map(item -> {
            jpa.deleteById(id);
            return true;
        }).orElse(false);
    }
}

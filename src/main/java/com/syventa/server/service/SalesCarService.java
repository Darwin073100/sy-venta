package com.syventa.server.service;

import com.syventa.server.jpa.SalesCarJpa;
import com.syventa.server.repository.SalesCarRepository;
import com.syventa.server.schema.SalesCarSchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SalesCarService implements SalesCarRepository {
    @Autowired
    private SalesCarJpa jpa;
    /**
     * @return
     */
    @Override
    public List<SalesCarSchema> findAll() {
        return (List<SalesCarSchema>) jpa.findAll();
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Optional<SalesCarSchema> findById(int id) {
        return (Optional<SalesCarSchema>) jpa.findById(id);
    }

    /**
     * @param schema
     * @return
     */
    @Override
    public SalesCarSchema save(SalesCarSchema schema) {
        return jpa.save(schema);
    }

    /**
     * @param id
     * @param schema
     * @return
     */
    @Override
    public SalesCarSchema update(int id, SalesCarSchema schema) {
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

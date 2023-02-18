package com.syventa.server.service;

import com.syventa.server.jpa.SalesInfoJpa;
import com.syventa.server.repository.SalesInfoRepository;
import com.syventa.server.schema.SalesInfoSchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SalesInfoService implements SalesInfoRepository {
    @Autowired
    private SalesInfoJpa jpa;
    /**
     * @return 
     */
    @Override
    public List<SalesInfoSchema> findAll() {
        return (List<SalesInfoSchema>) jpa.findAll();
    }

    /**
     * @param id 
     * @return
     */
    @Override
    public Optional<SalesInfoSchema> findById(int id) {
        return (Optional<SalesInfoSchema>) jpa.findById(id);
    }

    /**
     * @param schema 
     * @return
     */
    @Override
    public SalesInfoSchema save(SalesInfoSchema schema) {
        return jpa.save(schema);
    }

    /**
     * @param id 
     * @param schema
     * @return
     */
    @Override
    public SalesInfoSchema update(int id, SalesInfoSchema schema) {
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
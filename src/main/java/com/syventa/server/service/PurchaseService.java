package com.syventa.server.service;

import com.syventa.server.jpa.Purchase;
import com.syventa.server.repository.PurchaseRepository;
import com.syventa.server.schema.PurchaseSchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PurchaseService implements PurchaseRepository {
    @Autowired
    private Purchase jpa;
    /**
     * @return 
     */
    @Override
    public List<PurchaseSchema> findAll() {
        return (List<PurchaseSchema>) jpa.findAll();
    }

    /**
     * @param id 
     * @return
     */
    @Override
    public Optional<PurchaseSchema> findById(int id) {
        return (Optional<PurchaseSchema>) jpa.findById(id);
    }

    /**
     * @param schema 
     * @return
     */
    @Override
    public PurchaseSchema save(PurchaseSchema schema) {
        return jpa.save(schema);
    }

    /**
     * @param id 
     * @param schema
     * @return
     */
    @Override
    public PurchaseSchema update(int id, PurchaseSchema schema) {
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

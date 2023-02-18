package com.syventa.server.service;

import com.syventa.server.jpa.SupplierJpa;
import com.syventa.server.repository.SupplierRepository;
import com.syventa.server.schema.SupplierSchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SupplierService implements SupplierRepository {
    @Autowired
    private SupplierJpa jpa;
    /**
     * @return 
     */
    @Override
    public List<SupplierSchema> findAll() {
        return (List<SupplierSchema>) jpa.findAll();
    }

    /**
     * @param id 
     * @return
     */
    @Override
    public Optional<SupplierSchema> findById(int id) {
        return (Optional<SupplierSchema>) jpa.findById(id);
    }

    /**
     * @param schema 
     * @return
     */
    @Override
    public SupplierSchema save(SupplierSchema schema) {
        return jpa.save(schema);
    }

    /**
     * @param id 
     * @param schema
     * @return
     */
    @Override
    public SupplierSchema update(int id, SupplierSchema schema) {
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

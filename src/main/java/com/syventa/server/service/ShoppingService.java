package com.syventa.server.service;

import com.syventa.server.jpa.ShoppingJpa;
import com.syventa.server.repository.ShoppingRepository;
import com.syventa.server.schema.ShoppingSchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShoppingService implements ShoppingRepository {
    @Autowired
    private ShoppingJpa jpa;
    /**
     * @return 
     */
    @Override
    public List<ShoppingSchema> findAll() {
        return (List<ShoppingSchema>) jpa.findAll();
    }

    /**
     * @param id 
     * @return
     */
    @Override
    public Optional<ShoppingSchema> findById(int id) {
        return (Optional<ShoppingSchema>) jpa.findById(id);
    }

    /**
     * @param schema 
     * @return
     */
    @Override
    public ShoppingSchema save(ShoppingSchema schema) {
        return jpa.save(schema);
    }

    /**
     * @param id 
     * @param schema
     * @return
     */
    @Override
    public ShoppingSchema update(int id, ShoppingSchema schema) {
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

package com.syventa.server.service;

import com.syventa.server.jpa.ShoppingInfoJpa;
import com.syventa.server.repository.ShoppingInfoRepository;
import com.syventa.server.schema.ShoppingInfoSchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShoppingInfoService implements ShoppingInfoRepository {
    @Autowired
    private ShoppingInfoJpa jpa;
    /**
     * @return
     */
    @Override
    public List<ShoppingInfoSchema> findAll() {
        return (List<ShoppingInfoSchema>) jpa.findAll();
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Optional<ShoppingInfoSchema> findById(int id) {
        return (Optional<ShoppingInfoSchema>) jpa.findById(id);
    }

    /**
     * @param schema
     * @return
     */
    @Override
    public ShoppingInfoSchema save(ShoppingInfoSchema schema) {
        return jpa.save(schema);
    }

    /**
     * @param id
     * @param schema
     * @return
     */
    @Override
    public ShoppingInfoSchema update(int id, ShoppingInfoSchema schema) {
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

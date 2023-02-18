package com.syventa.server.service;

import com.syventa.server.jpa.ProductJpa;
import com.syventa.server.repository.ProductRepository;
import com.syventa.server.schema.ProductSchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService implements ProductRepository {
    @Autowired
    private ProductJpa jpa;
    LocalDate date = LocalDate.now();

    /**
     * @return
     */
    @Override
    public List<ProductSchema> findAll() {
        return (List<ProductSchema>) jpa.findAll();
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Optional<ProductSchema> findById(int id) {
        return (Optional<ProductSchema>) jpa.findById(id);
    }

    /**
     * @param schema
     * @return
     */
    @Override
    public ProductSchema save(ProductSchema schema) {
        schema.setCreatedAt(date);
        return jpa.save(schema);
    }

    /**
     * @param id
     * @param schema
     * @return
     */
    @Override
    public ProductSchema update(int id, ProductSchema schema) {
        schema.setId(id);
        return jpa.saveAndFlush(schema);
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Boolean delete(int id) {
        return findById(id).map(schema -> {
            jpa.deleteById(id);
            return true;
        }).orElse(false);
    }
}

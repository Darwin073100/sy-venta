package com.syventa.server.service;

import com.syventa.server.jpa.PurchaseInfoJpa;
import com.syventa.server.repository.PurchaseInfoRepository;
import com.syventa.server.schema.PurchaseInfoSchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PurchaseInfoService implements PurchaseInfoRepository {
    @Autowired
    private PurchaseInfoJpa jpa;
    /**
     * @return
     */
    @Override
    public List<PurchaseInfoSchema> findAll() {
        return (List<PurchaseInfoSchema>) jpa.findAll();
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Optional<PurchaseInfoSchema> findById(int id) {
        return (Optional<PurchaseInfoSchema>) jpa.findById(id);
    }

    /**
     * @param schema
     * @return
     */
    @Override
    public PurchaseInfoSchema save(PurchaseInfoSchema schema) {
        return jpa.save(schema);
    }

    /**
     * @param id
     * @param schema
     * @return
     */
    @Override
    public PurchaseInfoSchema update(int id, PurchaseInfoSchema schema) {
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

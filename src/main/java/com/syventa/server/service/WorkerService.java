package com.syventa.server.service;

import com.syventa.server.jpa.WorkerJpa;
import com.syventa.server.repository.WorkerRepository;
import com.syventa.server.schema.WorkerSchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WorkerService implements WorkerRepository {
    @Autowired
    private WorkerJpa jpa;
    /**
     * @return 
     */
    @Override
    public List<WorkerSchema> findAll() {
        return (List<WorkerSchema>) jpa.findAll();
    }

    /**
     * @param id 
     * @return
     */
    @Override
    public Optional<WorkerSchema> findById(int id) {
        return (Optional<WorkerSchema>)jpa.findById(id);
    }

    /**
     * @param schema 
     * @return
     */
    @Override
    public WorkerSchema save(WorkerSchema schema) {
        return jpa.save(schema);
    }

    /**
     * @param id 
     * @param schema
     * @return
     */
    @Override
    public WorkerSchema update(int id, WorkerSchema schema) {
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

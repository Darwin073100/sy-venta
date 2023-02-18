package com.syventa.server.repository;

import com.syventa.server.schema.WorkerSchema;

import java.util.List;
import java.util.Optional;

public interface WorkerRepository {
    List<WorkerSchema> findAll();
    Optional<WorkerSchema> findById(int id);
    WorkerSchema save(WorkerSchema schema);
    WorkerSchema update(int id, WorkerSchema schema);
    Boolean delete(int id);
}

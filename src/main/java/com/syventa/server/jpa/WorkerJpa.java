package com.syventa.server.jpa;

import com.syventa.server.schema.WorkerSchema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerJpa extends JpaRepository<WorkerSchema, Integer> {
}

package com.syventa.server.jpa;

import com.syventa.server.schema.SalesCarSchema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalesCarJpa extends JpaRepository<SalesCarSchema, Integer> {
}

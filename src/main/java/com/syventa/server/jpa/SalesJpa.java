package com.syventa.server.jpa;

import com.syventa.server.schema.SalesSchema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalesJpa extends JpaRepository<SalesSchema, Integer> {
}

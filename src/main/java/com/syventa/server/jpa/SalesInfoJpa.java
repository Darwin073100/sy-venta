package com.syventa.server.jpa;

import com.syventa.server.schema.SalesInfoSchema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalesInfoJpa extends JpaRepository<SalesInfoSchema, Integer> {
}

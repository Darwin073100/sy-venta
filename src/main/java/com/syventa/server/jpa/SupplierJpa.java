package com.syventa.server.jpa;

import com.syventa.server.schema.SupplierSchema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierJpa extends JpaRepository<SupplierSchema, Integer> {
}

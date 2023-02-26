package com.syventa.server.jpa;

import com.syventa.server.schema.PurchaseSchema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Purchase extends JpaRepository<PurchaseSchema, Integer> {
}

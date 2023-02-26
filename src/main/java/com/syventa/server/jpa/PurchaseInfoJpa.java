package com.syventa.server.jpa;

import com.syventa.server.schema.PurchaseInfoSchema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseInfoJpa extends JpaRepository<PurchaseInfoSchema, Integer> {
}

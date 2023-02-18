package com.syventa.server.jpa;

import com.syventa.server.schema.ShoppingInfoSchema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShoppingInfoJpa extends JpaRepository<ShoppingInfoSchema, Integer> {
}

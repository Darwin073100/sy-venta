package com.syventa.server.jpa;

import com.syventa.server.schema.ShoppingSchema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShoppingJpa extends JpaRepository<ShoppingSchema, Integer> {
}

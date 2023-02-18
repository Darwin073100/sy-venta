package com.syventa.server.jpa;

import com.syventa.server.schema.ProductSchema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductJpa extends JpaRepository<ProductSchema, Integer> {
}

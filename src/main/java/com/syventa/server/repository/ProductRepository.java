package com.syventa.server.repository;

import com.syventa.server.schema.ProductSchema;
import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    List<ProductSchema> findAll();
    Optional<ProductSchema> findById(int id);
    ProductSchema save(ProductSchema schema);
    ProductSchema update(int id, ProductSchema schema);
    Boolean delete(int id);
}

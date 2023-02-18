package com.syventa.server.repository;

import com.syventa.server.schema.ShoppingInfoSchema;
import java.util.List;
import java.util.Optional;

public interface ShoppingInfoRepository {
    List<ShoppingInfoSchema> findAll();
    Optional<ShoppingInfoSchema> findById(int id);
    ShoppingInfoSchema save(ShoppingInfoSchema schema);
    ShoppingInfoSchema update(int id, ShoppingInfoSchema schema);
    Boolean delete(int id);
}

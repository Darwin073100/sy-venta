package com.syventa.server.repository;

import com.syventa.server.schema.ShoppingSchema;
import java.util.List;
import java.util.Optional;

public interface ShoppingRepository {
    List<ShoppingSchema> findAll();
    Optional<ShoppingSchema> findById(int id);
    ShoppingSchema save(ShoppingSchema schema);
    ShoppingSchema update(int id, ShoppingSchema schema);
    Boolean delete(int id);
}

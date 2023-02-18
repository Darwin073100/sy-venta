package com.syventa.server.repository;

import com.syventa.server.schema.SalesSchema;
import java.util.List;
import java.util.Optional;

public interface SalesRepository {
    List<SalesSchema> findAll();
    Optional<SalesSchema> findById(int id);
    SalesSchema save(SalesSchema schema);
    SalesSchema update(int id, SalesSchema schema);
    Boolean delete(int id);
}

package com.syventa.server.repository;

import com.syventa.server.schema.SalesCarSchema;

import java.util.List;
import java.util.Optional;

public interface SalesCarRepository {
    List<SalesCarSchema> findAll();
    Optional<SalesCarSchema> findById(int id);
    SalesCarSchema save(SalesCarSchema schema);
    SalesCarSchema update(int id, SalesCarSchema schema);
    Boolean delete(int id);
}

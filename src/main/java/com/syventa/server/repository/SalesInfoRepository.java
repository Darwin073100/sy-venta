package com.syventa.server.repository;

import com.syventa.server.schema.SalesInfoSchema;
import java.util.List;
import java.util.Optional;

public interface SalesInfoRepository {
    List<SalesInfoSchema> findAll();
    Optional<SalesInfoSchema> findById(int id);
    SalesInfoSchema save(SalesInfoSchema schema);
    SalesInfoSchema update(int id, SalesInfoSchema schema);
    Boolean delete(int id);
}

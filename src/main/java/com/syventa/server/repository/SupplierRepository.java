package com.syventa.server.repository;

import com.syventa.server.schema.SupplierSchema;
import java.util.List;
import java.util.Optional;

public interface SupplierRepository {
    List<SupplierSchema> findAll();
    Optional<SupplierSchema> findById(int id);
    SupplierSchema save(SupplierSchema schema);
    SupplierSchema update(int id, SupplierSchema schema);
    Boolean delete(int id);
}

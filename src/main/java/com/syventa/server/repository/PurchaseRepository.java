package com.syventa.server.repository;

import com.syventa.server.schema.PurchaseSchema;
import java.util.List;
import java.util.Optional;

public interface PurchaseRepository {
    List<PurchaseSchema> findAll();
    Optional<PurchaseSchema> findById(int id);
    PurchaseSchema save(PurchaseSchema schema);
    PurchaseSchema update(int id, PurchaseSchema schema);
    Boolean delete(int id);
}

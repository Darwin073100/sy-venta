package com.syventa.server.repository;

import com.syventa.server.schema.PurchaseInfoSchema;
import java.util.List;
import java.util.Optional;

public interface PurchaseInfoRepository {
    List<PurchaseInfoSchema> findAll();
    Optional<PurchaseInfoSchema> findById(int id);
    PurchaseInfoSchema save(PurchaseInfoSchema schema);
    PurchaseInfoSchema update(int id, PurchaseInfoSchema schema);
    Boolean delete(int id);
}

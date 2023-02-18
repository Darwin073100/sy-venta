package com.syventa.server.jpa;

import com.syventa.server.schema.ClientSchema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientJpa extends JpaRepository<ClientSchema, Integer> {
}

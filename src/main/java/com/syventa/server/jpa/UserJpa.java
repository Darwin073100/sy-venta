package com.syventa.server.jpa;

import com.syventa.server.schema.UserSchema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJpa extends JpaRepository<UserSchema, Integer> {
}

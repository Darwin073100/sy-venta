package com.syventa.server.repository;

import com.syventa.server.schema.UserSchema;
import java.util.List;
import java.util.Optional;

public interface UserRepository {
    List<UserSchema> findAll();
    Optional<UserSchema> findById(int id);
    UserSchema save(UserSchema schema);
    UserSchema update(int id, UserSchema schema);
    Boolean delete(int id);
}

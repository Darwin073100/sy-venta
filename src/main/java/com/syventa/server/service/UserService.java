package com.syventa.server.service;

import com.syventa.server.jpa.UserJpa;
import com.syventa.server.repository.UserRepository;
import com.syventa.server.schema.UserSchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService implements UserRepository {
    @Autowired
    private UserJpa jpa;
    /**
     * @return 
     */
    @Override
    public List<UserSchema> findAll() {
        return (List<UserSchema>) jpa.findAll();
    }

    /**
     * @param id 
     * @return
     */
    @Override
    public Optional<UserSchema> findById(int id) {
        return (Optional<UserSchema>) jpa.findById(id);
    }

    /**
     * @param schema 
     * @return
     */
    @Override
    public UserSchema save(UserSchema schema) {
        return jpa.save(schema);
    }

    /**
     * @param id 
     * @param schema
     * @return
     */
    @Override
    public UserSchema update(int id, UserSchema schema) {
        schema.setId(id);
        return jpa.saveAndFlush(schema);
    }

    /**
     * @param id 
     * @return
     */
    @Override
    public Boolean delete(int id) {
        return findById(id).map(item ->{
            jpa.deleteById(id);
            return true;
        }).orElse(false);
    }
}

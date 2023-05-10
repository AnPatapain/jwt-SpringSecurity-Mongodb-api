package com.anpatapain.spring_security_101.repository;

import com.anpatapain.spring_security_101.model.ERole;
import com.anpatapain.spring_security_101.model.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface RoleRepository extends MongoRepository<Role, String> {
    Optional<Role> findByName(ERole name);
}

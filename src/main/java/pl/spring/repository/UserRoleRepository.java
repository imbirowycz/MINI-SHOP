package pl.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.spring.model.UserRole;

/**
 * @Copyright 12.09.17
 * @autor Andrzej I.
 */
public interface UserRoleRepository extends JpaRepository<UserRole, Long> {
    UserRole findByRole(String role);
}

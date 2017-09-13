package pl.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.spring.model.User;

/**
 * @Copyright 12.09.17
 * @autor Andrzej I.
 */
public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
}

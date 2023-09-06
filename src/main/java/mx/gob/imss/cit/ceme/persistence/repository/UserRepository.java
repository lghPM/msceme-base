package mx.gob.imss.cit.ceme.persistence.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import mx.gob.imss.cit.ceme.persistence.User;


public interface UserRepository extends JpaRepository<User, Integer> {
	
    // Since email is unique, we'll find users by email
    Optional<User> findByEmail(String email);
}

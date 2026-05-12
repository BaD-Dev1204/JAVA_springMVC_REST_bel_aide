package be.baddev.java_springmvc_rest_bel_aide.dal.repositories;

import be.baddev.java_springmvc_rest_bel_aide.dal.entities.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {

    Optional<User> findByKeycloakId(String keycloakId);

    /*
    Optional<User> findByEmail(String email);
    */
    boolean existsByKeycloakId(String keycloakId);
    /*
    boolean existsByEmail(String email);
    */
}
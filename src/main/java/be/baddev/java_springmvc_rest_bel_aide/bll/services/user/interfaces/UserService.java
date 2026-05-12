package be.baddev.java_springmvc_rest_bel_aide.bll.services.user.interfaces;

import be.baddev.java_springmvc_rest_bel_aide.dal.entities.user.User;

import java.util.List;
import java.util.UUID;

public interface UserService {

    User register(User entity);

    User update(User entity);

    User findById(UUID id);

    User findByKeycloakId(String keycloakId);

    /*
    User findByEmail(String email);
    */
    List<User> findAll();

    boolean existsByKeycloakId(String keycloakId);

    /*
        boolean existsByEmail(String email);
    */

    void delete(UUID id);

}
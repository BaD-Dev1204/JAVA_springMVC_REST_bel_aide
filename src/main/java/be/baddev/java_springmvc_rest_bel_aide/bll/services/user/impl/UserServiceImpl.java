package be.baddev.java_springmvc_rest_bel_aide.bll.services.user.impl;

import be.baddev.java_springmvc_rest_bel_aide.bll.exceptions.NotFoundException;
import be.baddev.java_springmvc_rest_bel_aide.bll.exceptions.OperationNotAllowedException;
import be.baddev.java_springmvc_rest_bel_aide.bll.services.user.interfaces.UserService;
import be.baddev.java_springmvc_rest_bel_aide.dal.entities.user.User;
import be.baddev.java_springmvc_rest_bel_aide.dal.repositories.UserRepository;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    @Override
    public User register(User entity) {

        if (repository.existsByKeycloakId(entity.getKeycloakId())) {
            throw new OperationNotAllowedException(
                    "A user already exists with keycloak id: "
                            + entity.getKeycloakId()
            );
        }

        /*
        if (repository.existsByEmail(entity.getEmail())) {
            throw new OperationNotAllowedException(
                    "A user already exists with email: "
                            + entity.getEmail()
            );
        }
         */

        return repository.save(entity);
    }

    @Override
    public User update(User entity) {

        User existing = repository.findById(entity.getId())
                .orElseThrow(() ->
                        new NotFoundException(
                                "User not found with id: " + entity.getId()
                        )
                );

        /*
        if (
                !existing.getEmail().equals(entity.getEmail())
                        && repository.existsByEmail(entity.getEmail())
        ) {
            throw new OperationNotAllowedException(
                    "Email already used: " + entity.getEmail()
            );
        }
        */


        return repository.save(entity);
    }

    @Override
    public User findById(UUID id) {

        return repository.findById(id)
                .orElseThrow(() ->
                        new NotFoundException(
                                "User not found with id: " + id
                        )
                );
    }

    @Override
    public User findByKeycloakId(String keycloakId) {

        return repository.findByKeycloakId(keycloakId)
                .orElseThrow(() ->
                        new NotFoundException(
                                "User not found with keycloak id: "
                                        + keycloakId
                        )
                );
    }

    /*
    @Override
    public User findByEmail(String email) {

        return repository.findByEmail(email)
                .orElseThrow(() ->
                        new NotFoundException(
                                "User not found with email: " + email
                        )
                );
    }
     */

    @Override
    public List<User> findAll() {

        return repository.findAll();
    }

    @Override
    public boolean existsByKeycloakId(String keycloakId) {

        return repository.existsByKeycloakId(keycloakId);
    }

    /*
    @Override
    public boolean existsByEmail(String email) {

        return repository.existsByEmail(email);
    }
    */


    @Override
    public void delete(UUID id) {

        User user = repository.findById(id)
                .orElseThrow(() ->
                        new NotFoundException(
                                "User not found with id: " + id
                        )
                );

        repository.delete(user);
    }
}
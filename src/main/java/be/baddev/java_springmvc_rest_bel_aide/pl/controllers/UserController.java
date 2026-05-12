package be.baddev.java_springmvc_rest_bel_aide.pl.controllers;

import be.baddev.java_springmvc_rest_bel_aide.bll.mappers.user.UserMapper;
import be.baddev.java_springmvc_rest_bel_aide.bll.services.user.interfaces.UserService;
import be.baddev.java_springmvc_rest_bel_aide.dal.entities.user.User;
import be.baddev.java_springmvc_rest_bel_aide.pl.dtos.user.in.UserCreateForm;
import be.baddev.java_springmvc_rest_bel_aide.pl.dtos.user.in.UserUpdateForm;
import be.baddev.java_springmvc_rest_bel_aide.pl.dtos.user.out.UserDetailsOut;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
@Tag(
        name = "Users",
        description = "User management endpoints"
)
public class UserController {

    private final UserService userService;
    private final UserMapper userMapper;

    /**
     * Creates the business user after Keycloak registration.
     */
    @Operation(
            summary = "Register business user",
            description = "Creates the application user linked to Keycloak account"
    )
    @PreAuthorize("hasRole('user')")
    @PostMapping("/register")
    public ResponseEntity<Void> register(
            @AuthenticationPrincipal Jwt jwt,
            @Valid @RequestBody UserCreateForm dto
    ) {

        String keycloakId = jwt.getSubject();

        User user = userMapper.UserCreateFormToUserEntityMapper(dto);

        user.setKeycloakId(keycloakId);

        userService.register(user);

        return ResponseEntity.ok().build();
    }

    /**
     * Retrieves current authenticated user profile.
     */
    @Operation(
            summary = "Get current user profile",
            description = "Retrieves authenticated user profile"
    )
    @PreAuthorize("hasRole('user')")
    @GetMapping("/me")
    public ResponseEntity<UserDetailsOut> me(
            @AuthenticationPrincipal Jwt jwt
    ) {

        String keycloakId = jwt.getSubject();

        User user = userService.findByKeycloakId(keycloakId);

        return ResponseEntity.ok(
                userMapper.UserEntityToUserDetailsOutMapper(user)
        );
    }

    /**
     * Updates current authenticated user profile.
     */
    @Operation(
            summary = "Update current user profile",
            description = "Updates authenticated user profile"
    )
    @PreAuthorize("hasRole('user')")
    @PutMapping("/me")
    public ResponseEntity<Void> update(
            @AuthenticationPrincipal Jwt jwt,
            @Valid @RequestBody UserUpdateForm dto
    ) {

        String keycloakId = jwt.getSubject();

        User existingUser = userService.findByKeycloakId(keycloakId);

        userMapper.UserUpdateFormToUserEntityMapper(
                dto,
                existingUser
        );

        userService.update(existingUser);

        return ResponseEntity.noContent().build();
    }
}
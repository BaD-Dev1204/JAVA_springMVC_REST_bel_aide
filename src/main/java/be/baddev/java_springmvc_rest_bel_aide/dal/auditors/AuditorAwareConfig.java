package be.baddev.java_springmvc_rest_bel_aide.dal.auditors;

import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.UUID;

@Component
public class AuditorAwareConfig implements AuditorAware<UUID> {

    @Override
    public Optional<UUID> getCurrentAuditor() {

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        if (authentication == null || !authentication.isAuthenticated()) {
            return Optional.empty();
        }

        Object principal = authentication.getPrincipal();

        // 🔐 Cas Keycloak JWT
        if (principal instanceof Jwt jwt) {
            String keycloakId = jwt.getSubject(); // "sub"

            try {
                return Optional.of(UUID.fromString(keycloakId));
            } catch (Exception e) {
                return Optional.empty();
            }
        }

        return Optional.empty();
    }
}
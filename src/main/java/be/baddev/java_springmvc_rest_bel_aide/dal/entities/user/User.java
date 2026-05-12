package be.baddev.java_springmvc_rest_bel_aide.dal.entities.user;

import be.baddev.java_springmvc_rest_bel_aide.dal.entities.bases.BaseEntity;
import be.baddev.java_springmvc_rest_bel_aide.dal.enums.post.PostMode;
import be.baddev.java_springmvc_rest_bel_aide.dal.enums.post.PostStatus;
import be.baddev.java_springmvc_rest_bel_aide.dal.enums.post.PostType;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "t_user")
@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class User extends BaseEntity{


    @Column(name = "keycloak_id", nullable = false, unique = true)
    @ToString.Include
    private String keycloakId;

    @Column(nullable = true, length = 150)
    @ToString.Include
    private String city;

    @Column(nullable = true, precision = 17, scale = 15)
    @ToString.Include
    private BigDecimal latitude;

    @Column(nullable = true, precision = 18, scale = 15)
    @ToString.Include
    private BigDecimal longitude;

}


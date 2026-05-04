package be.baddev.java_springmvc_rest_bel_aide.dal.entities.post;

import be.baddev.java_springmvc_rest_bel_aide.dal.entities.bases.BaseEntity;
import be.baddev.java_springmvc_rest_bel_aide.dal.enums.PostType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "t_post")
@Getter
@Setter
public class Post extends BaseEntity {

    @Column(nullable = false, length = 500)
    @ToString.Include
    private String title;

    @Column(nullable = false, length = 1000)
    @ToString.Include
    private String description;

    @Column(nullable = false, length = 100)
    @ToString.Include
    private String status;

    @Column(name = "is_visible", nullable = false)
    @ToString.Include
    private boolean isVisible;

    @Column(nullable = false, length = 150)
    @ToString.Include
    private String city;

    @Column(nullable = false, precision = 10, scale = 8)
    @ToString.Include
    private Double latitude;

    @Column(nullable = false, precision = 11, scale = 8)
    @ToString.Include
    private Double longitude;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 30)
    @ToString.Include
    private PostType type;
}

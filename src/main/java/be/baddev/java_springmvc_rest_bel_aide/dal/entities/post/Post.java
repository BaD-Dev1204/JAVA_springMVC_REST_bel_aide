package be.baddev.java_springmvc_rest_bel_aide.dal.entities.post;

import be.baddev.java_springmvc_rest_bel_aide.dal.entities.bases.BaseEntity;
import be.baddev.java_springmvc_rest_bel_aide.dal.enums.post.PostMode;
import be.baddev.java_springmvc_rest_bel_aide.dal.enums.post.PostStatus;
import be.baddev.java_springmvc_rest_bel_aide.dal.enums.post.PostType;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "t_post")
@Inheritance(strategy = InheritanceType.JOINED)
@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Post extends BaseEntity {

    @Column(nullable = false, length = 500)
    @ToString.Include
    private String title;

    @Column(nullable = false, length = 1000)
    @ToString.Include
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 50)
    @ToString.Include
    private PostStatus status;

    @Enumerated(EnumType.STRING)
    @Column(name = "post_type", nullable = false, length = 20)
    private PostType postType;

    @Enumerated(EnumType.STRING)
    @Column(name = "post_mode", nullable = false, length = 20)
    private PostMode postMode;

    @Column(nullable = true, length = 150)
    @ToString.Include
    private String city;

    @Column(nullable = true, precision = 17, scale = 15)
    @ToString.Include
    private BigDecimal latitude;

    @Column(nullable = true, precision = 18, scale = 15)
    @ToString.Include
    private BigDecimal longitude;

    public Post(
            String title,
            String description,
            PostStatus status,
            PostType type,
            PostMode mode,
            String city,
            BigDecimal latitude,
            BigDecimal longitude
    ) {
        this.title = title;
        this.description = description;
        this.status = status;
        this.postType = type;
        this.postMode = mode;
        this.city = city;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Post(String title, String description) {
        this.title = title;
        this.description = description;
    }

}

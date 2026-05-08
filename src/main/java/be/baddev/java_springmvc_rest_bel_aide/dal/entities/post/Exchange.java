package be.baddev.java_springmvc_rest_bel_aide.dal.entities.post;

import be.baddev.java_springmvc_rest_bel_aide.dal.enums.post.PostMode;
import be.baddev.java_springmvc_rest_bel_aide.dal.enums.post.PostStatus;
import be.baddev.java_springmvc_rest_bel_aide.dal.enums.post.PostType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "t_exchange")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Exchange extends Post {

    @Column(name = "is_flexible", nullable = false)
    @ToString.Include
    private boolean isFlexible;

    public Exchange(
            String title,
            String description,
            PostStatus status,
            PostType type,
            PostMode mode,
            String city,
            BigDecimal latitude,
            BigDecimal longitude,
            boolean isFlexible

    ) {
        super(title, description, status, type, mode, city, latitude, longitude);
        this.isFlexible = isFlexible;

    }
}

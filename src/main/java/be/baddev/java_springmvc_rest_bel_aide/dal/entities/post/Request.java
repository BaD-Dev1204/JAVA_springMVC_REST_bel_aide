package be.baddev.java_springmvc_rest_bel_aide.dal.entities.post;

import be.baddev.java_springmvc_rest_bel_aide.dal.enums.post.PostMode;
import be.baddev.java_springmvc_rest_bel_aide.dal.enums.post.PostStatus;
import be.baddev.java_springmvc_rest_bel_aide.dal.enums.post.PostType;
import be.baddev.java_springmvc_rest_bel_aide.dal.enums.post.RequestUrgencyLevel;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "t_request")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Request extends Post {

    @Enumerated(EnumType.STRING)
    @Column(name = "urgency_level", nullable = false, length = 20)
    @ToString.Include
    private RequestUrgencyLevel urgencyLevel;

    @Column(name = "needed_before", nullable = true)
    @ToString.Include
    private LocalDateTime neededBefore;

    public Request(
            String title,
            String description,
            PostStatus status,
            PostType type,
            PostMode mode,
            String city,
            BigDecimal latitude,
            BigDecimal longitude,

            RequestUrgencyLevel urgencyLevel,
            LocalDateTime neededBefore
    ) {
        super(title, description, status, type, mode, city, latitude, longitude);

        this.urgencyLevel = urgencyLevel;
        this.neededBefore = neededBefore;
    }

    public Request(String title, String description) {
        super(title, description);
    }
}

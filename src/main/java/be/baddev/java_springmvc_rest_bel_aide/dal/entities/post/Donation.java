package be.baddev.java_springmvc_rest_bel_aide.dal.entities.post;

import be.baddev.java_springmvc_rest_bel_aide.dal.enums.post.DonationCondition;
import be.baddev.java_springmvc_rest_bel_aide.dal.enums.post.PostMode;
import be.baddev.java_springmvc_rest_bel_aide.dal.enums.post.PostStatus;
import be.baddev.java_springmvc_rest_bel_aide.dal.enums.post.PostType;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "t_donation")
@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Donation extends Post {

    @Enumerated(EnumType.STRING)
    @Column(name = "item_condition", nullable = true, length = 150)
    @ToString.Include
    private DonationCondition itemCondition;

    @Column(name = "is_delivery_possible", nullable = true)
    @ToString.Include
    private boolean isDeliveryPossible;

    public Donation(
            String title,
            String description,
            PostStatus status,
            PostType type,
            PostMode mode,
            String city,
            BigDecimal latitude,
            BigDecimal longitude,

            DonationCondition itemCondition,
            boolean isDeliveryPossible
    ) {
        super(title, description, status, type, mode, city, latitude, longitude);

        this.itemCondition = itemCondition;
        this.isDeliveryPossible = isDeliveryPossible;
    }

    public Donation(String title, String description) {
        super(title, description);
    }

}
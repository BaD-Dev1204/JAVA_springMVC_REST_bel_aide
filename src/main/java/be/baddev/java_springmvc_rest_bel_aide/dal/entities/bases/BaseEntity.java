package be.baddev.java_springmvc_rest_bel_aide.dal.entities.bases;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.SoftDelete;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.UUID;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Setter
@Getter
@SoftDelete(columnName = "is_deleted")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString(onlyExplicitlyIncluded = true)
public abstract class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(nullable = false, updatable = false)
    @Setter(AccessLevel.NONE)
    @EqualsAndHashCode.Include
    @ToString.Include
    private UUID id;


    @CreatedDate
    @Column(nullable = false, updatable = false)
    @Setter(AccessLevel.NONE)
    @ToString.Include
    private LocalDateTime createdAt;

    @CreatedBy
    @Column(nullable = false, updatable = false)
    @Setter(AccessLevel.NONE)
    @ToString.Include
    private UUID createdBy;

    @LastModifiedDate
    @Column(nullable = false)
    @ToString.Include
    private LocalDateTime updatedAt;

    @LastModifiedBy
    @Column(nullable = false)
    @ToString.Include
    private UUID updatedBy;

}

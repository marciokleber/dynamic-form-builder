package com.github.marciokleber.dynamicformbuilder.domain;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Comment;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.Instant;

@Getter
@Setter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class AbstractAuditEntity {

    /** Reference:
     * https://www.baeldung.com/database-auditing-jpa
     */

    @CreatedDate
    @Column(name = "created_at", updatable = false)
    @Comment("Column represents the creation date")
    private Instant createdAt;

    @LastModifiedDate
    @Column(name = "updated_at")
    @Comment("Column represents the date of last update")
    private Instant updatedAt;
}

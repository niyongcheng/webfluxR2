package com.herbalife.is.webfluxdemo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;

@Table("OrderHeader")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderHeaderEntity {

    @Id
    private Integer id;

    private String name;
    private String code;
    private Integer quantity;

    @Builder.Default
    @Column("createdOn")
    private LocalDateTime createdOn = LocalDateTime.now();

    @Builder.Default
    @Column("updatedOn")
    private LocalDateTime updatedOn = LocalDateTime.now();
}

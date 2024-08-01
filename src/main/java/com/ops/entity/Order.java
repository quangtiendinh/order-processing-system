package com.ops.entity;

import com.ops.enums.OrderStatus;
import com.ops.enums.OrderType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table
@Getter
@Setter
public class Order extends BaseEntity {
    @Id
    private Long id;
    @Enumerated(EnumType.STRING)
    private OrderType orderType;
    @Enumerated(EnumType.STRING)
    private OrderStatus status;
    private Date createdAt;
    private Date updatedAt;
}

package org.example.research.domain.model.order;


import lombok.Getter;

/**
 * @author chenlr42044
 * @description: todo
 * @date 2025-09-15 16:12
 */
@Getter
public class OrderId {

    public final Long orderId;

    public OrderId(Long orderId) {
        this.orderId = orderId;
    }

}

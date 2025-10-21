package org.example.research.domain.model.order;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

/**
 * @author chenlr42044
 * @description: todo
 * @date 2025-09-15 15:38
 */
@Entity
public class Order {

    @Id
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}

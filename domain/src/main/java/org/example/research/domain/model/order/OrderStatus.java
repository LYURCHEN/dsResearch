package org.example.research.domain.model.order;

public enum OrderStatus {
    CREATED(1, "Created"),
    APPROVED(2, "Approved"),
    REJECTED(3, "Rejected"),;

    private final Integer value;

    private final String description;

    OrderStatus(Integer value, String description) {
        this.value = value;
        this.description = description;
    }
    public Integer getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }
}

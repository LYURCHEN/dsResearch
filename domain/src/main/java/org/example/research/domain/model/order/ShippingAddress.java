package org.example.research.domain.model.order;


/**
 * @author chenlr42044
 * @description: todo
 * @date 2025-09-15 16:55
 */
public class ShippingAddress {

    private final String recipientName;

    private final String phone;

    private final String province;

    private final String city;

    private final String district;

    private final String details;


    public ShippingAddress(String recipientName,String phone,
                           String province, String city, String district, String details) {
        if (recipientName == null || recipientName.trim().isEmpty()) {
            throw new IllegalArgumentException("recipientName is null or empty");
        }
        this.recipientName = recipientName;
        if (phone == null || !phone.matches("^1[3-9]\\d{9}$")) {
            throw new IllegalArgumentException("phone is null or incorrect format");
        }
        this.phone = phone;
        if (province == null || province.isBlank()) {
            throw new IllegalArgumentException("province is null or empty");
        }
        this.province = province;
        if (city == null || city.isBlank()) {
            throw new IllegalArgumentException("city is null or empty");
        }
        this.city = city;
        this.district = district;
        if (details == null || details.isBlank()) {
            throw new IllegalArgumentException("details is null or empty");
        }
        this.details = details;
    }


    public String getFullAddress() {
        return province + city + (district == null ? district : "") + details;
    }

}

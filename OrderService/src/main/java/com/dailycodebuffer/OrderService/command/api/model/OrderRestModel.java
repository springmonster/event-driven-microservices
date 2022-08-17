package com.dailycodebuffer.OrderService.command.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Request Body
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderRestModel {
    private String productId;
    private String userId;
    private String addressId;
    private Integer quantity;
}

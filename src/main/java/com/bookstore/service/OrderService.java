package com.bookstore.service;

import com.bookstore.model.*;

public interface OrderService {
    Order createOrder(ShoppingCart shoppingCart,
                      ShippingAddress shippingAddress,
                      BillingAddress billingAddress,
                      Payment payment,
                      String shippingMehod,
                      User user);

    Order findOne(Long id);
}

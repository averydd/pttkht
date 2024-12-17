package com.onlinebookstore.controllers;

import java.util.List;

public class OrderController extends BaseController {
    public void placeOrder(List<String> bookTitles, String creditCardNumber) {
        if (isLoggedIn && "customer".equals(currentUserRole)) {
            System.out.println("Order placed successfully for books: " + bookTitles);
        } else {
            System.out.println("Log in as a customer to place an order.");
        }
    }

    public void cancelOrder(int orderId) {
        if (isLoggedIn) {
            System.out.println("Order cancelled: " + orderId);
        } else {
            System.out.println("Log in to cancel orders");
        }
    }
}

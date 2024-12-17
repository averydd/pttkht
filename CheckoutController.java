package com.onlinebookstore.controllers;

public class CheckoutController extends BaseController {
    public void checkout(String creditCardNumber) {
        // Logic to perform checkout process
        System.out.println("Processing checkout with credit card ending in: " + creditCardNumber.substring(creditCardNumber.length() - 4));
    }
}

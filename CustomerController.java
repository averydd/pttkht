package com.onlinebookstore.controllers;

public class CustomerController extends BaseController {
    public void viewOrderHistory() {
        if (isLoggedIn) {
            System.out.println("Displaying order history for user");
        } else {
            System.out.println("Log in to view order history");
        }
    }

    public void viewProfile() {
        if (isLoggedIn) {
            System.out.println("Displaying profile for user");
        } else {
            System.out.println("Log in to view order history");
        }
    }
}

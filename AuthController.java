package com.onlinebookstore.controllers;

public class AuthController extends BaseController {
    public String username;
    public String password;

    public void register(String username, String password, String email, String phoneNumber) {
        // Registration logic for customer (non-member or member)
        System.out.println("User registered: " + username);
    }

    public boolean login(String username, String password) {
        // Validate credentials and log user in
        this.isLoggedIn = true;
        this.currentUserRole = username.equals("admin") ? "admin" : "customer";
        System.out.println("User logged in: " + username);
        return isLoggedIn;
    }

    @Override
    public void logout() {
        super.logout();
        System.out.println("User logged out");
    }
}
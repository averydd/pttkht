package com.onlinebookstore.controllers;

public class BaseController {
    protected boolean isLoggedIn = false;
    protected String currentUserRole = "guest"; // "customer" or "admin"
    
    public boolean isAuthenticated() {
        return isLoggedIn;
    }
    
    public boolean isAdmin() {
        return "admin".equals(currentUserRole);
    }
    
    public void logout() {
        isLoggedIn = false;
        currentUserRole = "guest";
    }
}
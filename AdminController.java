package com.onlinebookstore.controllers;

public class AdminController extends BaseController {
    public void updateStock(String bookTitle, int newQuantity) {
        if (isAdmin()) {
            System.out.println("Stock updated for " + bookTitle + " to " + newQuantity);
        } else {
            System.out.println("Access denied: Admin privileges required.");
        }
    }

    public void changeBookPrice(String bookTitle, double newPrice) {
        if (isAdmin()) {
            System.out.println("Price updated for " + bookTitle + " to $" + newPrice);
        } else {
            System.out.println("Access denied: Admin privileges required.");
        }
    }

    public void viewTransactionLogs() {
        if (isAdmin()) {
            System.out.println("Displaying all transaction logs");
        } else {
            System.out.println("Access denied: Admin privileges required.");
        }
    }
}
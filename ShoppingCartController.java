package com.onlinebookstore.controllers;

import java.util.List;

public class ShoppingCartController extends BaseController {
    public class CartItem {
        public String title;
        public int quantity;
    }

    public List<CartItem> cartItems;

    public void addToCart(String bookTitle, int quantity) {
        // Add a book to the shopping cart
        System.out.println(quantity + " x " + bookTitle + " added to cart.");
    }

    public void viewCart() {
        // Display cart contents
        System.out.println("Viewing cart contents");
    }

    public void removeFromCart(String bookTitle) {
        // Remove a book from the cart
        System.out.println("Removed book from cart: " + bookTitle);
    }

    public void clearCart() {
        // Clear the shopping cart
        System.out.println("Cart cleared");
    }
}
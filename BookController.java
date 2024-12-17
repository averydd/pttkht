package com.onlinebookstore.controllers;
import java.util.List;

public class BookController extends BaseController {
    public class Book {
        public String title;
        public String author;
        public int publishYear;
        public double price;
        public int quantity;
    }

    public List<Book> bookList;

    public void listBooks(String sortBy) {
        // List books sorted by title, author, price, etc.
        System.out.println("Books listed by: " + sortBy);
    }

    public void viewBookDetails(String title) {
        // Display book details
        System.out.println("Viewing book details: " + title);
    }
}
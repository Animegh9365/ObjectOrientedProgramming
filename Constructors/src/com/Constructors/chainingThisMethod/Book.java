package com.Constructors.chainingThisMethod;

public class Book {
	String title;
    String author;
    int year;

    // Constructor to initialize the Book with all details
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        System.out.println("Creating Book: " + this.title + ", " + this.author + ", " + this.year);
    }

    // Constructor to initialize the Book with title and author, defaults year
    public Book(String title, String author) {
        this(title, author, 2020);  // Chaining to main constructor with a default year
    }

    // Default constructor
    public Book() {
        this("Unknown Title", "Unknown Author");  // Chaining to constructor with two parameters
    }
}

package com.netcracker.book;

import java.util.Arrays;
import java.util.Objects;

public class Book {

    private String name;
    private Author[] authors;
    private double price;
    int qty = 0;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }


    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getAuthorNames() {
        return Arrays.toString(authors);
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", authors=" + Arrays.toString(authors) +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (!(o instanceof Book)) return false;

        Book book = (Book) o;
        return book.qty == this.qty && book.name.equals(this.name) && book.price == this.price && book.authors.equals(this.authors);

    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 31 * result + qty;
        result = 31 * result + (int) price;
        result = 31 * result + name.hashCode();
        result = 31 * result + Arrays.hashCode(authors);
        return result;
    }
}

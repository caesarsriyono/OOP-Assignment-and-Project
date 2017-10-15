/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BookandAuthor;

import java.util.Arrays;

/**
 *
 * @author caesar
 */
public class Book {
    String name;
    Author[] authors;
    double price;
    int qty;

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
    
 /*
    public String getAuthorsName(){
         return authors.getName();
      // cannot use author.name as name is private in Author class
}
    public String getAuthorsEmail(){
        return authors.getEmail();
    }
    
    public char getAuthorsGender(){
        return authors.getGender();
    }
    */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author[] getAuthor() {
        return authors;
    }

    public void setAuthor(Author[] authors) {
        this.authors = authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book{" + "name=" + name + ", authors=" + Arrays.toString(authors) + ", price=" + price + ", qty=" + qty + '}';
    }

   
    
    
           
}

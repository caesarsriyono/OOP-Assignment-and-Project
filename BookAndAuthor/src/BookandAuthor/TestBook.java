/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BookandAuthor;

/**
 *
 * @author caesar
 */
public class TestBook {
    public static void main(String[]args){
        
    // Declare and allocate an array of Authors
Author[] authors = new Author[2];
authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');
 
// Declare and allocate a Book instance
Book javaDummy = new Book("Java for Dummy", authors, 19.99, 99);
System.out.println(javaDummy);  // toString()
 /*   // Construct an author instance
Authors ahTeck = new Authors("Tan Ah Teck", "ahteck@nowhere.com", 'M');
System.out.println(ahTeck);  // Author's toString()

Authors Jude = new Authors("Jude Martinez", "Jude@gmail.com", 'M');
System.out.println(Jude);  // Author's toString()
 
Book dummyBook = new Book("Java for dummy", ahTeck, 19.95, 99);  // Test Book's Constructor
System.out.println(dummyBook);  // Test Book's toString()

Book aBook = new Book("Object Oriented Programming", Jude, 22.20, 81); //book new
System.out.println(aBook);

// Test Getters and Setters
dummyBook.setPrice(29.95);
dummyBook.setQty(28);
System.out.println("name is: " + dummyBook.getName());
System.out.println("price is: " + dummyBook.getPrice());
System.out.println("qty is: " + dummyBook.getQty());
System.out.println("Author is: " + dummyBook.getAuthor());  // Author's toString()
System.out.println("Author's name is: " + dummyBook.getAuthor().getName());
System.out.println("Author's email is: " + dummyBook.getAuthor().getEmail());

aBook.setPrice(22.20);
aBook.setQty(1);
System.out.println("name is: " + aBook.getName());
System.out.println("price is: " + aBook.getPrice());
System.out.println("qty is: " + aBook.getQty());
System.out.println("Author is: " + aBook.getAuthor());  // Author's toString()
System.out.println("Author's name is: " + aBook.getAuthorName());
System.out.println("Author's email is: " + aBook.getAuthorEmail());
System.out.println("Author's gender is: " + aBook.getAuthorGender());
*/
    }
}

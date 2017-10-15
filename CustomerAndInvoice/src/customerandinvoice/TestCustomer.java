/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customerandinvoice;

/**
 *
 * @author caesar
 */
public class TestCustomer {
     public static void main(String[]args){
         
        Customer cust1 = new Customer(001, "Jude Martinez", 10, 'M'); // test the constructor
        System.out.println(cust1); //test toString
        System.out.println("Customer " + cust1.getName() + " (" + cust1.getGender() + ") " + " with ID number #" + cust1.getID() + " has " + cust1.getDiscount() + "% discount for every purchase");
        
     }
}

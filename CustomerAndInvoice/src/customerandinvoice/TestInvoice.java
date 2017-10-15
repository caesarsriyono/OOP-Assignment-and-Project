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
public class TestInvoice {
      public static void main(String[]args){
          
        Customer Jude = new Customer(001 ,"Jude Martinez", 10, 'M');
        Invoice invoice1 = new Invoice(001, Jude, 150.5 ); // test the constructor
        System.out.println(invoice1); //test toString
        
        System.out.println("The Customer name is: " + Jude.getName());     // Test getter
        System.out.println("ID number:" + Jude.getID() + " with invoice number of #" + invoice1.getID());   // Test getID
        System.out.println("The amount needed to be paid is $" + invoice1.getAmount());   // Test getAmount
        System.out.println("This customer has a discount of " + Jude.getDiscount() + "%");   // Test getDiscount
        System.out.println("New amount needed to be paid after discount is " + invoice1.GetAmountAfterDiscount());   // Test getAmountAfterDiscount
        
        
        
      }
    
}

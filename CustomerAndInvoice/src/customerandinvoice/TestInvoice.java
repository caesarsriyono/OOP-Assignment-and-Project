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
          
        Customer Jude = new Customer(1 ,"Jude", 15);
        Invoice invoice1 = new Invoice(2, Jude, 150.5 ); // test the constructor
        System.out.println(invoice1); //test toString
      }
    
}

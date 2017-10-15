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
public class TestAccount {
     public static void main(String[]args){
         
         Customer Jude = new Customer(001 ,"Jude Martinez", 10, 'M');
         Account account = new Account(1, Jude, 10.22 );
         System.out.println(account);
     }
}

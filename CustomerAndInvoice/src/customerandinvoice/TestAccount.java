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
         Account account = new Account(1, Jude, 1220.22 );
         System.out.println(account);
         
        System.out.println("The Customer name is: " + account.getCustomerName());     // Test getCustomerName
        System.out.println("ID number: " + account.getId()+ " has a balance of $" + account.getBalance());   // Test getid and getBalance
        
        System.out.println("User withdraw $1500");
        account.withdraw(1500.0); //test withdraw
        
       
        System.out.println("User Withdraws $1000");
        account.withdraw(1000.0); //test withdraw
        System.out.println("Balance after withdrawal is now $" + account.getBalance());
        
        
        System.out.println("User Deposits $2000.10");
        account.deposit(2000.10); //test deposit
        System.out.println("Balance after deposit is now $" + account.getBalance());
                
        
     }
}

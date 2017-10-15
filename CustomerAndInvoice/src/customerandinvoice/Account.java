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
public class Account {
    
  //instance variable
    int id;
    Customer customer;
    double balance;

    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
     
    
    @Override
    public String toString() {
        return "Customer{" + "name=" + customer.name+ ", id=" + customer.ID + ", balance=" + balance + '}';
       
    }
    
    public String getCustomerName(){
        return customer.name;
    }
    
     public void deposit(double amount)
    {
        balance += amount;
    }
     
       public void withdraw(double amount)
    {
        if (balance >= amount){
        balance -= amount;}
        else {System.out.println("amount withdrawn exceeds the current balance!");
         
    }
        
}
}
    


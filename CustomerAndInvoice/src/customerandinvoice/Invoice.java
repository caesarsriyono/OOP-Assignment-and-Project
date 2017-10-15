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
public class Invoice {
    
  //instance variable
    
    private int ID;
    private Customer Customer;
    private double Amount;

    public Invoice(int ID, Customer Customer, double Amount) {
        this.ID = ID;
        this.Customer = Customer;
        this.Amount = Amount;
    }

    public int getID() {
        return ID;
    }

    public Customer getCustomer() {
        return Customer;
    }

    public void setCustomer(Customer Customer) {
        this.Customer = Customer;
    }

    public double getAmount() {
        return Amount;
    }

    public void setAmount(double Amount) {
        this.Amount = Amount;
    }
    
    public String getCustomerName(){
        return Customer.name;
    }
    
    public double GetAmountAfterDiscount(){
        return Amount - (Customer.discount * Amount) / 100;
    
    }
}

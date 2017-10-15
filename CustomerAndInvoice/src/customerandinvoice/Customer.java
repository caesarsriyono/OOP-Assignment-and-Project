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
public class Customer {
    //instance variable
    int ID;
    String name;
    int discount;
    char gender;

    public Customer(int ID, String name, int discount, char gender) {
        this.ID = ID;
        this.name = name;
        this.discount = discount;
        this.gender = gender;
    }
    

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public int getDiscount() {
        return discount;
    }
    
     public char getGender() {
        return gender;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Customer{" + "ID=" + ID + ", name=" + name + '}';
    }

  
}

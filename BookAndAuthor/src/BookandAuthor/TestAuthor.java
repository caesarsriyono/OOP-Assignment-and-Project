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
public class TestAuthor{
    
    public static void main(String[] args){
        
    Author ahTeck;
        ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
    
    //System.out.println(ahTeck);  // Test toString()
    
    //ahTeck.setEmail("paulTannowherecom");  // Test setter

System.out.println("name is: " + ahTeck.getName());     // Test getter
System.out.println("email is: " + ahTeck.getEmail());   // Test getter
System.out.println("gender is: " + ahTeck.getGender()); // Test gExerciseOOP_MyPolynomial.pngetter

    }
    
}

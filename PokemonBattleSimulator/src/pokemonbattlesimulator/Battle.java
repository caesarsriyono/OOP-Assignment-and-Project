/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonbattlesimulator;
import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author ASUS1
 */
public class Battle {

    
     public static void main(String[] args){
    
        
         //Insert player name
    Scanner tName = new Scanner(System.in);
System.out.println("What is your name, Trainer?");
    String tNameString= tName.nextLine();
    
    
    System.out.print("Get ready for battle Trainer ");
System.out.println(tNameString);

     Scanner tPokemon = new Scanner(System.in);
System.out.println("Choose a Pokemon : \n" +"1) Chimcar\n" +"2) Piplup\n" +"3) Turtwig");

        int typePokemon= tPokemon.nextInt();
             
        Pokemon MyPokemon = new Pokemon();
        
         switch (typePokemon) {
             case 1:
             {
                     MyPokemon.setPokeName("Chimcar"); 
                     MyPokemon.setLevel(5);
                     MyPokemon.setHealth(20);
                     MyPokemon.setAttack(10);
                     MyPokemon.setDefense(10);
                     MyPokemon.setSattack(12);
                     MyPokemon.setSdefense(10);
                     MyPokemon.setSpeed(12);
                     break;
             }
                 
             case 2:
             {
                  MyPokemon.setPokeName("Piplup");
                  MyPokemon.setLevel(5);
                     MyPokemon.setHealth(21);
                     MyPokemon.setAttack(11);
                     MyPokemon.setDefense(11);
                     MyPokemon.setSattack(12);
                     MyPokemon.setSdefense(12);
                     MyPokemon.setSpeed(10);
                  break;
             }
                     
                     
             case 3:
             {
                 MyPokemon.setPokeName("Turtwig");
                 MyPokemon.setLevel(5);
                     MyPokemon.setHealth(22);
                     MyPokemon.setAttack(13);
                     MyPokemon.setDefense(12);
                     MyPokemon.setSattack(11);
                     MyPokemon.setSdefense(12);
                     MyPokemon.setSpeed(9);
                     break;
             }
             default:
                 break;
                
     }
                
        System.out.println("Trainer "+tNameString+" chose "+MyPokemon.getPokeName());
        
    

        Pokemon ePokemon = new Pokemon();
        
    Random random = new Random();
    int randomNumberEnemy = random.nextInt(2);
    if(randomNumberEnemy==0){
       ePokemon.setPokeName("Starly"); 
       ePokemon.setLevel(5);
                     ePokemon.setHealth(14);
                     ePokemon.setAttack(7);
                     ePokemon.setDefense(6);
                     ePokemon.setSattack(6);
                     ePokemon.setSdefense(6);
                     ePokemon.setSpeed(8);
    }else{
       ePokemon.setPokeName("TrashDove");
       ePokemon.setLevel(6);
                     ePokemon.setHealth(25);
                     ePokemon.setAttack(3);
                     ePokemon.setDefense(15);
                     ePokemon.setSattack(5);
                     ePokemon.setSdefense(20);
                     ePokemon.setSpeed(8);
}
    
System.out.println("Walking around.......");
System.out.println("Whoa! a wild "+ePokemon.getPokeName()+" appeared!");
  
}}

    


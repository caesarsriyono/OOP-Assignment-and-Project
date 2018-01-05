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
 * @author Caesar
 */ 
public class Battle {
public static void makeMove(Moves pokeMove, Pokemon attPokemon, Pokemon targetPokemon){
   int[] stage_multiplier = {2/8,2/7,2/6,2/5,2/4,2/3,2/2,3/2,4/2,5/2,6/2,7/2,8/2};   
    if (pokeMove.getMoveType() == 0){  
        
       float h1 = attPokemon.getHealth();
       float h2 = targetPokemon.getHealth();
       
    // Print Initial Stats
         System.out.println("==================================== \n"
                + "Status :\n"+ targetPokemon.getPokeName() +" Lv "+ (int) targetPokemon.getLevel()+
                " HP " + (int)targetPokemon.getHealth() + "/"+(int)h2 +
                " \n"+ attPokemon.getPokeName() +" Lv "+ (int)attPokemon.getLevel()+
                " HP " + (int)attPokemon.getHealth() +  "/" +(int)h1 +
         " \n====================================");
         
    //MoveDamage Algorithm
       pokeMove.MoveDamage = (int) Math.round(
               (((2*attPokemon.getLevel()+10)/250)*
               (attPokemon.getAttack()/targetPokemon.getDefense())*
               pokeMove.getMoveDamage()+2)*
               stage_multiplier[attPokemon.getStage()]
               );   
                targetPokemon.setHealth((int) (targetPokemon.getHealth() - pokeMove.MoveDamage));
  
                
    //Print MoveName and MoveDamage            
        System.out.println(attPokemon.getPokeName()+" use "+pokeMove.getMoveName()+"!");
        System.out.println(attPokemon.getPokeName()+ " attack hit " +pokeMove.getMoveDamage()+ " damages");
           
    
     // Print After Damage Stats
         System.out.println("==================================== \n"
                + "Status :\n"+ targetPokemon.getPokeName() +" Lv "+ (int) targetPokemon.getLevel()+
                " HP " + (int)targetPokemon.getHealth() + "/"+(int)h2 +
                " \n"+ attPokemon.getPokeName() +" Lv "+ (int)attPokemon.getLevel()+
                " HP " + (int)attPokemon.getHealth() +  "/" +(int)h1 +
         " \n====================================");
    }
    //Lower Enemy Defense Stage Modifier Move
           else 
     if (pokeMove.getMoveType() == 1)  {
         
    //print MoveName and Move effect     
         System.out.println(attPokemon.getPokeName()+" use "+pokeMove.getMoveName()+"!");
         System.out.println(targetPokemon.getPokeName()+ " stage is " +targetPokemon.getStage());
         targetPokemon.setStage(targetPokemon.getStage()-1);
         
         targetPokemon.setDefense(stage_multiplier[targetPokemon.getStage()] * targetPokemon.getDefense());
         
         System.out.println(targetPokemon.getDefense());
                 }
     //Lower Enemy Attack Stage Modifier Move
           else
     if (pokeMove.getMoveType() == 2) {
        
     } 
}
    //Main method
     public static void main(String[] args){ 
     
        
    //Insert player name
    Scanner tName = new Scanner(System.in);
System.out.println("What is your name, Trainer?");
    String tNameString= tName.nextLine();
    
   //dialogue
    System.out.print("Get ready for battle Trainer ");
System.out.println(tNameString);

   //choose trainer pokemon
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
                     MyPokemon.setStage(6);
                     MyPokemon.setMove1(new Moves("Scratch",40,0));
                     MyPokemon.setMove2(new Moves("Leer",0,1));
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
                     MyPokemon.setStage(6);
                     MyPokemon.setMove1(new Moves("Pound",40,0));
                     MyPokemon.setMove2(new Moves("Growl",0,2));

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
                     MyPokemon.setStage(6);
                     MyPokemon.setMove1(new Moves("Scratch",40,0));
                     MyPokemon.setMove2(new Moves("Withdraw",0,3));
                     break;
             }
             default:
                 break;
                
     }
                
      
        
    

        Pokemon ePokemon = new Pokemon(); //declare enemy pokemon
    
    //randomize enemy pokemon
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
                     ePokemon.setStage(6);
                     ePokemon.setMove1(new Moves("Tackle",40,0));
                  
                    
    }else{
                     ePokemon.setPokeName("TrashDove");
                     ePokemon.setLevel(6);
                     ePokemon.setHealth(25);
                     ePokemon.setAttack(3);
                     ePokemon.setDefense(15);
                     ePokemon.setSattack(5);
                     ePokemon.setSdefense(20);
                     ePokemon.setSpeed(8);
                     ePokemon.setStage(6);
                     ePokemon.setMove1(new Moves("Peck",40,0));
                     ePokemon.setMove2(new Moves("Head Banging",0,0));
                    
                     
}
    
    
    
System.out.println("Walking around......."); //dialogue
System.out.println("Whoa! a wild "+ePokemon.getPokeName()+" appeared!");//dialogue
System.out.println("I choose you! "+MyPokemon.getPokeName());


        if(MyPokemon.getSpeed()>ePokemon.getSpeed()){
             Scanner MyMove = new Scanner(System.in);
             System.out.println("Choose your move : \n" +"1) "+ MyPokemon.move1.getMoveName()+"\n"+"2) "+ MyPokemon.move2.getMoveName());
              
             int moveChoice = MyMove.nextInt();
        if (moveChoice == 1){
                makeMove(MyPokemon.move1, MyPokemon, ePokemon);}
        else if(moveChoice == 2){
                makeMove(MyPokemon.move2, MyPokemon, ePokemon);
                     }
             
       
       
                                                     }
     }
}
     
     
    


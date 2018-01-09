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
    public static int round;
    public static float h1;
    public static float h2;
    
    //create MakeMove function
public static void makeMove(Moves pokeMove, Pokemon attPokemon,
        Pokemon targetPokemon){
   float[] stage_multiplier =
   {0.25f,0.28f,0.3f,0.4f,0.5f,0.6f,1,1.5f,2,2.5f,3,3.5f,4};
   
    if (pokeMove.getMoveType() == 0){  
        
        if(round == 1)
        {
            h1 = attPokemon.getHealth();
            h2 = targetPokemon.getHealth();
            round = 0;
        }
      
    //MoveDamage Algorithm
       pokeMove.MoveDamage = (int)(
               (((2*attPokemon.getLevel()+10)/250)*
               (attPokemon.getAttack()/targetPokemon.getDefense())*
                    pokeMove.getMoveDamage()+2)*
               stage_multiplier[attPokemon.getAttackStage()] );   
       
                    targetPokemon.setHealth((int) (targetPokemon.getHealth()
                        - pokeMove.MoveDamage));
  
                
    //Print MoveName and MoveDamage            
            System.out.println(attPokemon.getPokeName()+
                    " uses "+pokeMove.getMoveName()+"!");
            System.out.println(attPokemon.getPokeName()+
                    " attack hit "+pokeMove.getMoveDamage()+ " damage");
           
    
     // Print After Damage Stats
            System.out.println("==================================== \n"+
                "Status :\n"+targetPokemon.getPokeName()+" Lv "+
                    (int) targetPokemon.getLevel()+
                " HP " + (int) targetPokemon.getHealth()+ "/"+(int)h2 +
                " \n"+attPokemon.getPokeName()+" Lv "+
                    (int )attPokemon.getLevel()+
                " HP "+(int) attPokemon.getHealth()+ "/" +(int)h1 +
         " \n====================================");
    }


    //Lower Enemy Defense Stage Modifier Move
    else if (pokeMove.getMoveType()==1)  {
         
          //handler to prevent defense stage to be reduced below stage 0          
          if(targetPokemon.getDefenseStage()==0){
              
            System.out.println(attPokemon.getPokeName()+" uses "+
                   pokeMove.getMoveName()+"!");
            //print cannot decrease defense level
             System.out.println(targetPokemon.getPokeName()+
                     " defense level is already at its lowest,"
                             + " so the attack doesnt have any effect");      
          }
          
             else{
           System.out.println(attPokemon.getPokeName()+" uses "+
                   pokeMove.getMoveName()+"!");                
                   targetPokemon.setDefenseStage(targetPokemon.getDefenseStage()-1);
                   
           System.out.println(targetPokemon.getPokeName()+" defense is " +
                   (int)targetPokemon.getDefense());      
           
           System.out.println(targetPokemon.getPokeName()+" defense stage is reduced to " +
                   targetPokemon.getDefenseStage());   
                   //reduce defense
                   targetPokemon.setDefense(stage_multiplier[targetPokemon.getDefenseStage()]* 
                   targetPokemon.getBaseDefense());        
                   
           System.out.println(targetPokemon.getPokeName()+
                   " defense is reduced to "+(int)targetPokemon.getDefense());}
          }
    
    
    
    
                 
     
     //Lower Enemy Attack Stage Modifier Move
    else if (pokeMove.getMoveType() == 2) {
         //handler to prevent defense stage to be reduced below stage 0  
            if(targetPokemon.getAttackStage()==0){
               
            System.out.println(attPokemon.getPokeName()+" uses "+
                   pokeMove.getMoveName()+"!");    
            //print cannot decrease attack level
             System.out.println(targetPokemon.getPokeName()+
                     " attack level is already at its lowest,"
                             + " so the attack doesnt have any effect");      
          }
          
             else{
           System.out.println(attPokemon.getPokeName()+" uses "+
                   pokeMove.getMoveName()+"!");                
                   targetPokemon.setAttackStage(targetPokemon.getAttackStage()-1);          
           System.out.println(targetPokemon.getPokeName()+" attack is "+
                    targetPokemon.getAttack()); 
           
           System.out.println(targetPokemon.getPokeName()+" attack stage is " +
                   targetPokemon.getAttackStage()); 
            //lower attack stage
                   targetPokemon.setAttack(stage_multiplier[targetPokemon.getAttackStage()]* 
                   targetPokemon.getAttack());      
           
           System.out.println(targetPokemon.getPokeName()+
                   " attack is reduced to "+(int)targetPokemon.getAttack());       
            } 
        }
             
     
             
     //Raise Self Defense Stage Modifier Move
             else if (pokeMove.getMoveType() == 3) {
         
         System.out.println(attPokemon.getPokeName()+" uses "+
                 pokeMove.getMoveName()+"!");                
                 targetPokemon.setStage(attPokemon.getStage()+1);          
         System.out.println(attPokemon.getPokeName()+" defense is " +
                 (int)targetPokemon.getDefense());         
         targetPokemon.setDefense(stage_multiplier[targetPokemon.getStage()]*
                 targetPokemon.getDefense());        
         System.out.println(targetPokemon.getPokeName()+ " is increased to "+
                 (int)targetPokemon.getDefense());       
                                        } 
                
     
    //Confuses enemy and increases enemy attack by 2 stage
    else if (pokeMove.getMoveType() == 3) {
         
         System.out.println(attPokemon.getPokeName()+" uses "+
                 pokeMove.getMoveName()+"!");  
          
          // Confused Damage Algorithm
           pokeMove.confusedDamage = (int) Math.round(
            (((2*attPokemon.getLevel()+10)/250)*
            (attPokemon.getAttack()/targetPokemon.getDefense())*15+2)*
            stage_multiplier[attPokemon.getStage()]
            );   
            targetPokemon.setHealth((int) (targetPokemon.getHealth() -
                        pokeMove.confusedDamage));
            targetPokemon.setStage(attPokemon.getStage()+2);
            targetPokemon.setAttack
    (stage_multiplier[targetPokemon.getStage()] * targetPokemon.getAttack()); 
           
     // confused status printout
         System.out.println(targetPokemon.getPokeName()+
                 " is confused and it attacks itself with "+
                 pokeMove.confusedDamage+ " damage");
         System.out.println(targetPokemon.getPokeName()+
                 "damage is increased to "+ targetPokemon.getAttack());                
     }
    
// closes the MakeMove Function  
}
         
     



    //Main method
     public static void main(String[] args){ 
        round = 1;
    //Insert player name
    Scanner tName = new Scanner(System.in);
        System.out.println("What is your name, Trainer?");
    String tNameString= tName.nextLine();
    
   //dialogue
        System.out.print("Get ready for battle Trainer ");
        System.out.println(tNameString);

   //choose trainer pokemon
     Scanner tPokemon = new Scanner(System.in);
        System.out.println("Choose a Pokemon : \n" +"1) Chimcar\n" +
                "2) Piplup\n" +"3) Turtwig");
        
        //create user pokemon
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
                     MyPokemon.setBaseAttack(10);
                     MyPokemon.setBaseDefense(10);
                     MyPokemon.setSpeed(12);
                     MyPokemon.setAttackStage(6);
                     MyPokemon.setDefenseStage(6);
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
                     MyPokemon.setBaseAttack(11);
                     MyPokemon.setBaseDefense(11);
                     MyPokemon.setSpeed(10);
                     MyPokemon.setAttackStage(6);
                     MyPokemon.setDefenseStage(6);
                     MyPokemon.setMove1(new Moves("Pound",40,0));
                     MyPokemon.setMove2(new Moves("Growl",0,2));

                  break;
             }
                     
                     
             case 3:
             {
                     MyPokemon.setPokeName("Turtwig");
                     MyPokemon.setLevel(5);
                     MyPokemon.setHealth(220);
                     MyPokemon.setAttack(130);
                     MyPokemon.setDefense(120);
                     MyPokemon.setBaseAttack(11);
                      MyPokemon.setBaseDefense(12);
                     MyPokemon.setSpeed(9);
                     MyPokemon.setAttackStage(6);
                     MyPokemon.setDefenseStage(6);
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
                     ePokemon.setBaseAttack(7);
                     ePokemon.setBaseDefense(6);
                     ePokemon.setSpeed(8);
                     ePokemon.setAttackStage(6);
                     ePokemon.setDefenseStage(6);
                     ePokemon.setMove1(new Moves("Tackle",40,0));
                  
                    
    }else{
                     ePokemon.setPokeName("TrashDove");
                     ePokemon.setLevel(6);
                     ePokemon.setHealth(25);
                     ePokemon.setAttack(3);
                     ePokemon.setDefense(15);
                     ePokemon.setBaseAttack(3);
                     ePokemon.setBaseDefense(15);
                     ePokemon.setSpeed(14);
                     ePokemon.setAttackStage(6);
                     ePokemon.setDefenseStage(6);
                     ePokemon.setMove1(new Moves("Peck",40,0));
                     ePokemon.setMove2(new Moves("Head Banging",0,4));
                    
                     
}
    
    
            //dialogue
            System.out.println("Walking around......."); 
            System.out.println("Whoa! a wild "+ePokemon.getPokeName()+
                    " appeared!");
            System.out.println("I choose you! "+MyPokemon.getPokeName());

        
        int myAttack = 0;
        int foeAttack= 0;
        // if for which pokemon moves first
            if(MyPokemon.getSpeed()>ePokemon.getSpeed()){
                      
             Scanner MyMove = new Scanner(System.in);
             System.out.println(MyPokemon.getPokeName()+" attacks first, "+
                     "Choose your move : \n" +"1) "
                     + MyPokemon.move1.getMoveName()+"\n"+"2) "+
                     MyPokemon.move2.getMoveName());
             
             int moveChoice = MyMove.nextInt();
             if (moveChoice == 1){
                makeMove(MyPokemon.move1, MyPokemon, ePokemon);}
             else if(moveChoice == 2){
                makeMove(MyPokemon.move2, MyPokemon, ePokemon);
                     }
        myAttack=1;
        }
        else{
           
             System.out.println(ePokemon.getPokeName()+" attacks first");
             Random randomEnemyMove = new Random();
             int randomMove = randomEnemyMove.nextInt(5);
             
             if(ePokemon.getPokeName()== "Starly")
                 makeMove(ePokemon.move1, ePokemon, MyPokemon);
             
             else if(randomMove==0 || randomMove==1 || randomMove==2){
                makeMove(ePokemon.move1, ePokemon, MyPokemon);}
             else 
                makeMove(ePokemon.move2, ePokemon, MyPokemon);
        foeAttack=1;       
             }
        
            //to keep the battle going until health=0
        while(true)
        {if(MyPokemon.getHealth() <= 0 || ePokemon.getHealth() <= 0){
            break;}
            if(myAttack==0){
             Scanner MyMove = new Scanner(System.in);
             System.out.println(MyPokemon.getPokeName()+" turn to attack"+
                     ", Choose your move : \n" +"1) "
                     + MyPokemon.move1.getMoveName()+"\n"+"2) "+
                     MyPokemon.move2.getMoveName());
             
             int moveChoice = MyMove.nextInt();
        if (moveChoice == 1){
                makeMove(MyPokemon.move1, MyPokemon, ePokemon);}
        else if(moveChoice == 2){
                makeMove(MyPokemon.move2, MyPokemon, ePokemon);
                     }
        myAttack=1; 
        foeAttack=0;
             }
        else{
           
             System.out.println(ePokemon.getPokeName()+" turn to attack");
             Random randomEnemyMove = new Random();
             int randomMove = randomEnemyMove.nextInt(5);
             
             if(ePokemon.getPokeName()== "Starly")
                 makeMove(ePokemon.move1, ePokemon, MyPokemon);
             
             else if(randomMove==0 || randomMove==1 || randomMove==2){
                makeMove(ePokemon.move1, ePokemon, MyPokemon);}
             else 
                makeMove(ePokemon.move2, ePokemon, MyPokemon);
         foeAttack=1;
         myAttack=0;
             }            
        }
        
        //Winning/Losing dialogue
        if(MyPokemon.getHealth()==0){
            System.out.println(MyPokemon.getPokeName()+" fainted,"+
                    " Trainer "+tNameString+" lost the battle!");
        }
        else 
            System.out.println(ePokemon.getPokeName()+" fainted,"+
                    " Trainer "+tNameString+" wins the battle");
            
        
      }
    }

     
     
    


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonbattlesimulator;

/**
 *
 * @author ASUS1
 */
public class Pokemon {
    //intstance variable
  private String PokeName;
  private float level;
  private float health;
  private float attack;
  private float defense;
  private float sattack;
  private float sdefense;
  private float speed;
  public int stage;
  public Moves move1;
  public Moves move2;
         
    public Pokemon() {
    }

    public Pokemon(String PokeName, float level, float health, float attack, float defense, float sattack, float sdefense, float speed, int stage, Moves move1, Moves move2) {
        this.PokeName = PokeName;
        this.level = level;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
        this.sattack = sattack;
        this.sdefense = sdefense;
        this.speed = speed;
        this.stage = stage;
        this.move1 = move1;
        this.move2 = move2;
    }

    public String getPokeName() {
        return PokeName;
    }

    public void setPokeName(String PokeName) {
        this.PokeName = PokeName;
    }

    public float getLevel() {
        return level;
    }

    public void setLevel(float level) {
        this.level = level;
    }

    public float getHealth() {
        return health;
    }

    public void setHealth(float health) {
        this.health = health;
    }

    public float getAttack() {
        return attack;
    }

    public void setAttack(float attack) {
        this.attack = attack;
    }

    public float getDefense() {
        return defense;
    }

    public void setDefense(float defense) {
        this.defense = defense;
    }

    public float getSattack() {
        return sattack;
    }

    public void setSattack(float sattack) {
        this.sattack = sattack;
    }

    public float getSdefense() {
        return sdefense;
    }

    public void setSdefense(float sdefense) {
        this.sdefense = sdefense;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public int getStage() {
        return stage;
    }

    public void setStage(int stage) {
        this.stage = stage;
    }

    public Moves getMove1() {
        return move1;
    }

    public void setMove1(Moves move1) {
        this.move1 = move1;
    }

    public Moves getMove2() {
        return move2;
    }

    public void setMove2(Moves move2) {
        this.move2 = move2;
    }

   
    @Override
    public String toString() {
        return "Pokemon{" + "PokeName=" + PokeName + ", level=" + level + ","
                + " health=" + health + ", attack=" + attack + ", defense=" +
                defense + ", sattack=" + sattack + ", sdefense=" + sdefense + 
                ", speed=" + speed + ", stage=" + stage + '}';
    }
}

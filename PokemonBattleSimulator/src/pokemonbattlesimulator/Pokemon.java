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
  private int level;
  private int health;
  private int attack;
  private int defense;
  private int sattack;
  private int sdefense;
  private int speed;
  private String MoveName1;
  private int MovePower1;
  private String MoveName2;
  private int MovePower2;
         
    public Pokemon() {
    }

  
    public Pokemon(String PokeName, int level, int health, int attack, int defense, int sattack, int sdefense, int speed) {
        this.PokeName = PokeName;
        this.level = level;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
        this.sattack = sattack;
        this.sdefense = sdefense;
        this.speed = speed;
        this.MoveName1= MoveName1;
        this.MovePower1 = MovePower1;
        this.MoveName2 = MoveName2;
        this.MovePower2 = MovePower2;
    }

    public String getPokeName() {
        return PokeName;
    }

    public int getLevel() {
        return level;
    }

    public int getHealth() {
        return health;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public int getSattack() {
        return sattack;
    }

    public int getSdefense() {
        return sdefense;
    }

    public int getSpeed() {
        return speed;
    }

    public String getMoveName1() {
        return MoveName1;
    }

    public int getMovePower1() {
        return MovePower1;
    }

    public String getMoveName2() {
        return MoveName2;
    }

    public int getMovePower2() {
        return MovePower2;
    }

    public void setPokeName(String PokeName) {
        this.PokeName = PokeName;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void setSattack(int sattack) {
        this.sattack = sattack;
    }

    public void setSdefense(int sdefense) {
        this.sdefense = sdefense;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setMoveName1(String MoveName1) {
        this.MoveName1 = MoveName1;
    }

    public void setMovePower1(int MovePower1) {
        this.MovePower1 = MovePower1;
    }

    public void setMoveName2(String MoveName2) {
        this.MoveName2 = MoveName2;
    }

    public void setMovePower2(int MovePower2) {
        this.MovePower2 = MovePower2;
    }

    @Override
    public String toString() {
        return "Pokemon{" + "PokeName=" + PokeName + ", level=" + level + ", health=" + health + ", attack=" + attack + ", defense=" + defense + ", sattack=" + sattack + ", sdefense=" + sdefense + ", speed=" + speed + ", MoveName1=" + MoveName1 + ", MovePower1=" + MovePower1 + ", MoveName2=" + MoveName2 + ", MovePower2=" + MovePower2 + '}';
    }
}
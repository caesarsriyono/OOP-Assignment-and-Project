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
public class Moves {
    
    public String MoveName; 
    public int MoveDamage;
    public int MoveType; // 0 = damage , 1 = Lower enemy defense 1 stage, 2 = Lower enemy attack 1 stage, 3 = raise self defense 1 stage

    public Moves() {
    }

    
    public Moves(String MoveName, int MoveDamage, int MoveType) {
        this.MoveName = MoveName;
        this.MoveDamage = MoveDamage;
        this.MoveType = MoveType;
    }

    public String getMoveName() {
        return MoveName;
    }

    public int getMoveDamage() {
        return MoveDamage;
    }

    public int getMoveType() {
        return MoveType;
    }

    public void setMoveName(String MoveName) {
        this.MoveName = MoveName;
    }

    public void setMoveDamage(int MoveDamage) {
        this.MoveDamage = MoveDamage;
    }

    public void setMoveType(int MoveType) {
        this.MoveType = MoveType;
    }

    @Override
    public String toString() {
        return "Moves{" + "MoveName=" + MoveName + ", MoveDamage=" + MoveDamage + ", MoveType=" + MoveType + '}';
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheMyPoint;
/**
 *
 * @author caesar
 */
public class MyPoint {
    //instance variable
    public int x;
    public int y;

    
    //constructor

     public MyPoint() {
        x = 0;
        y = 0;
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
   

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
       
    
    public int[] getXY(){
        int xy[] = {x,y};
        return xy;
    }
    
     public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }
     

    @Override
    public String toString() {
        return "MyPoint{" + "x=" + x + ", y=" + y + '}';
    }

    public double distance(int x, int y){

        int xDiff = this.x - x;

        int yDiff = this.y - y;

        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }
        
    public double distance(MyPoint another){
        int xDiff = this.x - x;
        int yDiff = this.y - y;

        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);

    }

    }


    
    
    

    

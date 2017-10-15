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
public class MyCircle {

//instance variable
    private MyPoint center;
    private int radius = 1;

    //constructor
    public MyCircle() {

    }

    public MyCircle(int x, int y, int radius) {
        this.center = new MyPoint(x, y);
        this.radius = radius;
    }

    public MyCircle(MyPoint center, int radius) {
        this.center = new MyPoint(0, 0);
        this.center = center;
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }
    
    public int getCenterX() {
        return center.x;
    }
    
    public void setCenterX(int x) {
        this.center.x = x;
    }
    
    public int getCenterY(){
        return center.y;
    }
    public void setCenterY(int y){
        this.center.y = y;
    }
    
    public int[] getCenterXY(){
        int xy[] = {center.x,center.y} ;
        return xy;
    }
    
    public void setCenterXY(int x, int y){
       this.center.x = x;
       this.center.y = y;
    }

    @Override
    public String toString() {
        return "MyCircle{" + "center=" + center + ", radius=" + radius + '}';
    }
    
    public double getArea(){
        return Math.PI * radius * radius;
    }
    
    public double getCircumference(){
        return Math.PI * (radius + radius);
    }
    
    public double distance(MyCircle another) {
        return center.distance(another.center);
    }
}

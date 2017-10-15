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
public class TestMyTriangle {
    public static void main ( String[] args){
        
        MyTriangle t1 = new MyTriangle(1,1, 4,6, 7,3);
        MyTriangle t2 = new MyTriangle(new MyPoint(1,1), new MyPoint(4,6), new MyPoint(7,3));
        
        System.out.println("Triangle "+ t1 +" is "+ t1.printType() +" and has perimeter "+t1.getPerimeter());
        System.out.println("Triangle "+ t2 +" is "+ t2.printType() +" and has perimeter "+t2.getPerimeter());
    }
}   
   

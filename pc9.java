/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nilima M
 */
import java.util.Scanner;
public class Circle {
    private double radius;
    private final double PI=3.14159;
    
    public Circle(double r){
        this.radius=r;
    }
    public void setRadius(double r)
    {
        this.radius=r;
    }
    public double getRadius()
    {
        return radius;
    }
    public double getArea()
    {
        double area = PI*radius*2;
        return area;
    }
    public double getcircumference()
    {
        double circumference=2*PI*radius;
        return circumference;
    }
    
    //Main method
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter circle's radius : ");
        double r = input.nextDouble();
        Circle obj = new Circle(r);
        System.out.println("Perimeter is : "+ obj.getcircumference());
        System.out.println("Area is : "+ obj.getArea());
    }
}
    


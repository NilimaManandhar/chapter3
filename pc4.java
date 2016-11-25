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
public class TemperatureMain {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature in fahrenheit : ");
        double f=input.nextDouble();
        Temperature obj= new Temperature(f);
        System.out.println("In celsius : " + obj.getCelsius());
        System.out.println("In kelvin : "+ obj.getKelvin());
        System.out.println("In Fahrenheit"+ obj.getFahrenheit());
    }
    
}
public class Temperature {
    
    //my field
    private double ftemp;
    public Temperature(double f)
    {
        this.ftemp=f;
    }
    public void setFahrenheit(double f)
    {
        this.ftemp=f;
    }
    public double getFahrenheit()
    {
        return ftemp;
    }
    public double getCelsius()
    {
        double c= (5/9)*(ftemp-32);
        return c;
    }
    public double getKelvin()
    {
        double k=((5/9)*(ftemp-32))+273;
        return k;
    }
}

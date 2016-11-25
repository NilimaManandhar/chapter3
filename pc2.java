/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nilima M
 * 
 */
public class car {
    
    //My fields
    private int yearModel;
    private String make;
    private int speed;
    
    //constructor
    public car(int yearModel, String make)
    {
        this.speed=0;
        this.yearModel=yearModel;
        this.make=make;
    }
    
    //getters
    public int getYearModel()
    {
        return yearModel;
    }
    public String getMake()
    {
        return make;
    }
    public int getSpeed()
    {
        return speed;
    }
    
    //no setters okaay
    public int accelerate()
    {
        speed=speed+5;  
        return speed;
    }
    public int brake()
    {
        speed=speed-5;
        return speed;
    }
    
    public static void main(String[] arggs)
    {
      //didn't follow book's instruction
        car ToyotaSUV= new car(2016, "Corolla");
        ToyotaSUV.accelerate();
        ToyotaSUV.accelerate();
        ToyotaSUV.accelerate();
        System.out.println(ToyotaSUV.accelerate());
        System.out.println(ToyotaSUV.brake());
        
    }
}





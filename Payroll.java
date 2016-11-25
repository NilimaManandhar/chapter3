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
public class PayrollMain {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = input.nextLine();
        System.out.println("Enter your id : ");
        int id=input.nextInt();
        System.out.print("Enter your hours worked : ");
        int hours=input.nextInt();
        System.out.print("Enter your payrate : ");
        double rate = input.nextDouble();
        Payroll emp= new Payroll(name,id);
        //set
        emp.setID(id);
        emp.setName(name);
        emp.setrate(rate);
        emp.sethours(hours);
        
        
        System.out.println("Name "+ emp.getName());
        System.out.println("ID "+ emp.getID());
        System.out.println("You earned :$"+ emp.grosspay(hours, rate));
        
        
   
        emp.sethours(hours);
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nilima M
 */
public class Payroll {
    private String name;
    private int id;
    private double rate;
    private int hours;
    
    public Payroll(String name, int id)
    {
        this.name=name;
        this.id=id;
    }
    //setters
    public void setName(String name)
    {
        this.name=name;
    }
    public void setID(int id)
    {
        this.id=id;
    }
    public void setrate(double rate)
    {
        this.rate=rate;
    }
    public void sethours(int hours)
    {
        this.hours=hours;
    }
    
    //getters
    public String getName(){return name;}
    public int getID(){return id;}
    public double getRate(){return rate;}
    public double getHours(){return hours;}
    
    //functions
    public double grosspay(double h, double r)
    {
        double pay=h*r;
        return pay;
    }
}

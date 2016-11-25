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
public class Pet {
    
    //instances
    private String name;
    private String type;
    private int age;
    
    public void setName(String name)
    {
        this.name=name;
    }
    public void setType(String type)
    {
        this.type=type;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    public String getName()
    {
        return name;
    }
    public String gettype()
    {
        return type;
    }
    public int getAge()
    {
        return age;
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name : ");
        String puppy = input.nextLine();
        Pet user=new Pet();
        user.setName(puppy);
        System.out.print("Enter type : ");
        String tp=input.nextLine();
        user.setType(tp);
        System.out.print("Enter age");
        int age= input.nextInt();
        user.setAge(age);
        
        //Display
        System.out.println(user.getName());
        System.out.println(user.getAge());
        System.out.println(user.gettype());
    }
}

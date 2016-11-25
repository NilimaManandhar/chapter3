/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nilima M
 */
public class Employee {
    
    private String name;
    private int idNumber;
    private String department;
    private String position;
    
    //getters and setters
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    public void setID(int id)
    {
        idNumber=id;
    }
    public int getID()
    {
        return idNumber;
    }
    public void setDepartment(String department)
    {
        this.department= department;
    }
    public String getDepartment()
    {
        return department;
    }
    public void setPosition(String p)
    {
        position=p;
    }
    public String getPosition()
    {
        return position;
    }
    
    //main method
    public static void main(String[] args)
    {
        Employee one = new Employee();
        one.setName("Susan Meyers");
        one.setID(47899);
        one.setDepartment("Accounting");
        one.setPosition("Vice President");
        
        Employee two=new Employee();
        two.setName("Mark Jones");
        two.setID(4512);
        two.setDepartment("IT");
        two.setPosition("Programmer");
        
        System.out.println("Name\tIDNumber\tDepartment\tPosition");
        System.out.println(one.getName()+"\t   "+one.getID()+"\t"+one.getDepartment()+"\t"+one.getPosition());
        System.out.println(two.getName()+"\t"+two.getID()+"\t"+two.getDepartment()+"\t"+two.getPosition());
     
    }
}

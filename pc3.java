/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nilima M
 */
public class PersonalInformation {
    
    private String name;
    private String address;
    private int age;
    private String number;
    
    //SETTERS
    public void setName(String name)
    {
        this.name=name;
    }
    public void setAddress(String address)
    {
        this.address=address;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    public void setPhone(String number)
    {
        this.number=number;
    }
    
    //getters
    public String getName()
    {
        return name;
    }
    public String getAddress()
    {
        return address;
    }
    public int getAge()
    {
        return age;
    }
    public String getPhone()
    {
        return number;
    }
    
    public static void main(String[] args)
    {
        //says to create three instances and just hold it
        PersonalInformation Mitsuha = new PersonalInformation();
        Mitsuha.setName("Mitsuha Hikage");
        Mitsuha.setAge(16);
        Mitsuha.setAddress("Itomori, Japan");
        Mitsuha.setPhone("7731245");
        
        PersonalInformation Taki = new PersonalInformation();
        Taki.setName("Taki Hikage");
        Taki.setAge(14);
        Taki.setAddress("Tokyo, Japan");
        Taki.setPhone("7731245");
        
        PersonalInformation Tetsuya = new PersonalInformation();
        Tetsuya.setName("Hinata Tetsuya");
        Tetsuya.setAge(16);
        Tetsuya.setAddress("Osaka, Japan");
        Tetsuya.setPhone("7731245");
        
    }
}

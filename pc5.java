/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nilima M
 */
public class RetailItemMain {
    public static void main(String[] args)
    {
        RetailItem one = new RetailItem();
        one.setDescription("Item #1\tjacket");
        one.setUnits(12);
        one.setprice(59.95);
        
        RetailItem two = new RetailItem();
        two.setDescription("Item #2\tDesigner Jeans");
        two.setUnits(40);
        two.setprice(34.95);
        
        RetailItem three = new RetailItem();
        three.setDescription("Item #3\tShirt");
        three.setUnits(12);
        three.setprice(24.95);
        
        System.out.println("Description"+"\tUnits On Hand\t Price");
        System.out.println(one.getdescription()+"\t"+one.getunits()+"\t"+one.getprice());
        System.out.println(two.getdescription()+"\t"+two.getunits()+"\t"+two.getprice());
        System.out.println(three.getdescription()+"\t"+three.getunits()+"\t"+three.getprice());
        
        
        
    }
    
}

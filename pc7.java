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
public class TestScoreMain {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("enter your math score : ");
        int math=input.nextInt();
        System.out.print("enter your eng score : ");
        int eng=input.nextInt();
        System.out.print("enter your comp score : ");
        int comp=input.nextInt();
        TestScores a = new TestScores();
        a.setMath(math);
        a.setComp(comp);
        a.setEng(eng);
        System.out.println("Your avg score is :"+ a.avg(math, eng, comp));
        
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
public class TestScores {
    private int math;
    private int eng;
    private int comp;
    
    //setters
    public void setMath(int m)
    {
        this.math=m;
    }
    public void setEng(int e)
    {
        this.eng=e;
    }
    public void setComp(int c)
    {
        this.comp=c;
    }
    
    //getters
    public int getMath()
    {
        return math;
    }
    public int getEng()
    {
        return eng;
    }
    public int getComp()
    {
        return comp;
    }
    
    public int avg(int m, int e, int c)
    {
        int a=(m+e+c)/3;
        return a;
    }
    
}



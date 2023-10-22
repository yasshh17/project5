package edu.neu.mgen;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(" ");
        System.out.println( "Lab 1: Part 1" );
        
        ArrayList<Integer> x = new ArrayList<>();
        x.add(11);
        x.add(3);
        x.add(1999);
        x.add(24);
        x.add(27);
        
        System.out.println("Array x = "+x);
        
        ArrayList<Integer> y = new ArrayList<>();
        y.add(15);
        y.add(6);
        y.add(1998);
        y.add(22);
        y.add(25);
        
        System.out.println("Array y = "+y);
        
        ArrayList<Integer> z = new ArrayList<Integer>(5);
        z.add(Math.max(x.get(0),y.get(0)));
        z.add(Math.max(x.get(1),y.get(1)));
        z.add(Math.max(x.get(2),y.get(2)));
        z.add(Math.max(x.get(3),y.get(3)));
        z.add(Math.max(x.get(4),y.get(4)));

        System.out.println("Array z (max of x and y) = " + z);

        System.out.println(" ");
        System.out.println(" "); 
        System.out.println ("Lab 1: Part 2");
        ArrayList<String> nameList = new ArrayList<>();
        ArrayList<String> nameListSwitched = new ArrayList<>();
        
        nameList.add("Sam");
        nameList.add("Maria");
        nameList.add("Rohan");
        nameList.add("Rachel");
        nameList.add("Jack");

        int len = 0;
        String name = " ";
        for(int i = 0; i<nameList.size() ; i++)
        {
            name = nameList.get(i);
            len = name.length();
            name = name.substring(len-1).toUpperCase() + name.substring(1, len-1) + name.substring(0,1).toLowerCase();
            nameListSwitched.add(name);
            
        }
        
        System.out.println("Names = " + nameList);
        System.out.println("Names (Switched) = " + nameListSwitched);
        



        
    }
}

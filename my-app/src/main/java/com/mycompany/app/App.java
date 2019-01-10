package com.mycompany.app;
import java.io.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
        File file = new File("C:\\Users\\pankaj\\Desktop\\test.txt"); 
  
        FileReader fr = new FileReader(file);
        } catch (Exception e){}
        System.out.println( "Hello World!" );
    }
    
    public static void foo() {
        try {
        File file = new File("C:\\Users\\pankaj\\Desktop\\test.txt"); 
  
        FileReader fr = new FileReader(file);
        } catch (Exception e){}
    }
}

import java.lang.*; // Packages 
import java.util.*;

class Rectangle{
   public int width;
   public int breadth;

   //Create constructor to initialize these data 
   //Types of constructor -- > default constructor not to created, non - parametrised constructor and parametrised constructor
  // Constructor can be overloaded just like the method overloading
   //Non - Parametrised constructor
   public Rectangle(){
    width = 1;
    breadth = 1;
   }
  
  // parametrised constructor
  public Rectangle(int width, int breadth){
    this.width = width;
    this.breadth = breadth;
  }
  // Method
  public int area(){
    return width*breadth;
  }

};

// Creating Application class
public class constructor{
    public static void main(String args[]){
        // Create Object of rectangle
        //Rectangle r1 = new Rectangle(); // here default constructor is called
        Rectangle r2 = new Rectangle(3,4); // parametrised constructor will be called
        
        System.out.println(r2.width);
        System.out.println(r2.breadth);
        System.out.println(r2.area());
    }
}

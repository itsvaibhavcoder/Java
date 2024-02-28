import java.lang.*;
import java.util.*;

// Don't write the public keyword while creating class
class Car{
    // Properties of car class 
    public double radius;
    // Methods of car class --- function

    public double area(){
           return Math.PI*radius*radius;
    }

    public double circumference(){
        return 2*Math.PI*radius;
    }

    public double perimeter(){
        return circumference();
    }
}
// This name will be the same as file name
public class carClass{
    public static void main(String args[]){
      
      // Create the object of class car
      Car car1 = new Car();
      car1.radius = 7;
      
      System.out.println("Area of Circle is "+ car1.area());
      System.out.println("Circumfernce of circle is "+ car1.circumference());
      System.out.println("perimeter of circle is "+ car1.perimeter());

    }
}


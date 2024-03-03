import java.lang.*;
import java.util.*;

//Super class or base class or parent class
class circle{
    public double radius;
    public double area(){
        return Math.PI*radius*radius;
    }
    public double perimeter(){
        return 2*Math.PI*radius;
    }

};
//Sub class or derived class or child class
// cylinder class inherits all the properties as well as methods of circle class it can also have the constructor of circle class
// all properties and methods are available. (accessible it depends)

class cylinder extends circle{
    public double height;
    
    public double volume(){
        return area()*height;
    }

}

public class inheritance{
    public static void main(String args[]){
        //Creating object of class
        cylinder c = new cylinder();
        c.radius = 10.0;
        c.height = 5.0;

       System.out.println(c.volume());
    }
}

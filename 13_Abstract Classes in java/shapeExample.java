import java.lang.*;
import java.util.*;

abstract class Shape{
     abstract public  double perimeter(); //No exact farmula doubleil exact shape know (Abstract methods)
     abstract public double area();
};

class Circle extends Shape {
    public double radius;
    Circle(double radius){
        this.radius = radius;
    }
    public double perimeter(){
            return 2*Math.PI*radius;
    }
    public double area(){
        return Math.PI*radius*radius;
    }
};

class Rectangle extends Shape{
    public double length;
    public double breadth;
    Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public double perimeter(){
            return 2*(length+breadth);
    }
    public double area(){
        return length*breadth;
    }

};

public class shapeExample{
    public static void main(String args[]){
        Shape s = new Circle(5);
        System.out.println(s.perimeter());
        System.out.println(s.area());
       
    }
}
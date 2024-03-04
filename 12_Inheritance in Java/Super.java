import java.lang.*;
import java.util.*;

// Super is used for refer to super class object
class Rectangle{
    public int length;
    public int breadth;
    public int x = 20;
    public Rectangle(int length ,int breadth){
        this.length = length;
        this.breadth = breadth; 
    }
};

class cuboid extends Rectangle{
    public int height;
    public int x = 10;
    public cuboid(int l, int b, int h){
            super(l,b);
            this.height = h;
    }

    public void display(){
        System.out.println(this.x); // x = 10 of current object
        System.out.println(super.x); // x = 20 of super class 
    }
};

public class Super{
    public static void main(String args[]){
         cuboid c1 = new cuboid(5,10,5);
         System.out.println(c1.length);
         System.out.println(c1.breadth);
         System.out.println(c1.height);
         c1.display();

    }    
}


import java.lang.*;
import java.util.*;
//this keyword refer to current object and avoid name conflict in constructore
class Rectangle{
    public int length;
    public int breadth;

    public Rectangle(int length ,int breadth){
        this.length = length;
        this.breadth = breadth; 
    }
};

public class thiss{
     public static void main(String args[]){
          Rectangle r1 = new Rectangle(5,6);
          System.out.println(r1.length);
          System.out.println(r1.breadth);
    }
}


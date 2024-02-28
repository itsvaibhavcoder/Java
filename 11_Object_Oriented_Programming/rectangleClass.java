import java.lang.*;
import java.util.*;

class Rectangle{
    public int width;
    public int breadth;
    public int Area(){
        return width*breadth;
    }

    public int perimeter(){
        return 2*(width+breadth);
    }
};

public class rectangleClass{
    public static void main(String args[]){
        Rectangle r = new Rectangle();
        r.width = 3;
        r.breadth = 4;

        System.out.println("The area of rectanle "+ r.Area());
        System.out.println("The perimeter of rectangle "+ r.perimeter());
    }
}
import java.lang.*;
import java.util.*;

class Rectangle{
   // For read and write these private data member we used get and set methods
   private int width;
   private int breadth;
   
   public int area(){
    return width*breadth;
   }

   public void setWidth(int width){
    this.width = width;
   }

   public int getWidth(){
    return width;
   }

   // Similary can be done for breadth also
};

public class dataHiding{

    public static void main(String args[]){
        Rectangle r1 = new Rectangle();
        r1.setWidth(2);
        System.out.println(r1.getWidth());
        // r1.width = 1; // throws error
        // r1.breadth = 2; // throws error 
        // System.out.println(r1.width);
    }
}
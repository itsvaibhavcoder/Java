import java.lang.*;
import java.util.*;

class OuterClass {
    public int x = 10;
    
    // Static inner class
    static class StaticInnerClass {
        // Static inner class can have static members
        public static int z = 30;
        
        // Static inner class can have methods
        public static void display() {
            // Static inner class cannot access non-static members of the outer class
            // So, x cannot be accessed directly here.
            // To access x, an instance of OuterClass must be created.
            OuterClass outer = new OuterClass();
            System.out.println("The sum is " + (outer.x + z));
        }
    }

    // Method to demonstrate static inner class
    public void meth1() {
        // Instantiating the static inner class directly from the method
        StaticInnerClass.display();
    }
}

public class StaticInnerClasses {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.meth1();
        
        // Accessing the static inner class directly from the outer class
        OuterClass.StaticInnerClass.display();
    }
}

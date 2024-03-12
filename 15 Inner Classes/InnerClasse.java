// Nested classes are known as inner classes
// Different types of nested classes
// Static inner classes, Anonymous inner Classes and Local inner classes

import java.lang.*;
import java.util.*;

class OuterClass{
    public int x = 10;
    class innerClass{
        public void display(){
            System.out.println("The outer variable is "+ x);
        }
    }
}

public class InnerClass{
    public static void main(String args[]){
        OuterClass.innerClass i = new OuterClass().new innerClass();
        i.display();
    }
}

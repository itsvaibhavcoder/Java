import java.lang.*;
import java.util.*;

class parent{
    //Creating parent class contructor
     public parent(){
        System.out.println("Parent class constructor");
     }
};

class child extends parent{
    //Creating child class contructor
    public child(){
        System.out.println("child class constructor");
    }
};

public class constructorInheritance{
    public static void main(String args[]){
      parent p = new parent(); // Only parent constructor is called
      child c = new child(); // Both constructor is called 
    //First parent class constructor is called and then child class constructor is called
    }
}

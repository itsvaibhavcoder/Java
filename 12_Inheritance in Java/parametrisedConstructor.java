import java.lang.*;
import java.util.*;

class parent{
    //Non parametrised constructor
    public parent(){
        System.out.println("Parent class constructor");
    
    }
    //Parametrised constructor
    public parent(int x){
        System.out.println("Parent parametrised class constructor "+ x);
    
    }
};

class child extends parent{
    //Non parametrised constructor of child class
    public child(){
        System.out.println("child class constructor");
    }
    //Parametrised constructor
    // public child(int x){
    //     System.out.println("child parametrised class constructor " + x);
    // }
    public child(int x){
        super(x);
        System.out.println("child parametrised class constructor " + x);
    }
};

public class parametrisedConstructor{
    public static void main(String args[]){
      //parent p = new parent(); 
      //child c1 = new child(); // Non parametrised constructor
      //child c2 = new child(10); // It will call non parametrised constructor of parent class and parametrised constructor of child class

      // What if i want to call parametrised constructor of parent class
      // Simply used super method in parametrised constructor of child class
      
      child c3 = new child(20); //Executed Succesfully
    }
}

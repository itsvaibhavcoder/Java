import java.lang.*;
import java.util.*;

interface Animal{
    public void makeSound();
    public void Walk();
}

class Dog implements Animal{
    //Override all the abstract methods 
    public void makeSound(){
        System.out.println("Dog barks ");
     }

    public void Walk(){
        System.out.println("Dog Walk Fastly");

     }
}

public class interfaceExample{
    public static void main(String args[]){
        Animal A = new Dog();
        A.makeSound();
        A.Walk();
    }
}

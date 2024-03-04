import java.lang.*;
import java.util.*;

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
    void eat(){
        System.out.println("Dog eats");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

public class dynamicMethodDispatch{
    public static void main(String[] args) {
        Animal animal1 = new Dog(); // Upcasting
        Animal animal2 = new Cat(); // Upcasting
        // Dog dog1 = new Animal(); //Throws error
        animal1.sound(); // Calls Dog's sound() method
        animal2.sound(); // Calls Cat's sound() method
        // animal1.eat(); // only overriden method can be called
    }
}

// In dynamic method dispatch we can have only reference to super class and object of child class but viceversa not possible
// In dynamic method dispatch when we create object the method of child class are called
// But if suppose method is only in child class and not present in super class we cannot called it
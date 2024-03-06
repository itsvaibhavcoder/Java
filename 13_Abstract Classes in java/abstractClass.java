// The class decla red with abstract keyword is abstract class
// We cant create the object of abstract class
// Abstract class cannot be static or finale
// If class has atleast one method abstract it become abstract
// Abstract method ---> we only declare method without defining its body
// Abstract class and Concrete class
// If child class inherits from abstract parent class so for child class to be concrete it must override all the abstract method of abstract parent class

import java.lang.*;
import java.util.*;

abstract class parent{
     abstract public void meth();
};

class child extends parent {
    public void meth(){
        System.out.println("Meth 2");
    }
};

public class abstractClass{
    public static void main(String args[]){
        parent p = new child();
        p.meth();
    }
}
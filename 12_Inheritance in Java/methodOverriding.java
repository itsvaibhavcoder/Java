import java.lang.*;
import java.util.*;

class TV{
    public void swithOn(){
        System.out.println("Tv is switch on ");
    }
};

class smartTV extends TV{
    @Override
    public void swithOn(){
        System.out.println("smartv is switch on");
    }
};

public class methodOverriding{
    public static void main(String args[]){
        // Creating the object of parent class
        TV t1 = new TV();
        t1.swithOn(); // Tv is switch on

        smartTV t2 = new smartTV();
        t2.swithOn(); // Here the method overidding happens output will be smart tv is switch on
    }
}
// method overriding is used for achieving run time polymorphism


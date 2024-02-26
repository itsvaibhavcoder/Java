import java.lang.*;
import java.util.*;

public class Method_code {
    // As main is static method so we have make max method also as static method 
    // Another way is create the object of Method_code class and then call the method for that class
    int max(int a, int b) {  // Formal Parameters
        if (a > b) return a;
        else return b;
    }
    
    public static void main(String args[]) {
        int a = 10, b = 15, c;
        //c = max(a, b);
        Method_code mp = new Method_code();
        // Here actual parameter are not passed copy of parameter passed 
        System.out.println(mp.max(a,b)); // Actual Parameter
    }
}

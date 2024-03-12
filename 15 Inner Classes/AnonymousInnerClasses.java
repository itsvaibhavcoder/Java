import java.lang.*;
import java.util.*;

interface Greeting {
    void greet();
}

public class AnonymousInnerClasses {
    public static void main(String[] args) {
        // Creating an anonymous inner class implementing the Greeting interface
        Greeting englishGreeting = new Greeting() {
            @Override
            public void greet() {
                System.out.println("Hello!");
            }
        };

        // Creating another anonymous inner class implementing the Greeting interface
        Greeting frenchGreeting = new Greeting() {
            @Override
            public void greet() {
                System.out.println("Bonjour!");
            }
        };

        // Invoking the greet method of the English greeting
        englishGreeting.greet();

        // Invoking the greet method of the French greeting
        frenchGreeting.greet();
    }
}

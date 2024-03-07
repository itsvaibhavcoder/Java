import java.lang.*;
import java.util.*;

public class printing{
public static void main(String args[]){
      String str = "Vaibhav";
      //System.out.println(str); // New line
      //System.out.print(str); // No New line
      //System.out.printf(str); // No new line
      //System.out.format(str); 
    
     // Different string methods
     // System.out.println(str.length());
     // String str1 = str.toLowerCase();
     // System.out.println(str1);
     // String str2 = str.toUpperCase();

      // String sub = str.substring(2);  // it will take substring from index 3 to end
      // String sub = str.substring(1,7); // it will take substring from index 1 to 6 
      // System.out.println(sub);

      //String str3 = str.replace('a', 'b'); // All occurences of a will be replace by b
      //System.out.println(str3);
      
      //System.out.println(str.startsWith("ai"));
      //System.out.println(str.endsWith("av"));

      System.out.println(str.charAt(4));
      System.out.println(str.indexOf("bh"));
      System.out.println(str.lastIndexOf("ai"));

      String str2 = "vaibhav";

      System.out.println(str.equals(str2));
      System.out.println(str.equalsIgnoreCase(str2));

      System.out.println(str.compareTo(str2));  // Here str is smaller and str2 is larger lexographically  it will return difference between first unmatched character from both string . Here V and v  V---65, v = 97  65-97 = -32 hence first is smaller and second is larger

      System.out.println(str.valueOf(3));


      

  }
}

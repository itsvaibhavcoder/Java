import java.lang.*;
import java.util.*;
public class studentAssignment{
    public static void main(String[] args){
        // Area of trianle -- 1/2 *base*height

        float base, height, area;
        // Create a object to take input scanner
         Scanner sc = new Scanner(System.in);
         base = sc.nextFloat();
         height = sc.nextFloat();
        area = (1.0f / 2) * base * height;
         System.out.print(area);
    }

}

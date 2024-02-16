import java.lang.*;
public class studentAssignment{
    public static void main(String[] args){
        // Area of trianle -- 1/2 *base*height

        float base, height, area;
        // Create a object to take input scanner
         Scanner sc = new Scanner(System.in);
         base = sc.nextFloat("Enter the value of Base : ");
         height = sc.nextFloat("Enter the value of Height : ");
         area = 1/2*base*height;
         System.out.print(area);
    }

}

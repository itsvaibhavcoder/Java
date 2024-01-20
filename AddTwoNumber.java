import java.util.Scanner;

public class AddTwoNumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        //Input the first number
        System.out.print("Enter the first number : ");
        double num1 = sc.nextDouble();

        //Input the second number 
        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble();

        //Add the two numbers
        double sum = num1 + num2;
        
        //Display the result 
        System.out.println("The sum of "+ num1+ " and "+ num2+" is: "+ sum);
    }
}
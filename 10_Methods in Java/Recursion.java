import java.lang.*;
import java.util.*;

public class Recursion{
    static void print(int a){
        if(a>0){
            System.out.print(a+" ");
            print(a-1);
        }
    }
    public static void main(String args[]){
     int a = 3;
     print(a);
    }
}
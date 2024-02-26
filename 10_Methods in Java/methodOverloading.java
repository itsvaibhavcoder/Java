import java.lang.*;
import java.util.*;

public class methodOverloading{
    static int max(int x, int y){
        return x>y?x:y;
    }
    static float max(float x, float y){
        return x>y?x:y;
    }
    static int max(int x, int y, int z){
        return x>y && x>z?x:(y>z?y:z);
    }
    public static void main(String args[]){
        int x=10,y=8;
        float a = 2.5f, b=3.5f;
        System.out.println(max(x,y)); // Call method 1
        System.out.println(max(a,b)); // Call method 2 
        System.out.println(max(x,y,50)); // Call method 3
    }
}
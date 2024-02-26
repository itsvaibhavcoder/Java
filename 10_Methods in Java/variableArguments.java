import java.lang.*;
import java.util.*;

public class variableArguments{
    static void show(int ...x){
        for(int a:x){
            System.out.println(a);
        }
    }
    public static void main(String args[]){
        show();
        show(1);
        show(2,3);
        show(1,2,3,5,6,6);
    }
}
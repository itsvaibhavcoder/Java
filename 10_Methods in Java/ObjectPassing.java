import java.lang.*;
import java.util.*;
// When we passed object in method actually we passed reference to this object.
public class ObjectPassing{
     static void update(int A[]){
        A[0] = 25;
     }
    public static void main(String args[]){
        int A[] = {2,3,4,5,6};
        update(A);
        System.out.println(A[0]);
    }
}
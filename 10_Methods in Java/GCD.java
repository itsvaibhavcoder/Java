import java.lang.*;
import java.util.*;

public class GCD{
    static int find_GCD(int a, int b) {
    if (a == 0) {
        return b;
    }
    if (b == 0) {
        return a;
    }
    while (a != b) {
        if (a > b) {
            a -= b;
        } else {
            b -= a;
        }
    }
    return a; // or return b; (both are equal here)
}
    public static void main(String args[]){
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = find_GCD(a,b);
        System.out.println(c);

    }
}   
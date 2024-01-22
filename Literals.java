import java.lang.*;
class Literals{
    public static void main(String args[]){
        byte b = 15;
        System.out.println(b);
        byte b1 = 10; // In decimal form
        byte b2 = 0b1010;
        byte b3 = 012;
        byte b4 = 0XA;
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);

        // long literal
        long l = 125L;
        System.out.println(l);

        //long l1 = 999999999999; // throw error
        long l1 = 999999999999L;
        //long l1 = 999_999_999;
        System.out.println(l1);

        //Float literals
        //float f = 12.56; // Throw error
        float f = 12.56f;
        double d = 12.56d; 
        System.out.println(f);
        System.out.println(d);

        //
    }
}
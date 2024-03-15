import java.lang.*;
class Variable{
    public static void main(String args[]){
        byte b=5;
        System.out.println(b);
        //changing value of already declared variable and it work actually
        b=25;
        System.out.println(b);  
        byte c = 127;
        System.out.println(c); //  it will throw error as range of byte is -128 to 127

    }
}
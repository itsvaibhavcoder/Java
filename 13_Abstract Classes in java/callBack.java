import java.lang.*;
import java.util.*;

interface Member{
    public void callback();
};

class Store{
    //Array of Interfaces
    Member members[] = new Member[10];

    int cnt = 0;
    void register(Member m){
        members[cnt++] = m;
    }
    void inviteSale(){
        for(int i=0; i<cnt; i++){
            members[i].callback();
        }
    }
};

class Customer implements Member{
    String name;
    Customer(String n){
        name = n;
    }

    public void callback(){
        System.out.println("Ok, I will visit, "+ name);
    }
};

public class callBack{
    public static void main(String args[]){
        Store s = new Store();
        Customer c1 = new Customer("John");
        Customer c2 = new Customer("Smith");
        s.register(c1);
        s.register(c2);
        s.inviteSale();
    }
}

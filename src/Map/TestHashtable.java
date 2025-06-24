package Map;

import java.util.Hashtable;

public class TestHashtable {
    
    public static void main(String[] args) {
        
        Hashtable<Temp,String> t=new Hashtable<>(87 );

        t.put(new Temp(6), "Alice");
        t.put(new Temp(67), "Bob");
        t.put(new Temp(3), "Rakesh");
        t.put(new Temp(10), "Jamel");
        t.put(new Temp(15), "Rahul");
        t.put(new Temp(8), "Abhishek");

        System.out.println(t);

    }
}

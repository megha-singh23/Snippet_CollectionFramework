package ConcurrentModification;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Concurrenthashmap {
    
    //ConcurrentHashMap(Class) is a child of ConcurrentMap(Interface)
    
    public static void main(String[] args) {

        ConcurrentMap<Integer,String> c=new ConcurrentHashMap<>();

        c.put(1,"Alice");
        c.putIfAbsent(1, "Bob"); 

        c.remove(1);
        c.remove(1, "Bob");

        c.replace(1, "Taylor", "Bob");



        System.out.println(c);
        
    }
}

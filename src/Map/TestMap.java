package Map;

import java.util.HashMap;
import java.util.WeakHashMap;

public class TestMap {
    
    public static void main(String[] args) throws InterruptedException {
        
        // HashMap<Student,String> h=new HashMap<>();
        WeakHashMap<Student,String> h=new WeakHashMap<>();

        Student s=new Student(); 
        //  Integer i=new Integer(128);

        h.put(s, "Megha");
        s=null;

        System.out.println(h);

        System.gc();   //Garbage Collector
        Thread.sleep(1000);
        System.out.println(h); //For weakHashMap , this return {} empty map
    }
}
 
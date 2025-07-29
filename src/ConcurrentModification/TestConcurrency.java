package ConcurrentModification;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class TestConcurrency extends Thread{

    // static HashMap<Integer,String> m=new HashMap<>(); //throws ConcurrentModificationException
    static ConcurrentHashMap<Integer,String > m=new ConcurrentHashMap<>();

    public void run(){
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            System.out.println("Child Thread updating Map");
            m.put(103, "C");
        }
    }
    
    public static void main(String[] args) {
        
        m.put(101, "A");
        m.put(102,"B");

        TestConcurrency t=new TestConcurrency();
        t.start();
        Set<Integer> s1=m.keySet();
        Iterator<Integer> itr=s1.iterator();
        while(itr.hasNext()){
            Integer i1=(Integer)itr.next();
            System.out.println("Main Thread Iterating Map and Current Entry is: "+i1+"...."+m.get(i1));
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(m);
        }
    }
    
}

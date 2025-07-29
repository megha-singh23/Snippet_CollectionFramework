package ConcurrentModification;

import java.util.ArrayList;
import java.util.Iterator;


public class tryconcurrent {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> a=new ArrayList<>();

        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);

        Iterator<Integer> itr=a.iterator();
        while(itr.hasNext()){

            System.out.println(itr.next());

            a.add(5);//ConcurrentModificationException
        }
    }
    
}

package Queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    
    public static void main(String[] args) {
        
        PriorityQueue<String> p=new PriorityQueue<>(15, (String o1, String o2) -> o2.compareTo(o1));

        p.offer("A");
        p.offer("Z");
        p.offer("L");
        p.offer("B");

        System.out.println(p);
            
    }
}

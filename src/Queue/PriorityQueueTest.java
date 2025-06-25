package Queue;

import java.util.PriorityQueue;
import java.util.Spliterator;

public class PriorityQueueTest {
    
    
    public void tryPriorityQueue() {

        PriorityQueue<Integer> qu=new PriorityQueue<>();
        qu.add(67);
        qu.add(88);
        qu.add(23);
        qu.add(34);
        qu.add(67);
        System.out.println(qu);
        
        qu.comparator();

        System.out.println(qu.contains(23));

        System.out.println(qu.isEmpty());
        qu.offer(41);

        qu.comparator();
        System.out.println(qu.size());

        System.out.println(qu.peek());

        // qu.remove(34);

        Spliterator<Integer> s=qu.spliterator();
        Spliterator<Integer> s1=s.trySplit();
        System.out.println("First Half: ");
        s.forEachRemaining(e->System.out.println(e));
        System.out.println("Second Half: ");
        s1.forEachRemaining(e->System.out.println(e));

        System.out.println(qu.element());

        // System.out.println();

        System.out.println(qu);
        
    } 
    
}

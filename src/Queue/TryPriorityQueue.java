package Queue;

import java.util.PriorityQueue;

public class TryPriorityQueue {
    
    public static void main(String[] args) {
        
        PriorityQueue<Integer> p=new PriorityQueue<>(23);
        System.out.println(p.peek()); //return null
        // System.out.println(p.element()); //return RunTimeException:NoSuchElementException

        for(int i=0;i<=10;i++){
            p.offer(i);
        }

        System.out.println(p.size());
        // System.out.println(p.hashCode());
        System.out.println(p.poll()); //returns null if empty otherwise head of the queue so, here it returns 0
        System.out.println(p);
    }  
}

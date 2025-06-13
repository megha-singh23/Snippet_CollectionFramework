package LinkedList;

import java.util.LinkedList;
import java.util.List;

public class TestIntLinkedlist {
    
    public static void main(String[] args) {
        
        List<Integer> l=new LinkedList<>();
        List<Integer> l1=new LinkedList<>();


        l.add(5);
        l.add(7);
        l.add(8);
        l.add(5);
        l.add(2);
        l.add(6);
        l.add(4);

        for (Integer i : l) {
            
            if(i%2==0){
                l1.add(i);
            }
        }

        l1.forEach(s->System.out.println(s));
    }
}

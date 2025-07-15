package ConcurrentModifiaction;

import java.util.concurrent.CopyOnWriteArrayList;

public class Copyonwritearraylist {
    
    public static void main(String[] args) {
        
        CopyOnWriteArrayList<Integer> list=new CopyOnWriteArrayList<>();
    
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.addLast(10);

        list.forEach(System.out::println);

        
    }

}

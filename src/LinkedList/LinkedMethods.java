package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedMethods {

    // a LinkedList is made up of nodes — each node stores data
    //and a reference to the next (and previous in doubly-linked)

    public void trylinklist() {
       
        LinkedList<String> li=new LinkedList<>();
        li.add("C");
        li.add("C++");
        li.add("Java");

        System.out.println("Size: "+li.size());

        //Returns an iterator over the elements in this deque in reverse sequential order-----
        Iterator<String> st=li.descendingIterator();   
        while(st.hasNext()){
            System.out.println(st.next()+" ");
        }

        li.addFirst("Binary");
        li.addLast("Python");
        System.out.println("Search: "+ li.contains("Java"));

        System.out.println(li.element());  //Retrieves, but does not remove, the head (first element) of this list
        
        li.forEach(e->System.out.println(e));

        System.out.println(li.get(0));

        System.out.println(li.indexOf("C++"));

        li.offer("C#");
        System.out.println(li); //adds a element at last(tail)

        ListIterator<String> print=li.listIterator(li.size());
        // while(print.hasNext()){

            while(print.hasPrevious()){
            System.out.println(print.previous());   //print in reverse order
        }

        System.out.println(li.subList(1, 3));

        System.out.println(li.peek());

        //parallelStream() is used to process a stream in parallel,
        //meaning it splits the task into multiple threads, automatically utilizing multiple CPU cores.
        li.parallelStream().forEach((item)->{
            System.out.println("Thread "+Thread.currentThread().getName()+ "->"+ item);
        });

        li.poll(); //Retrieves and removes the head (first element) of this list.--------returns null if li is empty

        li.removeAll(li); // Returns a exception if list is empty
        System.out.println(li.size());
        
    }
    
}

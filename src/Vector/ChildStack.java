package Vector;

import java.util.Iterator;
import java.util.Stack;
import java.util.Vector;

public class ChildStack {

    //Stack works on LIFO(Last In First Out)-------------

    public void tryStack() {
        
        // Vector<Integer> vec=new Stack<>();   //Stack is a child of Vector

        Stack<Integer> st=new Stack<>();
        st.push(1);           //Adds Element
        st.push(3);
        st.push(4);
        st.add(5);               //same as push, inherited from a Collection Interface
        st.addFirst(0);
        st.addElement(6);
        st.addFirst(65);

        System.out.println("Search:" +st.contains(4));

        System.out.println("Address:"+st.hashCode());

        System.out.println(st.indexOf(5));

        System.out.println(st.isEmpty());

        System.out.println(st.lastIndexOf(5));

        System.out.println("peek "+ st.peek());

        st.sort((e1,e2)->e1.compareTo(e2));
        st.forEach(System.out::println);

        st.insertElementAt(44, 1);
        st.forEach(System.out::println);

        System.out.println(st.get(3));

        st.remove(6);

        System.out.println(st.retainAll(st));

        System.out.println(st.getClass().getName());


        Iterator<Integer> r=st.iterator();    //Returns an iterator over the elements in this list in proper sequence
        while(r.hasNext()){
            System.out.println(r.next());
        }

        
        // To print the stack------- 
        while(!st.isEmpty()){
            System.out.println(st.pop());
        }


        // st.clear();
    }
    
}

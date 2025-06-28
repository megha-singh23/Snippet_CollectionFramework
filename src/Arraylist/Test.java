package Arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import java.util.Iterator;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

class Test{

    public static void main(String[] args) {
    

        ArrayList<String> l=new ArrayList<>();

        // List<String> l1=Collections.synchronizedList(l);  
        //by default Arraylist is non-syncronized but by using Collection.syncronizedlist ,
        // programmmer can make the arraylist object syncronized.

        l.add("Megha");
        l.add("Shradha");
        l.add("Shradha");
        l.add("Sunaina");
        l.add("Jyoti");
        l.add("Anshita");
        l.add("Anshita");

        l.set(4,"Golu");

        Collections.sort(l); //by Collections(Utility Class), one can sort the object
        
        System.out.println( Collections.binarySearch(l, "Anshita"));// list should be sorted otherwise, we will get a unpridictable result. 
        // This method returns index value and if given object is not present then it returns insertion order.
        
        Collections.reverse(l);     //reverse the given list object

        Collections.reverseOrder((String o1, String o2)->o1.compareTo(o2));
  

        // Sort by length using a custom comparator
        // l.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
       
        // l.sort((s1,s2)->s1.compareTo(s2)); //by List sort method that takes comparator object as a paramenter
        
        l.forEach(System.out::println);

        System.out.println("---------------------");

        
        //Remove duplicates from an ArrayList using a HashSet

        Set<String> s=new HashSet<>(l);

        Iterator<String> i=s.iterator();

        while(i.hasNext()){

            System.out.println(i.next());
        }
        

    }
} 
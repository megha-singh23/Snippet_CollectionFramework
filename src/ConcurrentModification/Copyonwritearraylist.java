package ConcurrentModification;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Copyonwritearraylist {

    //insertion order is preserved , duplicate objects are allowed, null insertion is allowed
    //implements Serializable, cloneable, Random Access
    //Iterator fail-safe 
    //works on cloned copy of original objects
    
    public static void main(String[] args) {
        ArrayList<Integer> l=new ArrayList<>();
        l.add(6);
        l.add(4);
        CopyOnWriteArrayList<Integer> list=new CopyOnWriteArrayList<>();  //thread safe version of arraylist object 
        //for every write operation a cloned copy of object is created and on that cloned copy update operation is executed
        //if there is more write operation then copyonwrite arraylist is the worst choice because it creates every time a cloned version of object that affects the performance

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.addIfAbsent(5);
        list.addLast(10);

        list.addAll(l);
        list.forEach(System.out::println);
        list.addAllAbsent(l);
        list.forEach(System.out::println);


        //Iterator of Arraylist can perform remove operation but iterator of copyonwritearaaylist can't 
        //perform remove operation. otherwise we will get run time exception saying unsupportedoperationException

        Iterator<Integer> itr=list.iterator(); //can only perform read operation in copyonwritearraylist
        list.add(99);  //every update operation will be performed on seperate copy Hence after getting
        //iterator if we are trying to perform any modification to the List it won't be reflected to the iterator.

        while(itr.hasNext()){  
            Integer i=(Integer)itr.next();
            if(i%2==0){
                itr.remove();  //RE:UnsupportedOperationException
            }
            System.out.println(i);
        }

        list.forEach(System.out::println);

        
    }

}

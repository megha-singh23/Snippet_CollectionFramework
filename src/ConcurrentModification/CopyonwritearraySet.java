package ConcurrentModification;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyonwritearraySet {
    //Thread-safe version of Set

    //Duplicates are not allowed
    //insertion order preserved
    //null insertion is possible
    //multiple thraeds can able to perform read operation simultaneously but for every update operation a sepearte cloned copy will be created.
    //Hence, if multiple update operation are required then it is not recommended to use copyonwritearrayset
    //Iterator is fail-safe
    //we never going to get concurrentmodificationexception
    //works on cloned copy of original object
    // Iterator cannot perform remove operation if we do then we get a unsupportedoperationexception

    public static void main(String[] args) {
        
        CopyOnWriteArraySet<Integer> set=new CopyOnWriteArraySet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(2);
        set.add(null);

        set.forEach(System.out::println);

        Iterator<Integer> itr=set.iterator(); //can only perform read operation on copyonwritearrayset object
        set.add(99);  //every update operation will be performed on seperate copy Hence after getting
        //iterator if we are trying to perform any modification to the set  it won't be reflected to the iterator.

        while(itr.hasNext()){  
            Integer i=(Integer)itr.next();
            if(i%2==0){
                itr.remove();  //RE:UnsupportedOperationException
            }
            System.out.println(i);
        }

        set.forEach(System.out::println);

    }
}

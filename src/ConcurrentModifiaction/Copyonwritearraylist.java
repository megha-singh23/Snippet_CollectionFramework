package ConcurrentModifiaction;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Copyonwritearraylist {

    //insertion order is preserved , duplicate objects are allowed, null insertion is allowed
    //implements Serializable, cloneable, Random Access
    //Iterator fail-safe 
    
    public static void main(String[] args) {
        
        CopyOnWriteArrayList<Integer> list=new CopyOnWriteArrayList<>();  //thread safe version of arraylist object 
        //for every write operation a cloned copy of object is created and on that cloned copy update operation is executed
        //if there is more write operation then copyonwrite arraylist is the worst choice because it creates every time a cloned version of object that affects the performance

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.addLast(10);

        //Iterator of Arraylist can perform remove operation but iterator of copyonwritearaaylist can't 
        //perform remove operation. otherwise we will get run time exception saying unsupportedoperationException

        Iterator<Integer> itr=list.iterator();
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

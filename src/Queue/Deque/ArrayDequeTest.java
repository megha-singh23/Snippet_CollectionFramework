package Queue.Deque;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDequeTest {
    
    public static void main(String[] args) {

        ArrayDeque<Integer> arr=new ArrayDeque<>();
        arr.add(23);
        arr.add(67);
        arr.add(78);
        arr.add(11);
        arr.add(87);

        arr.forEach(System.out::println);

        arr.addFirst(55);
        arr.addLast(12);

        System.out.println(arr.equals(arr));

        System.out.println(arr.getClass());

        System.out.println(arr.offerFirst(23));

        System.out.println(arr);

        System.out.println(arr.remove(23));

        System.out.println(arr.size());

        System.out.println(arr.toString());

        System.out.println(arr.removeIf(e-> e>=15));

        System.out.println(arr.isEmpty());

        System.out.println(arr.poll());
        
        arr.remove();
        System.out.println(arr.equals(46));

        Iterator<Integer> a=arr.iterator();
        while(a.hasNext()){
            System.out.println(a.next());
        }

        System.out.println(arr.contains(65));

        arr.clear();
        
    }

}


package Arrays;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysTest {
    
    public static void main(String[] args) {
        
        int a[]={1,4,9,2,7,5};

        Arrays.sort(a);   //for primitive data type

        System.out.println(Arrays.binarySearch(a, 9));
        System.out.println(Arrays.binarySearch(a, 3));

        String[] s={"A","Z","B"};
        Arrays.sort(s); //for object

        System.out.println(Arrays.binarySearch(s,"Z"));
        System.out.println(Arrays.binarySearch(s,"S"));

        Arrays.sort(s,(String o1,String o2)->o2.compareTo(o1));
        System.out.println(Arrays.binarySearch(s, "Z",(String o1,String o2)->o2.compareTo(o1)));
        System.out.println(Arrays.binarySearch(s, "S",(String o1,String o2)->o2.compareTo(o1)));
        System.out.println(Arrays.binarySearch(s, "N"));//unpredictable Result

        // Collections.unmodifiableList(l1);   //creates a unmodified list
        // List.of(1,2,3,4,5,6);  //creates a unmodifiable list
        //one could not do operation like add, remove, update in the give List 

        // converting Arrays to List is List.aslist()
        String[] s1={"A","Z","B"};
        List<String> l1=Arrays.asList(s1);  //By using Array reference if we perform any change automatically that change will be reflected to the List.
        //Similarly by using List reference if we perform any change that change will be reflected automatically to the array

        //**By using List Reference we cannot perform any operation which varies the size otherwise we will get runtimeException syaing UnsupportedOperationException
        
        // l1.add("M");  //UnsupportedOperationException
        // l1.remove("Z");//UnsupportedOoperationException
        // l1.set(1,"C"); //supported operation because it do not varies the size of the Array
        
        
        // l1.set(1,new Integer(10)); //RE: ArrayStoreException 


        
        
        
        //** 
        System.out.println(l1);




    }
}

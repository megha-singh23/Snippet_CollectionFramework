package Set;

import java.util.Arrays;
import java.util.HashSet;

public class HashSetfunc {
    
    public void tryHashSet(){

        //Does not store Duplicate-------
        //Does not give a sorted list------------
        HashSet<String> nums=new HashSet<>(Arrays.asList("1 2 3 4 5 2 4 1".split(" ")));
        System.out.println(nums);

        HashSet<String> num=new HashSet<>();
        num.add("Hello");
        num.add("Hii");

        System.out.println(num);

    }
}

package PracticeQues;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates{
    //  public static void tryDuplicate() {
    public static void main(String[] args) {
        
        List<Integer> a=Arrays.asList(1,2,3,4,5,1,4,3);

        ArrayList<Integer> d=new ArrayList<>();

        for (Integer i : a) {
            
            if(a.get(i)!=a.get(i+1)){

                d.add(i);

            }
        }

        System.out.println(d);

    }
}
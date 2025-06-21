package PracticeQues;

import java.util.Arrays;
import java.util.List;

public class Arraylist_missingNo { 

    public static void main(String[] args) {
        
        List<Integer> list=Arrays.asList(1,2,3,null,5);

    //    list.forEach(s->System.out.println(s));

       int nullIndex=-1;
    
       for(int i=0;i<list.size();i++){
        
        if(list.get(i)==null){
            nullIndex=i;
        }
    }        
        for(int i=1;i<=list.size();i++){

            boolean flag=false;

            for (Integer l : list) {

                if(l!=null && l==i){
                    flag=true;
                    break;
                }
            }

            if(!flag){
                System.out.println("Missing No. is: "+ i+ " at "+nullIndex +" index");
                break;
            }

        }
    }
}
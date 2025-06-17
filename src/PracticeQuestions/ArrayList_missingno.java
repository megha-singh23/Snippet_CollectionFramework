package PracticeQuestions;

import java.util.Arrays;
import java.util.List;

public class ArrayList_missingno {
    
    //find the missing No. and index from the arraylist where value is null
    public static void main(String[] args) {
        
        List<Integer> l=Arrays.asList(1,2,3,null,5);

        int nullIndex=-1;
        for(int i=0;i<l.size();i++){

            if(l.get(i)==null){
                nullIndex=i;
            }
        }

        int missNum=Integer.MIN_VALUE;
        System.out.println(nullIndex);

        for(int i=0;i<l.size();i++){

            boolean flag=false;
            for (Integer list : l) {
                
                if(list!=null && list==i){
                    flag=true;
                    // missNum=list.get(i);
                }
            }
            if(!flag){
            
                System.out.println(missNum +" at "+nullIndex);
            }
        }
    }
}

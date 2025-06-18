package PracticeQues;

import java.util.ArrayList;
import java.util.Comparator;

public class Arraylist_missingNo { 

    public static void main(String[] args) {
        
       ArrayList<Integer> list=new ArrayList<>();

       list.add(1);
       list.add(2);  
       list.add(3);
       list.add(null);
       list.add(5);

       list.forEach(s->System.out.println(s));

        // Iterator<Integer> itr=list.iterator();

        // while(itr.hasNext()){

        //     for(int i=0;i<10;i++){
        //         if(itr.equals(i)){
                    
        //         }
        //     }
        // }

        

        if(list.equals(null)){
            
        }
        for(int i=0;i<=list.size();i++){

            for (Integer l : list) {
                if(l!=i && l==null){
                    System.out.println(list.indexOf(null)+" No. is "+l.valueOf(i));
                }
            }

        }
    }
}

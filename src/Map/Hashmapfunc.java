package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hashmapfunc {

    public static void main(String[] args){
        Map<String,Object> list=new HashMap<>();

        list.put("name","Megha Singh");
        list.put("Age",20);
        list.put("Mobileno","9913679328");
        list.put("skills",new String[]{"HTML","CSS","Javascript","Java"}.toString());

         System.out.println(list);

        Set<Entry<String, Object>> s1=list.entrySet();

       Iterator<Entry<String, Object>> itr=s1.iterator();

       while(itr.hasNext()){
            Map.Entry<String,Object> m1=itr.next();

            System.out.println(m1.getKey()+" "+m1.getValue());

       }
    }
    

}

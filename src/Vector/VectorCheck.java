package Vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.RandomAccess;
import java.util.Vector;

public class VectorCheck {

    public void tryVector() {
       
        Vector<String> v=new Vector<>();
        v.add("Megha");
        v.add("Khushi");
        v.add(1, "Jharna");
        v.addElement("Mansi");

        v.remove(1);
        System.out.println(v);
        String x=v.elementAt(1);
        System.out.println(x);

        v.firstElement();

        //-----Enumeration------------------------------
        Enumeration<String> e=v.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement()+" ");
        }

        //------Enums---------------------------
        // EnumsTest.USER=user;       ----is not possible because enums is a set of constants 
        System.out.println(EnumsTest.ADMIN);
        System.out.println(EnumsTest.USER);
        System.out.println(EnumsTest.MANAGER);

        v.addFirst("Jyoti");
        v.addLast("Neeru");

        v.remove(0);
        System.out.println("Print the vector via foreach method....");
        v.forEach(System.out::println);

        System.out.println(v.get(2));
        System.out.println(v.size());
        
        v.sort((e1,e2)->e1.compareTo(e2));

        v.subList(0, 3);

        System.out.println("Search: "+ v.indexOf("Megha"));  //Return -1 when there is no object related to your vector
        System.out.println("Search: "+ v.contains("Jyoti"));

        System.out.println("Print the vector via iterator method....");
        Iterator<String> i=v.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

        System.out.println("Sublist : "+ v.subList(0, 3));

        v.clear();
        


    }
    
}

package LinkedList;

import java.util.LinkedList;
import java.util.List;

public class TryLink {
    
    public static void main(String[] args) {
        
        List<String> l=new LinkedList<>();

        l.add("Megha");
        l.add("jyoti");
        l.add("Jharna");
        l.add("Mansi");
        
        l.add(2,"Shelly");

        l.addFirst("Golu");

        l.addLast("Kavya");

        System.out.println("-----------------"+l.get(3));
        l.forEach(System.out::println);
    }
}

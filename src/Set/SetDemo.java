package Set;

import java.util.TreeSet;

public class SetDemo {
    
    public static void main(String[] args) {

        // TreeSet<String> t=new TreeSet<>();

        // t.add("A");
        // t.add("L");
        // t.add("a");

        TreeSet<StringBuffer> t=new TreeSet<>();


        t.add(new StringBuffer("A"));
        t.add(new StringBuffer("b"));
        t.add(new StringBuffer("D"));
        t.add(new StringBuffer("T"));


        System.out.println(new StringBuffer("A").compareTo(new StringBuffer("T")));//-ve
        System.out.println("a".compareTo("A")); //+ve
        System.out.println("A".compareTo("A")); //0
        // System.out.println("A".compareTo(null)); //NullPointerException


        t.forEach(s->System.out.println(s));

    }
        


}

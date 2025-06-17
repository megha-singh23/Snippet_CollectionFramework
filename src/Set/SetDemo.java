package Set;

<<<<<<< HEAD
import java.util.TreeSet;
=======
import java.util.HashSet;
import java.util.Set;
>>>>>>> a9e4eb966c1dada482a29fb6ea087a9af68c11e2

public class SetDemo {
    
    public static void main(String[] args) {
<<<<<<< HEAD

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
        

=======
        
        Set<Student> s=new HashSet<>();
    
        s.add(new Student(101,"Alice",99.9));
        s.add(new Student(102,"Bob",89.9));
        s.add(new Student(103,"John",96.9));
        s.add(new Student(104,"Kareena",89.9));
        s.add(new Student(106,"Kajol",79.9));
        s.add(new Student(106,"Kajol",79.9));


        s.forEach(System.out::println);





    }
>>>>>>> a9e4eb966c1dada482a29fb6ea087a9af68c11e2

}

package Set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Trytree {
    
    public static void main(String[] args) {
        
        // TreeSet<Integer> t=new TreeSet<>(new Comparator<Integer>() {
        //     @Override
        //     public int compare(Integer o1, Integer o2) {
        //         return o2-o1;
        //     }            
        // });

        // t.add(6);
        // t.add(2);
        // t.add(7);
        // t.add(5);
        // t.add(3);

        // t.forEach(System.out::println);

        TreeSet<Student> s=new TreeSet<>(new Comparator<Student>() {

            @Override
            public int compare(Student o1, Student o2) {
                return -o2.getId()-o1.getId();
            }
            
            
        });
    
        s.add(new Student(101,"Alice",99.9));
        s.add(new Student(102,"Bob",89.9));
        s.add(new Student(103,"John",96.9));
        s.add(new Student(104,"Kareena",89.9));
        s.add(new Student(106,"Kajol",79.9));
        s.add(new Student(106,"Kajol",79.9));

        
        s.forEach(System.out::println);
    }
}

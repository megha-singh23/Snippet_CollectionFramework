package Map;

import java.util.HashSet;
import java.util.Set;

import Set.Student;

public class trySet {
    
    public static void main(String[] args) {
          Set<Student> s=new HashSet<>();
    
        s.add(new Student(101,"Alice",99.9));
        s.add(new Student(102,"Bob",89.9));
        s.add(new Student(103,"John",96.9));
        s.add(new Student(104,"Kareena",89.9));
        s.add(new Student(106,"Kajol",79.9));
        s.add(new Student(106,"Kajol",79.9));


        s.forEach(System.out::println);
    }
}

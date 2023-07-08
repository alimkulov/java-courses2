package collection.map_interface;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeEx1 {
    public static void main(String[] args) {
        Map<Student,Double> map=new HashMap<>();
        Student st1=new Student("John", "Smith",4);
        Student st2=new Student("Jeremy", "Clarkson",3);
        Student st3=new Student("Richard", "Hammond",2);
         map.put(st1,7.5);
         map.put(st2,8.1);
         map.put(st3,9.2);
         System.out.println(map);

        Student st4=new Student("John", "Smith",4);
        Student st5=new Student("Sarah", "Conor",1);
//        boolean result=map.containsKey(st4);
//        System.out.println(result);
        System.out.println(st1.hashCode());
        System.out.println(st4.hashCode());
        System.out.println(st5.hashCode());

    }
}

final class Student{
    final private String name;
    final private String surname;
    final private int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }
}

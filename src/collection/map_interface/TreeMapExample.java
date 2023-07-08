package collection.map_interface;

import java.util.Objects;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {

        TreeMap<Student2,Double > treeMap = new TreeMap<>();
        Student2 st1 = new Student2("John", "Smith", 4);
        Student2 st2 = new Student2("Jeremy", "Clarkson", 3);
        Student2 st3 = new Student2("Richard", "Hammond", 2);
        Student2 st4 = new Student2("Sarah", "Conor", 5);
        Student2 st5 = new Student2("Ban", "Afflek", 1);
        Student2 st6 = new Student2("Jenifer", "Lopez", 2);
        Student2 st7 = new Student2("Angelina", "Jolly", 3);
        treeMap.put(st1,5.8);
        treeMap.put(st7,9.1);
        treeMap.put(st5,6.4);
        treeMap.put(st2,7.5);
        treeMap.put(st4,7.2);
        treeMap.put(st3,8.2);
        treeMap.put(st6,7.9);

        Student2 st8 = new Student2("Angelina", "Jolly", 3);
        System.out.println(treeMap);
        System.out.println(treeMap.containsKey(st8));
//        System.out.println(treeMap.get(6.4));
//        treeMap.remove(5.8);
//        System.out.println(treeMap);
//        System.out.println(treeMap.descendingMap());
//        System.out.println(treeMap.tailMap(7.3));
//        System.out.println(treeMap.headMap(7.9));
//        System.out.println(treeMap.lastEntry());
//        System.out.println(treeMap.firstEntry());


    }

}


final class Student2 implements Comparable<Student2>{
    final private String name;
    final private String surname;
    final private int course;

    public Student2(String name, String surname, int course) {
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

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Student2 student = (Student2) o;
//        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, surname, course);
//    }

    @Override
    public int compareTo(Student2 o) {
        return this.name.compareTo(o.name);
    }
}
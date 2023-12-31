package collection.set_interface;


import java.util.Objects;
import java.util.TreeSet;

public class TreeSetEx2 {

    public static void main(String[] args) {
        TreeSet<Student> treeSet=new TreeSet<>();
        Student st1= new Student("Ivan", 3);
        Student st2= new Student("Nikolay",  2);
        Student st3= new Student("Elena",  1);
        Student st4= new Student("Petr",  4);
        Student st5= new Student("Maria",  5);
        treeSet.add(st1);
        treeSet.add(st2);
        treeSet.add(st3);
        treeSet.add(st4);
        treeSet.add(st5);
        System.out.println(treeSet);
        Student st6= new Student("James",  3);
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
        System.out.println(treeSet.headSet(st6));
        System.out.println(treeSet.tailSet(st6));
        Student st7= new Student("Jerry",  2);
        Student st8= new Student("John",  4);
        System.out.println(treeSet.subSet(st7,st8));

        System.out.println(st8.equals(st4));
        System.out.println(st8.hashCode()==st4.hashCode());
    }
}

class Student implements Comparable<Student> {
    private String name;
    private  int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public int compareTo(Student other) {
        return this.course-other.course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course;
    }

    @Override
    public int hashCode() {
        return Objects.hash(course);
    }
}
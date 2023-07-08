package collection.queue_Interface;

import java.util.Objects;
import java.util.PriorityQueue;

public class PriorityQueueEx1 {
    public static void main(String[] args) {
        Student st1= new Student("Ivan", 3);
        Student st2= new Student("Nikolay",  2);
        Student st3= new Student("Elena",  1);
        Student st4= new Student("Petr",  4);
        Student st5= new Student("Maria",  5);

        PriorityQueue<Student> priorityQueue=new PriorityQueue<>();
        priorityQueue.offer(st1);
        priorityQueue.add(st2);
        priorityQueue.add(st3);
        priorityQueue.add(st4);
        priorityQueue.add(st5);

        System.out.println(priorityQueue);
//        System.out.println(priorityQueue.remove());
//        System.out.println(priorityQueue.remove());
//        System.out.println(priorityQueue.remove());
//        System.out.println(priorityQueue.remove());
//        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
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
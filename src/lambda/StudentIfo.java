package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

class Test{
    public static void main(String[] args) {
        Student st1=new Student("Ivan", 'm',22,3,8.3);
        Student st2=new Student("Nikolay", 'm',28,2,6.4);
        Student st3=new Student("Elena", 'f',19,1,8.9);
        Student st4=new Student("Petr", 'm',35,4,7);
        Student st5=new Student("Mariya", 'f',23,3,9.1);

        ArrayList<Student> students=new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        StudentIfo info=new StudentIfo();

//        Collections.sort(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.course-o2.course;
//            }
//        });
         Collections.sort(students,(s1,s2)->s1.course- s2.course);
         System.out.println(students);
//        info.testStudents(students, new CheckOverGrade()); // uneffective approach
//        System.out.println("---------------------------");
//        info.testStudents(students, new StudentChecks() {  // using anonymous class or interface
//            @Override
//            public boolean check(Student s) {
//                return s.age<30;
//            }
//        });
        System.out.println("------------1---------------");
        info.testStudents(students, (Student s)->{return s.age<30;});
        System.out.println("------------2---------------");
        info.testStudents(students,st->st.age<30);
//        info.printStudentsOverGrade(students,8);
//        System.out.println("---------------------------");
//        info.printStudentsUnderAge(students,30);
//        System.out.println("---------------------------");
//        info.printStudentsMixCondition(students,20,9,'f');

        Predicate<Student> p1=student -> student.avgGrade>7.5;
        Predicate<Student> p2=student -> student.gender=='m';
        System.out.println("----------3-----------------");
        info.testStudents(students,p1.and(p2));
        System.out.println("----------4-----------------");
        info.testStudents(students,p1.or(p2));
        System.out.println("----------5-----------------");
        info.testStudents(students,p1.negate());

        System.out.println("----------Function lambda-----------------");

        System.out.println(avgSmth(students,st->st.avgGrade));
        System.out.println(avgSmth(students,st->(double)st.age));

    }

    private static double avgSmth(List<Student> list, Function<Student,Double> f){
        double result=0;
        for(Student st:list){
            result+=f.apply(st);
        }
        result=result/list.size();
        return result;
    }
}

public class StudentIfo {
    void testStudents(ArrayList<Student> aL, Predicate<Student> pr){   //StudentChecks sc
        for(Student s:aL){
            if(pr.test(s)){   //sc.check(s)
                System.out.println(s);
            }
        }
    }

//    void printStudentsOverGrade(ArrayList<Student> aL, double grade){
//        for(Student s: aL){
//            if(s.avgGrade>grade) {
//                System.out.println(s);
//            }
//        }
//    }
//
//    void printStudentsUnderAge(ArrayList<Student> aL, int age) {
//        for(Student s: aL){
//            if(s.age>age) {
//                System.out.println(s);
//            }
//        }
//    }
//
//    void printStudentsMixCondition(ArrayList<Student> aL,int age, double grade, char gender){
//        for(Student s:aL){
//            if(s.age>age && s.avgGrade<grade && s.gender==gender) {
//                System.out.println(s);
//            }
//        }
//    }
}

//interface StudentChecks{
//    boolean check(Student s);
//}

//class CheckOverGrade implements  StudentChecks{
//    @Override
//    public boolean check(Student s) {
//        return s.avgGrade>8;
//    }
//}
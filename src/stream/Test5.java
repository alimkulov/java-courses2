package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test5 {

    public static void main(String[] args) {
        int[] array={3,8,1,9,5,2,81,19,21,4};
        array=Arrays.stream(array).sorted().toArray();
        System.out.println(Arrays.toString(array));
        System.out.println("-------------------------------------------------------");
        int result=Arrays.stream(array).filter(e->e%2==1).map(e->{if(e%3==0){e=e/3;} return e;}).reduce((a,e)->a+e).getAsInt();
        System.out.println(result );

        System.out.println("-------------------------------------------------------");
        Student st1=new Student("Ivan", 'm',22,3,8.3);
        Student st2=new Student("Nikolay", 'm',28,2,6.4);
        Student st3=new Student("Elena", 'f',19,1,8.9);
        Student st4=new Student("Petr", 'm',35,4,7);
        Student st5=new Student("Mariya", 'f',23,3,9.1);

        List<Student> students=new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        students=students.stream().sorted((x,y)->x.getName().compareTo(y.getName())).collect(Collectors.toList());
        System.out.println(students);
        System.out.println("------------------------chaining-------------------------------");
        students.stream().map(e->{e.setName(e.getName().toUpperCase()); return e;})
                .filter(e->e.getGender()=='f')
                .sorted((x,y)->x.getAge()-y.getAge())
                .forEach(e-> System.out.println(e));


    }
}

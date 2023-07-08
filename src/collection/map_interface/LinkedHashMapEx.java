package collection.map_interface;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class LinkedHashMapEx {

    public static void main(String[] args) {
        LinkedHashMap<Double,Student2> lhp = new LinkedHashMap<>(16,0.75F,true);
        Student2 st1 = new Student2("John", "Smith", 4);
        Student2 st2 = new Student2("Jeremy", "Clarkson", 3);
        Student2 st3 = new Student2("Richard", "Hammond", 2);
        Student2 st4 = new Student2("Sarah", "Conor", 5);

        lhp.put(7.2,st4);
        lhp.put(8.2,st3);
        lhp.put(5.8,st1);
        lhp.put(7.5,st2);
        System.out.println(lhp);
        System.out.println(lhp.get(8.2));
        System.out.println(lhp.get(7.2));
        System.out.println(lhp);
    }
}

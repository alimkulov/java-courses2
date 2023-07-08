package collection.set_interface;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {

    public static void main(String[] args) {
        Set<String> set=new HashSet<>();
        set.add("Almas");
        set.add("James");
        set.add("Richard");
        set.add("Claudi");
        set.add("Claudi");
        set.add(null);
        System.out.println(set);
        for(String s:set){
            System.out.println(s);
        }

        set.remove("Almas");
        System.out.println(set);
        System.out.println(set.isEmpty());
        System.out.println(set.size());
        System.out.println(set.contains("James"));
    }
}

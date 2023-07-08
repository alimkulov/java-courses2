package collection.map_interface;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx1 {

    public static void main(String[] args) {
        Map<Integer,String> map1=new HashMap<>();
        map1.put(1000,"Almas");
        map1.put(1001,"Azamat");
        map1.put(1002,"Saule");
        map1.put(1005,"John");
        map1.put(1020,"Jeremny");
        map1.putIfAbsent(1000,"Steave");
        System.out.println(map1);
        System.out.println(map1.get(1000));
        map1.remove(1005);
        System.out.println(map1);
//        System.out.println(map1.containsValue("Azamat"));
        System.out.println(map1.containsKey(1002));
        System.out.println(map1.keySet());
        System.out.println(map1.values());

        Map<String,String>  map2=new HashMap<>();

        map2.put("Moon","Rise");
        map2.put("Sun","Set");
        System.out.println(map2.values());

    }
}

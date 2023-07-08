package stream;

import java.util.*;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("hello");
        list.add("how are you?");
        list.add("fine");
        list.add("bye");

//        for(int i=0;i<list.size();i++){
//            list.set(i, String.valueOf(list.get(i).length()));
//        }
//
//        System.out.println(list);
        List<Integer> list2=list.stream().map(element->element.length()).collect(Collectors.toList());
        System.out.println(list2);

        System.out.println("----------------------------------------");
        int[] array={5,9,3,8,1};
        array= Arrays.stream(array).map(element->{
            if(element%3==0){
                element=element/3;
            }
            return element;
        }).toArray();
        System.out.println(Arrays.toString(array));

        System.out.println("----------------------------------------");
        Set<String> set=new TreeSet<>();
        set.add("hello");
        set.add("how are you?");
        set.add("fine");
        set.add("bye");
        System.out.println(set);
        Set<Integer> set2=set.stream().map(element-> element.length()).collect(Collectors.toSet());
        System.out.println(set2);
    }
}

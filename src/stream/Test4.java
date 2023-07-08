package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Test4 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(2);
        list.add(4);
        list.add(3);

        int result= list.stream().reduce((accum, el)->accum*el).get();
        System.out.println(result);
        int result2= list.stream().reduce(2,(accum, el)->accum*el);
        System.out.println(result2);

        List<Integer> list100=new ArrayList<>();
        Optional<Integer> o=list100.stream().reduce((accum, el)->accum*el);
        if(o.isPresent()) {
            System.out.println(o.get());
        } else {
            System.out.println("Not Present");
        }

        List<String> list3=new ArrayList<>();
        list3.add("Hello");
        list3.add("how are you?");
        list3.add("fine");
        list3.add("greate");
        String res3=list3.stream().reduce((a,e)->a+" "+e).get();
        System.out.println(res3);

    }
}

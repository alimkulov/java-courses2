package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods5 {

    public static void main(String[] args) {

        ArrayList<String> arrayList1=new ArrayList<>();
        arrayList1.add("Almas");
        arrayList1.add("Ivan");
        arrayList1.add("Maria");

        List<Integer> list1= List.of(3,8,13);
        System.out.println(list1);
       // list1.add(100);

        List<String> list2=List.copyOf(arrayList1);
        System.out.println(list2);
    }
}

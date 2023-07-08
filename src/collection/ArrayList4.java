package collection;

import java.util.Arrays;
import java.util.List;

public class ArrayList4 {

    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder("A");
        StringBuilder sb2=new StringBuilder("B");
        StringBuilder sb3=new StringBuilder("C");
        StringBuilder sb4=new StringBuilder("D");
        StringBuilder[] arrSB={sb1,sb2,sb3,sb4};
        List<StringBuilder> list= Arrays.asList(arrSB);
        System.out.println(list);
        arrSB[0].append("!!!");
        System.out.println(list);
    }
}

package stream;

import java.util.Arrays;

public class Test3 {

    public static void main(String[] args) {
        int[] array={5,9,3,8,1};
        Arrays.stream(array).forEach(el->{el*=2;
            System.out.println(el); });
    }
}

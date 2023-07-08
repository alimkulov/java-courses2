package collection;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack=new Stack<>();
        stack.push("Almas");
        stack.push("John");
        stack.push("James");
        stack.push("Clara");
        System.out.println(stack);
//        while(!stack.isEmpty()){
//            stack.pop();
//            System.out.println(stack);
//        }
        System.out.println(stack.peek());
        System.out.println(stack);

    }
}

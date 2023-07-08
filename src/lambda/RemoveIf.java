package lambda;

import java.util.ArrayList;

public class RemoveIf {
    public static void main(String[] args) {
        ArrayList<String> aL=new ArrayList<>();
        aL.add("Privet");
        aL.add("Poka");
        aL.add("Ok");
        aL.add("Uchim Java");
        aL.add("a Imenno lambdas");
        System.out.println(aL);
        aL.removeIf(x->x.length()<5);
        System.out.println(aL);
    }
}

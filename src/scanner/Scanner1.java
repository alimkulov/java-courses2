package scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
//        System.out.println("vvedite chislo:");
//        int i=sc.nextInt();
//        System.out.println("Vvedennoe chislo:" +i);
//        System.out.println("Napishite dva chisla:");
//        int x=sc.nextInt();
//        int y=sc.nextInt();
//        System.out.println("chastnoe:" + x/y);
//        System.out.println("ostatok:"+x%y);
//
//        System.out.println("Napishite stroku:");
//        String s1= sc.next();
//        System.out.println("vi napisali: "+s1   );
//        System.out.println("vvedite drobnoe chislo:");
//        double d=sc.nextDouble();
//        System.out.println("vvedenno chislo:"+d);

        Scanner sc=new Scanner("Hello my friend\n How are you doing? \n What news ?");
        String s1=sc.next();
        System.out.println(s1);
        String s2=sc.nextLine();
        System.out.println(s2);
        while (sc.hasNext()){
            System.out.println(sc.nextLine());
        }
    }
}

package multithreading;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListEx {
    public static void main(String[] args) throws InterruptedException {
        CopyOnWriteArrayList<String> list=new CopyOnWriteArrayList<>();
        list.add("Almas");
        list.add("John");
        list.add("George");
        list.add("Nevada");
        list.add("Kanzas");
        System.out.println(list);

        Runnable run1=()->{
            Iterator<String> iter=list.iterator();
            while (iter.hasNext()){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(iter.next());
            }
        };

        Runnable run2=()->{
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list.remove(4);
            list.add("Florida");
        };

        Thread t1=new Thread(run1);
        Thread t2=new Thread(run2);
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(list);
    }
}

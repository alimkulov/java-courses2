package multithreading;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapEx {

    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap<Integer,String> map=new ConcurrentHashMap<>();
        map.put(1,"Almas");
        map.put(2,"John");
        map.put(3,"Poal");
        map.put(4,"Chris");
        map.put(5,"Liam");
        System.out.println(map);
        Runnable runnable1=()->{
            Iterator<Integer> iter=map.keySet().iterator();
            while (iter.hasNext()){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Integer i=iter.next();
                System.out.println(i+" : "+map.get(i));
            }
        };

        Runnable runnable2=()->{
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            map.put(6,"Barak");
        };

        Thread thread1=new Thread(runnable1);
        Thread thread2=new Thread(runnable2);

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(map);

    }
}

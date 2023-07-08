package multithreading;

import java.util.concurrent.Semaphore;

public class SemaphoreEx {
    public static void main(String[] args) {
        Semaphore callBox=new Semaphore(2);

        new Person("Almas",callBox);
        new Person("John",callBox);
        new Person("George",callBox);
        new Person("Andrew",callBox);
        new Person("Kate",callBox);

    }
}

class Person extends  Thread {
    String name;
    private Semaphore callbox;
    public Person(String name, Semaphore callbox) {
        this.name=name;
        this.callbox=callbox;
        this.start();
    }

    @Override
    public void run() {
        try {
            System.out.println(name+" jdet...");
            callbox.acquire();
            System.out.println(name+" polzuetsya telephonom");
            sleep(2000);
            System.out.println(name+" zavershil zvonok");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            callbox.release();
        }
    }
}

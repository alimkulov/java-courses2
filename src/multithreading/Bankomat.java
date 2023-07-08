package multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bankomat {
    public static void main(String[] args) {
        Lock lock=new ReentrantLock();
        new Employee("Almas", lock);
        new Employee("Oleg", lock);
        new Employee("Elena", lock);
        new Employee("Viktor", lock);
        new Employee("Marina", lock);
    }
}


class Employee extends Thread{
    String name;
    private Lock lock;
    public Employee(String name, Lock lock){
        this.name=name;
        this.lock=lock;
        this.start();
    }

    @Override
    public void run() {
        if(lock.tryLock()) {
            try {
                System.out.println(name + " Wait...");
                lock.lock();
                System.out.println(name + "Using a bankomat");
                Thread.sleep(2000);
                System.out.println("finished using");

            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        } else {
            System.out.println(name+" doesn't want wait at queue");
        }
    }
}
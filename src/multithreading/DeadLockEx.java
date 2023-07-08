package multithreading;

public class DeadLockEx {
    public static final Object lock1=new Object();
    public static final Object lock2=new Object();

    public static void main(String[] args) {
        Thread10 thread10=new Thread10();
        Thread20 thread20=new Thread20();
        thread10.start();
        thread20.start();
    }

}

class Thread10 extends Thread{
    @Override
    public void run() {
        System.out.println("Thread10: Attemption to lock monitor of object lock1");
        synchronized (DeadLockEx.lock1){
            System.out.println("Thread10: Objects monitor lock1  is locked");
            System.out.println("Thread10: Attemption to lock monitor of object lock2");
            synchronized (DeadLockEx.lock2){
                System.out.println("Thread10: Objects monitor lock1 and lock2 is locked");
            }
        }
    }
}

class Thread20 extends Thread{
    @Override
    public void run() {
        System.out.println("Thread20: Attemption to lock monitor of object lock2");
        synchronized (DeadLockEx.lock2){
            System.out.println("Thread20: Objects monitor lock2  is locked");
            System.out.println("Thread20: Attemption to lock monitor of object lock1");
            synchronized (DeadLockEx.lock1){
                System.out.println("Thread20: Objects monitor lock2 and lock1 is locked");
            }
        }
    }
}
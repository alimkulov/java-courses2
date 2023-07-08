package multithreading;

public class SynchronizedBlock1 {
    public static void main(String[] args) {
        MyRunnableImpl2 runnable=new MyRunnableImpl2();
        Thread thread1=new Thread(runnable);
        Thread thread2=new Thread(runnable);
        Thread thread3=new Thread(runnable);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}


class MyRunnableImpl2 implements Runnable {
    @Override
    public void run() {
        for(int i=0; i<3; i++){
            doWork1();
        }
    }
    private void doWork2(){
        System.out.println("Ura!!!");
    }
    public synchronized void doWork1(){
        doWork2();
        synchronized (this){
        Counter2.count++;
        System.out.println(Counter2.count); }
    }
}


class Counter2{
    volatile static int count=0;
}

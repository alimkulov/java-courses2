package multithreading;

public class VolatileEx extends Thread {
    volatile boolean b=true;

    public void run(){
        long counter=0;
        while(b){
            counter++;
        }
        System.out.println("loop is finished, counter="+counter);
    }


    public static void main(String[] args) throws InterruptedException {
        VolatileEx thread=new VolatileEx();
        thread.start();
        Thread.sleep(3000);
        System.out.println("After 3 second it is time to wake up");
        thread.b=false;
        thread.join();
        System.out.println("End of programm");
    }
}

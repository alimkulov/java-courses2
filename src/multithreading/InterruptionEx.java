package multithreading;

public class InterruptionEx {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main starts");
        InterruptedThread thread=new InterruptedThread();
        thread.start();
        Thread.sleep(2000);
        thread.interrupt();

        thread.join();
        System.out.println("main ends");
    }
}

class InterruptedThread extends Thread{
    double sqrtSum=0;

    @Override
    public void run() {
        for(int i=1;i<=1000000000;i++){
            if(isInterrupted()) {
                System.out.println("Thread is wanted to interrupt");
                System.out.println("mi uvideli chto sostoyanie vseh objectov normalnoe i reshili zavershit rabotu potoka");
                return;
            }
            sqrtSum+=Math.sqrt(i);

            try {
                sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Potok xatyat zavershit vovremya sna. Let's gp to end it");
                return;
            }
        }
        System.out.println(sqrtSum);
    }
}
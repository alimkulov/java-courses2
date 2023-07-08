package multithreading;

import javax.swing.plaf.TableHeaderUI;

public class Ex12 {
     static final Object lock=new Object();
     void mobilaCall() {
         synchronized(lock) {System.out.println("Mobile call start");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Mobile call ends");}
    }

     void skypteCall() {
         synchronized(lock) { System.out.println("Skype call start");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Skype call ends");}
    }

     void whatsappCall() {
         synchronized(lock){
             System.out.println("Whatsapp call start");
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Whatsapp call ends");}

    }

    public static void main(String[] args) {
        Thread thread1=new Thread(new RunnableImplMobile());
        Thread thread2=new Thread(new RunnableImplSkype());
        Thread thread3=new Thread(new RunnableImplWhatsapp());
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class RunnableImplMobile implements Runnable{
    public void run(){
        new Ex12().mobilaCall();
    }
}

class RunnableImplSkype implements Runnable{
    public void run(){
        new Ex12().skypteCall();
    }
}
class RunnableImplWhatsapp implements Runnable{
    public void run(){
        new Ex12().whatsappCall();
    }
}
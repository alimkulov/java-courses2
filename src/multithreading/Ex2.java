package multithreading;

public class Ex2 extends Thread{

        public void run() {
        for(int i=1; i<=1000;i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Ex2 myThread1=new Ex2();
//        MyThread1 myThread2=new MyThread1();

        myThread1.start();
//        myThread2.start();
        for(int i=1000;i>0;i--){
            System.out.println(i);
        }
    }
}

//class MyThread1 extends Thread {
//    public void run() {
//        for(int i=1; i<=1000;i++){
//            System.out.println(i);
//        }
//    }
//}
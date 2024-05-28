package Threaddata;


class MyThread1 extends Thread{
    public void run(){
        int c;
        c=10/0;
    }
}
public class OwnThread {
    public static void main(String[] args) {
        MyThread1 th1=new MyThread1();

        th1.run();
    }
}

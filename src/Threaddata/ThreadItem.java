package Threaddata;


class MyThread2 extends Thread{
    public void run(){

        try {
            this.join();
        }catch (InterruptedException e){
            System.out.println(e);
        }

        for (int i=1;i<=5;i++){
            System.out.println(i+" "+Thread.currentThread().getName());

            try {
                Thread.sleep(200);
            }
            catch (InterruptedException e){

                System.out.println(e);
            }

        }
    }
}
public class ThreadItem {

    public static void main(String[] args) throws InterruptedException{

        MyThread2 th1=new MyThread2();
        th1.start();
        //
        th1.join();
        for (int i=1;i<=5;i++){

            System.out.println(i+" "+Thread.currentThread().getName());

            try {
                Thread.sleep(550);
            }
            catch (InterruptedException e){
                System.out.println(e);

            }
        }

    }
}

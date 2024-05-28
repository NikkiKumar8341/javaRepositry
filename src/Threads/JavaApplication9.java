package Threads;

//class SharedData{

//    private int data;
//
//    private boolean writable=true;
//
//    public void produce(int x){
//
//        if (writable==false)
//            wait();
//        data=x;
//
//        System.out.println("produced: "+x);
//
//        writable=false;
//        notify();
//    }
//
//    public int consume(){
//
//        if (writable==true)
//            wait();
//
//        writable=true;
//        return data;
//    }
//}
//
//
//
//
//
//
//class Producer extends Thread{
//
//    SharedData d;
//
//    public  Producer(SharedData d){
//        this.d=d;
//    }
//
//    public void run(){
//        for (int i=1;i<10;i++){
//            d.produce(i);
//        }
//    }
//
//}
//class Consumer extends Thread{
//
//    SharedData d;
//
//    public  Consumer(SharedData d){
//        this.d=d;
//    }
//
//    public void run(){
//        for (int i=1;i<10;i++){
//            System.out.println("consumed value is: "+d.consume());
//        }
//    }
//}
//public class JavaApplication9 {
//
//    public static void main(String[] args) {
//
//        SharedData d=new SharedData();
//
//        Producer p=new Producer(d);
//
//        Consumer c=new Consumer(d);
//
//        p.start();
//        c.start();
//
//    }
//}

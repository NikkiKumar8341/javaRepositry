package Threaddata;


class ThreadRunn implements Runnable{

//    ThreadRunn(){
//        new ThreadRunn().start();
//    }

    public void run(){
        for (int i=0;i<=10;i++){
            System.out.println(i+" "+Thread.currentThread().getName());
        }
    }

}
public class ThreadRun{

    public static void main(String[] args) {

        ThreadRunn threadRunn=new ThreadRunn();
        Thread th1=new Thread(threadRunn);
        th1.start();
    }
}

package Threaddata;

public class Company {
    int n;
    boolean f=false;
    //f=false:chance :producer

    synchronized public void produce_item(int n){
        if (f){
        }
        this.n=n;
        System.out.println("Produced :"+this.n);
    }

    synchronized public int consume_item(){

//        if (!f){
//            wait(1000);
//        }

        System.out.println("consumed :"+this.n);
        f=false;
        notify();

        return this.n;
    }
}

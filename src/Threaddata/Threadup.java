package Threaddata;

class UserTHread extends Thread{
    public void run(){
        System.out.println("this is user defined code");
    }
}

public class Threadup {

    public static void main(String[] args) {
        System.out.println("program started");

        int x=56+34;

        System.out.println("sum is "+x);
        Thread t=Thread.currentThread();
        String tname=t.getName();

        System.out.println("Current running thread "+tname);

        //setName

        t.setName("MyMain");

        System.out.println(t.getName());

        try {
            Thread.sleep(5000);
        }catch (Exception e){

        }


        System.out.println(t.getId());

        //goming user defined thred
        System.out.println("program ended..");

        UserTHread thread=new UserTHread();
        thread.start();
    }
}

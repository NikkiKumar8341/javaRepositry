package master_lamdba;

public class ThreadDemo extends Thread {


    public static void main(String[] args) throws Exception {

        Runnable thread1=()->{


            for (int i=1;i<=10;i++){
                System.out.println("values of i is "+i);

                try {
                    Thread.sleep(1500);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }

            }
        };


        Thread t=new Thread(thread1);
        t.setName("nikhil");
        t.start();

        Runnable t2=()->{
            try {

                for (int i=1;i<=10;i++){
                    System.out.println("values in Thread 2 : "+i*3);
                    Thread.sleep(1000);
                }
            }catch (InterruptedException e){

                e.printStackTrace();
            }
        };

        Thread t22=new Thread(t2);
        t22.start();
    }

}

package Threads;

class Table{

    public synchronized static void dispaly(int n)
    {
        System.out.println("table is " + n);
        synchronized (Table.class) {
            for (int i = 1; i <= 10; i++)
                System.out.println(n * i);
        }
    }
}

class Thread1 extends Thread{
    Table t;

//    public Thread1(Table t){
//        this.t=t;
//    }

    public void run(){
        t.dispaly(5);
    }
}

class Thread2 extends Thread{
    Table t;

//    public Thread2(Table t){
//        this.t=t;
//    }

    public void run(){
        t.dispaly(6);
    }
}




public class Java8Thread {

    public static void main(String[] args) {

        Table table=new Table();

        Thread1 th1=new Thread1();

        Thread2 th2=new Thread2();

        th1.start();
        th2.start();
    }
}

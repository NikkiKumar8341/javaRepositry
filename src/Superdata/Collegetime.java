package Superdata;

public class Collegetime {

    void start(){
        System.out.println("college gate opens at 8");
    }
}
class Student extends Collegetime{

    void Student(){
        System.out.println();
    }
    void lunch(){
        System.out.println("lunch start at 1pm");
    }
    void work(){
        super.start();
        lunch();
    }

    public static void main(String[] args) {
        Student detail1=new Student();
        detail1.work();
    }
}

package Superdata;

public class StudentFinal {

    final String collegename="srec";
    //we cannot change value of final
    final void start(){
        System.out.println("running..."+collegename);
    }
}
class StudentFinally extends StudentFinal{

    public static void main(String[] args) {
        new StudentFinally().start();
    }

}

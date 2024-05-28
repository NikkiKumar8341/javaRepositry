package Superdata;

public class College {
    static String collegename="sr";
}
class Students extends College{
    static String collegename="sr college";

    void data(){
        System.out.println(collegename);
        System.out.println(super.collegename);
    }

    public static void main(String[] args) {
        Students details=new Students();

        details.data();

    }
}

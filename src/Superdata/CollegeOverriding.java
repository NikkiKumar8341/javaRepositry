package Superdata;

public class CollegeOverriding {
    static String collegename="sr";
    void show(){
        System.out.println("welcome to "+collegename+" college");
    }


}
class Studentdetails extends CollegeOverriding {
    void show() {
        System.out.println("welocme to our college " + collegename);
    }

    public static void main(String[] args) {
        Studentdetails data2 = new Studentdetails();

        data2.show();
    }
}

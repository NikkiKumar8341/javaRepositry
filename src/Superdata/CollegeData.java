package Superdata;

public class CollegeData {

    int id;
    String name;

    String course="c.s.e";

    void welcome(){
        System.out.println("welcome to our college");
    }

    CollegeData(){
        System.out.println("college data");
    }

    void CollegeData(int id,String name){
        System.out.println("default data");
        this.id=id;
        this.name=name;
    }

    void CollegeData(int id,String course,String name){
        System.out.println("details with course");
        this.id=id;
        this.course=course;
    }
}
class StudentObject extends CollegeData{

    StudentObject(){
        super();
        System.out.println("student data");
    }

    void welcome(){
        System.out.println("good morning ");

    }

    public static void main(String[] args) {

        StudentObject data1=new StudentObject();
        data1.welcome();
    }

}
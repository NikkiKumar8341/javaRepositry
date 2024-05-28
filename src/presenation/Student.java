package presenation;

public class Student {
    int id;
    String name;
    String course;
    static String collegename="sr";

    public Student(int id,String name){
        System.out.println("hi default constructor");
        this.id=id;
        this.name=name;
    }
    public Student(int id,String name,String course){
        this(id,name);
        this.id=id;
        this.name=name;
        this.course=course;
    }

    void display(){
        System.out.println(id+" "+name+" "+course);
    }

    public static void main(String[] args) {
        Student data1=new Student(10,"nikki");
        data1.display();
    }
}

package presenation;

public class StudentOverrloading {

    public String show(String name){
        System.out.println("hi");
        return name;
    }

    public String show(String name,String surname){
        System.out.println("hello");
        return name+surname;
    }

    public static void main(String[] args) {
        StudentOverrloading data3=new StudentOverrloading();
        System.out.println(data3.show("nikii"));
        System.out.println(data3.show("nikhil","king"));

    }

}

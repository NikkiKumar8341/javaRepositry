package presenation;

public class Studentcopy {
    int id;
    String name;


    public Studentcopy(){}

    public Studentcopy(int id,String name){
        this.id=id;
        this.name=name;
    }

    void display(){
        System.out.println(id+" "+name);
    }

    public static void main(String[] args) {
        Studentcopy data2=new Studentcopy(101,"nikki");
        Studentcopy data3=new Studentcopy();
        data3.id= data2.id;
        data3.name= data2.name;

        data2.display();
        data3.display();
    }
}

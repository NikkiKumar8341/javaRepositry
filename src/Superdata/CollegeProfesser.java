package Superdata;

public class CollegeProfesser {

    void welcome(){
        System.out.println("welcome to college");
    }
    int id;
    String name;

    String course;

    CollegeProfesser(){}

    CollegeProfesser(int id,String name){
        System.out.println("hi");
        this.id=id;
        this.name=name;
    }

    CollegeProfesser(int id,String name,String course){
        this(id,name);
        this.id=id;
        this.name=name;
    }



    void greeting(){
        System.out.println("good morinring");

        this.welcome();
    }

    public static void main(String[] args) {
        CollegeProfesser data=new CollegeProfesser();
        data.greeting();

        CollegeProfesser data1=new CollegeProfesser(101,"nikki","react");

    }
}

package patterns;

public class A {
    public void show() {
        System.out.println("in A");
    }

}

abstract class  Car{

    String model;
    public abstract void drive();


    public void playMusic(){
        System.out.println("play in Music");
    }
}

class Audi extends Car
{

    @Override
    public void drive() {
        System.out.println("striving");
    }

    @Override
    public void playMusic() {
        System.out.println("sony music");
    }
}
class B extends A{

    public void show2(){
        System.out.println("in B show");
    }

    public static void main(String[] args) {
        //upcasting
        A ki=(A)new B();
       ki.show();

       //downcasting
       B obj1=(B) ki;
       obj1.show2();

       Car bi=new Audi();
       bi.model="mcdkn";
        System.out.println(bi.model);
       bi.playMusic();
    }

}

interface Computer{
    void code();
}

class Laptop implements Computer{
    @Override
    public void code() {
        System.out.println("code , compile, run");
    }
}
class Desktop implements Computer{

    @Override
    public void code() {
        System.out.println("code, compolie ,run:faster ");
    }
}

class Developer{

    public void devApp(Computer lap){
        lap.code();
    }
}

class  Demo{
    public static void main(String[] args) {
        Computer lap=new Laptop();
        Computer desk=new Desktop();

        Developer nikhil=new Developer();
        nikhil.devApp(desk);
    }
}






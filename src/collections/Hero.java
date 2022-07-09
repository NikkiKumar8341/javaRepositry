package collections;

public class Hero implements Actor{

    public void act(){
        System.out.println(" ican act");
    }

    @Override
    public void speak() {
        System.out.println(" I can Speak");
    }

    public void comedy(){
        System.out.println("i can ppl laugh");
    }
}

class Villain implements Actor{
    @Override
    public void act() {
        System.out.println(" ican act");
    }

    @Override
    public void speak() {
        System.out.println("i can speak");
    }


    public void rude(){
        System.out.println(" im Rude");
    }
}

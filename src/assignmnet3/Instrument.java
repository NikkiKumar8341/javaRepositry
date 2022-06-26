package assignmnet3;

abstract class Instrument {
    abstract void  play();
}

class Piano extends Instrument{

    void play(){
        System.out.println("tan tan tan tan");
    }
}
class Flute extends Instrument{

    void play(){
        System.out.println("toot toot toot toot");
    }
}

class Guitar extends Instrument{
    void play(){
        System.out.println("tin tin");
    }
}
class Main{
    public static void main(String[] args) {
        Instrument ob=new Flute();
        ob.play();
        ob=new Guitar();
        ob.play();
        ob=new Flute();

    }
}

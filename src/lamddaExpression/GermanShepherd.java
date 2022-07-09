package lamddaExpression;

public class GermanShepherd {

    public static void main(String[] args) {
        Dog dog=()->{
            System.out.println("german shepherd");
        };

        dog.bark();
    }
}

package lamdda;

interface Calculator{
    void switchOn();


}

public class CalculatorImpl{




    public static void main(String[] args) {

      Calculator calculator=  ()->{
            System.out.println("switch on");
        };



      calculator.switchOn();
    }
}

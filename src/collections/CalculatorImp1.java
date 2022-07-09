package collections;


interface Calcultor{
//    void switchon();
//    void sum(int input);

    int subtract(int i1,int i2);

}

public class CalculatorImp1{

    public static void main(String[] args) {
//        Calcultor calcultor=()->{
//
//            System.out.println("Switch on");
//        };
//
//        calcultor.switchon();

//        Calcultor calcultor=(input)-> System.out.println("sum:"+input);
//
//        calcultor.sum(345);

        Calcultor calcultor=(i1, i2) ->{
          if (i2<i1){
              throw  new RuntimeException("exception");
          }else {
              return i2-i1;
          }
        };

        System.out.println("answer"+calcultor.subtract(8,20));



    }
}

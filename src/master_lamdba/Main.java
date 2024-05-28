package master_lamdba;

public class Main {

    public static void main(String[] args) {
        System.out.println("my  System starts..");


//        MyINterImpl myINter=new MyINterImpl();
//        myINter.sayHello();

        Myinter i=new Myinter() {
            @Override
            public void sayHello() {
                System.out.println("this is first anonymous class");
            }
        };

        i.sayHello();

        Myinter i2=new Myinter() {
            @Override
            public void sayHello() {
                System.out.println("this is second anonoyms class ");
            }
        };

        i2.sayHello();

        Myinter i3=()->{
            System.out.println("this first time iam using lamdba");
        };

        i3.sayHello();


        SumInter sumInter=(a,b)->{
           return a+b;
        };

        System.out.println("sum is"+sumInter.sum(4,6));

        LengthInter lengthInter=(str -> str.length());

        System.out.println("string length: "+lengthInter.getLength("nikhil kumar"));
    }
}

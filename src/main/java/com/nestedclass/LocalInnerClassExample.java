package com.nestedclass;

public class LocalInnerClassExample {
    public static void main(String[] args) {
        class InsideMethod{
            public void getInsideMethod(){
                System.out.println("it is about local Inner class");
            }
        }
        InsideMethod insideMethod=new InsideMethod();
        insideMethod.getInsideMethod();//we are creating object inside the outerclass method and outside the inner class.
    }
}

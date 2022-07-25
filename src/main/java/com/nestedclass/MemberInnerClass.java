package com.nestedclass;

public class MemberInnerClass {
    class InnerClass{
        void display(){
            System.out.println("i a innerclass");
        }
    }
    public static void main(String[] args) {
            MemberInnerClass memberInnerClass=new MemberInnerClass();
            InnerClass innerClass=memberInnerClass.new InnerClass();//one way of accessing inner class method.
            innerClass.display();
            InnerClass innerClass1=new MemberInnerClass().new InnerClass();//another way to accessing inner class method.
            innerClass1.display();
    }
}

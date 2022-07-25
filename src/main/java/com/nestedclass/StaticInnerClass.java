package com.nestedclass;

public class StaticInnerClass {
    static String name="sandeep";
    static int age=24;
    static class InnerClass{
        void getName(){
            System.out.println("name is "+name);
        }
        static void getAge(){
            System.out.println("your age "+age);
        }
    }
    public static void main(String[] args) {

        StaticInnerClass.InnerClass innerClass=new StaticInnerClass.InnerClass();
        innerClass.getName();//we are accessing the non static method with object
        StaticInnerClass.InnerClass.getAge();//we are accessing static method.
    }
}

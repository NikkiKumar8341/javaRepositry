package com.nestedclass;
abstract class Man{
    abstract void eat();
}

abstract public class AnonimousInnerClass extends  Man  {
    abstract void sleep();
    public static void main(String[] args) {
       AnonimousInnerClass anonimousInnerClass= new AnonimousInnerClass(){
           void eat() {
               System.out.println("to survive man have to eat");
           }

           public void sleep(){
                System.out.println("After eating he have to sleep");
            }
        };
       anonimousInnerClass.eat();
        anonimousInnerClass.sleep();
    }
}

package com.nestedclass;
class Light{
    interface CeilingLight{
      public  void fittedTo();//method in the inner interface
    }
}

public class NestedInterfaceExample implements Light.CeilingLight {
    public static void main(String[] args) {
        NestedInterfaceExample nestedInterfaceExample=new NestedInterfaceExample();//to access we are creating the object
        nestedInterfaceExample.fittedTo();
        Light.CeilingLight ceilingLight=new NestedInterfaceExample();//upcating the object
        ceilingLight.fittedTo();

    }

    public void fittedTo() {//implementation in the derived class
        System.out.println("it will fitted to ceiling");
    }
}

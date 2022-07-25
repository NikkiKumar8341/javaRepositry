package com.packages.pack1;
class Animal{
    void getAnimal(){
        System.out.println("i am pack animal");
    }
}

public class UsingFullyQualifiedName {
    public static void main(String[] args) {
        com.packages.pack.Animal animal=new com.packages.pack.Animal();
        animal.getAnimal();
        com.packages.pack1.Animal animal1=new com.packages.pack1.Animal();
        animal1.getAnimal();
    }
    public void fullyQualifiedName(){
        System.out.println("fullyQualified name");
    }
}

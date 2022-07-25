package com.packages.pack1;
import com.packages.pack.*;
//we can access all classes and interface in that package
public class UsingImporting {
    public static void main(String[] args) {
        Employee employee=new Employee();
        employee.setName("hari");
        System.out.println(employee.getName());
        UsingFullyQualifiedName usingFullyQualifiedName=new UsingFullyQualifiedName();
        usingFullyQualifiedName.fullyQualifiedName();
    }
}

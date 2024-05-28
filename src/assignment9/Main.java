package assignment9;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {

    public static void main(String[] args) throws ParseException, IOException, ClassNotFoundException {

        try{

            SimpleDateFormat spm = new SimpleDateFormat("dd/MM/yyyy");
            Employee e = new Employee("nikhil",spm.parse("13/07/2000"),"development",12222.89);

            Employee e1=new Employee("nikki",spm.parse("2/09/1988"),"tester",123455);

            FileOutputStream f = new FileOutputStream("abc.txt");
            ObjectOutputStream o = new ObjectOutputStream(f);
            o.writeObject(e);
            o.writeObject(e1);
            System.out.println(e +" "+e1);




            //closing the stream
            o.close();
            System.out.println("success");
        }
        catch(Exception e){System.out.println(e);}

//        System.out.println("-----------------------------");
//        FileInputStream f1 = new FileInputStream("abc.txt");
//        ObjectInputStream o1 = new ObjectInputStream(f1);
//
//        Employee e3=(Employee)o1.readObject();
//        Employee e2 = (Employee)o1.readObject();
//        System.out.println(e3.getDepartment()+" "+e3.getName()+" "+e3.getSalary()+" "+e3.getDateofBirth());
//        System.out.println(e2.getDepartment()+" "+e2.getName()+" "+e2.getSalary()+" "+e2.getDateofBirth());
    }
}

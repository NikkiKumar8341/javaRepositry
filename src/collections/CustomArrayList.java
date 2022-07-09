package collections;

import java.util.*;
import java.util.stream.Collectors;

public class CustomArrayList extends ArrayList {

    public boolean add(Object o){
        //element conatain in the list it is true
        if(this.contains(o)){
            return true;

            // add to the object
        }else {
            return super.add(o);
        }
    }


    public static void main(String[] args) {

        CustomArrayList list1=new CustomArrayList();
        list1.add(0);
        list1.add(0);
        list1.add(1);
        list1.add(1);
        list1.add(2);
        list1.add(3);

        System.out.println(list1);
        Student s = new Student(12 ,"fgg");
        System.out.println(s);



        List<Student> studentlist=new ArrayList<Student>();

        studentlist.add(new Student(100,"nikhil"));
        studentlist.add(new Student(102,"akhil"));

        Iterator<Student> i=studentlist.iterator();
        while (i.hasNext()){
            Student ee=i.next();

            if(ee.getId()==102){
                System.out.println(ee.getId()+" "+ee.getName());
            }
        }

        List<Student> fi=studentlist.stream().filter(t->t.getId()==101).collect(Collectors.toList());

        fi.forEach(t-> System.out.println(t.getId()+"  "+t.getName()));



//        Set<Student> set=new HashSet<>();
//
//        Set.add(new Student(101,"nikhil"));
//
//        Student s1=new Student(101,"nikhil");
//        Student s2=new Student(101,"nikhil");
//        Student s3=new Student(102,"akhil");
//        Student s4=new Student(103,"nikki");
//        Student s5=new Student(102,"akhil");
//        set.add(s1);
//        set.add(s2);
//        set.add(s3);
//        set.add(s4);
//        set.add(s5);

    }
}

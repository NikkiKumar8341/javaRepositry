package lamddaExpression;

import java.util.*;
import java.util.stream.Collectors;
import java.util.Arrays;

public class StreamExample {

    public static void main(String[] args) {
        List<Employee> li=new ArrayList<>();
        li.add(new Employee(101,"nikhil",25,25000,"Hyderabad"));
        li.add(new Employee(104,"akhil",22,25000,"Warangal"));
        li.add(new Employee(105,"Ramya",65,300000,"eastgodavari"));
        li.add(new Employee(103,"venu",35,55000,"Delhi"));
        li.add(new Employee(102,"murali",55,65000,"banglore"));

        System.out.println("========================printing all objects in the list=====================");
        li.forEach((e)->System.out.println(e.getId()+" "+e.getName()+" "+e.getAge()+" "+e.getSalary()+" "+e.getCity()));

        System.out.println("===================getting sorted list by id==========================");
//        List<Integer> num=li.stream().sorted(Comparator.comparing(Employee::getCity,String.l).collect(Collectors.toList());
//        num.forEach(((e2)-> System.out.println(e2.getId()+" "+e2.getName()+" "+e2.getAge()+" "+e2.getSalary()+" "+e2.getCity());
        List<Employee> em=li.stream().sorted(Comparator.comparingInt(Employee::getId)).collect(Collectors.toList());
        em.forEach((e)->System.out.println(e.getId()+" "+e.getName()+" "+e.getAge()+" "+e.getSalary()+" "+e.getCity()));


        List<Employee> lt=li.stream().sorted(Comparator.comparingInt(e->e.getCity().length())).collect(Collectors.toList());
        System.out.println("===============depending of length of the name==============");
        lt.forEach(e->System.out.println(e.getName()+" "+e.getCity()+" "+e.getSalary()+" "+e.getId()));

        System.out.println("====================to uppercase first letter=========================");
        List<String>lt1= li.stream().map(e->e.getName().substring(0,1).toUpperCase()+e.getName().substring(1)).collect(Collectors.toList());
        System.out.println(lt1);
        li.stream().forEach(employee -> System.out.println(employee));




        System.out.println("==============name wise order===============================");
        List<Employee> list=li.stream().sorted(Comparator.comparing(Employee::getName,String.CASE_INSENSITIVE_ORDER)).collect(Collectors.toList());
        list.forEach((e)->System.out.println(e.getId()+" "+e.getName()+" "+e.getAge()+" "+e.getSalary()+" "+e.getCity()));

        System.out.println("================getting lowestcase cityname name object=============================");
        Optional<Employee> emp=li.stream().min(Comparator.comparing(Employee::getCity,String.CASE_INSENSITIVE_ORDER));
        System.out.println(emp.get().getId()+" "+emp.get().getCity());

        System.out.println("==============max age  wise ===============================");

        Optional<Employee> emp1=li.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getAge)));
        System.out.println(emp1.get().getId()+" "+emp1.get().getName()+" "+emp1.get().getSalary()+" "+emp1.get().getAge());

        System.out.println("===================get first object==========================");
        Optional<Employee> emp2=li.stream().findFirst();
        System.out.println(emp2.get().getId()+" "+emp2.get().getAge()+" "+emp2.get().getName()+" "+emp2.get().getCity());

        System.out.println("===============getting number objects in the list==============================");
        System.out.println(li.stream().count());
        System.out.println("=====================using filter method and getting the object========================");
        List<Employee> fi=li.stream().filter((e)->e.getSalary()>=55500).collect(Collectors.toList());
        fi.forEach((e)->System.out.println(e.getId()+" "+e.getName()+" "+e.getAge()+ " "+e.getSalary()+" "+e.getCity()));
        System.out.println("==========================checks the object values is there or not===================");
        Boolean b=li.stream().filter((e)->e.getSalary()==65000).findAny().isPresent();
        System.out.println(b);

        int[] arr1 = {5,8,1,0,6,9,50,-3};
        // Iterating array elements
        for (int i : arr1) {
            System.out.print(i+" ");
        }

        // Sorting array elements parallel and passing start, end index
        Arrays.parallelSort(arr1,0,2);
        System.out.println("\n Array elements after sorting");
        // Iterating array elements
        for (int i : arr1) {
            System.out.print(i+" ");
        }
    }
}

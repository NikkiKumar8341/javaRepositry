package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class DataBase {

    public static List<Employee> getEmployees(){
        List<Employee> li=new ArrayList<>();
        li.add(new Employee(101,"nikhil",25,25000,"Hyderabad"));
        li.add(new Employee(104,"akhil",22,25000,"Warangal"));
        li.add(new Employee(105,"ram",65,600000,"eastgodavari"));
        li.add(new Employee(103,"venu",35,55000,"Delhi"));
        li.add(new Employee(102,"murali",55,65000,"banglore"));

        return li;
    }

    public static List<Employee> getEmployesList(){
        List<Employee>  employeeList=new ArrayList<>();
        Random random=new Random();

        String[] cities = {"Hyderabad", "New York", "London", "Paris", "Tokyo", "Sydney"};

        for (int i = 1; i <= 1000; i++) {
            int randomAge = random.nextInt(43) + 18; // Random age between 18 and 60
            float randomSalary = random.nextFloat() * 100000;// Random salary between 0 and 100000
            String randomCity=cities[random.nextInt(cities.length)];
            employeeList.add(new Employee(i, "employee" + i, randomAge, randomSalary,randomCity));
        }

        return employeeList;
    }


    public static void main(String[] args) {

        List<Employee> employees = DataBase.getEmployesList();

        List<Employee> filterEmployee=employees.stream()
                .filter(employee -> {
                    return employee.getSalary() >70000;
                }).collect(Collectors.toList());


        filterEmployee.forEach(System.out::println);

    }


}

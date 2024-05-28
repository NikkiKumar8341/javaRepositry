package Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TaxService {

    public List<Employee> evaluateTaxUser(String input){

        if(input.equalsIgnoreCase("tax")){
            return DataBase.getEmployees().stream().filter(employee -> {
                return employee.getSalary() > 55000;
            }).collect(Collectors.toList());
        }
        else {
            return DataBase.getEmployees().stream().filter(employee -> employee.getSalary() <=55000).collect(Collectors.toList());
        }

    }

    public static void main(String[] args) {
        TaxService service=new TaxService();

        System.out.println(service.evaluateTaxUser("non tax"));

        List<Employee> employeeList=DataBase.getEmployees();

        List<Employee> employeeList1=DataBase.getEmployesList();



        Collections.sort(employeeList,new MyComparator());

//        System.out.println(employeeList);


        employeeList.stream().sorted(Comparator.comparing(emp -> emp.getAge())).forEach(System.out::println);



    }
}
class MyComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        return (int) (o1.getSalary()- o2.getSalary());
    }
}

package Stream;

import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ForEachDemo {

    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();


        List<Employee> employees = DataBase.getEmployesList();

        System.out.println(employees+"employeee");


//       DataBase.getEmployesList().stream()
//                .filter((employee)->employee.getSalary()>500000).forEach(employee -> System.out.println(employee));

//       dataData.getEmployesList().stream()
//                       .filter((employee)->employee.getSalary()>500000).forEach(employee -> System.out.println(employee));


        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        map.put(4,"d");

        map.forEach((key,value)-> System.out.println("key :"+key+ "value :"+value));

        map.entrySet().stream().filter(k->k.getKey()%2==0).forEach(obj-> System.out.println(obj));
    }
}

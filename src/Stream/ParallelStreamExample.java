package Stream;

import java.util.List;
import java.util.stream.IntStream;

public class ParallelStreamExample {


    public static void main(String[] args) {
        long start=0;
        long end=0;

        start=System.currentTimeMillis();
        IntStream.range(1,100).forEach(System.out::println);
        end=System.currentTimeMillis();

        System.out.println("plain stream took time: "+(end-start));

        System.out.println("/////////////////////////////////////");
        start=System.currentTimeMillis();
        IntStream.range(1,100).parallel().forEach(System.out::println);
        end=System.currentTimeMillis();
        System.out.println("parallel stream took time: "+(end-start));

        List<Employee> employeeList=DataBase.getEmployesList();

        start=System.currentTimeMillis();
        double salaryWithStream = employeeList.stream().map(Employee::getSalary).mapToDouble(i -> i).average().getAsDouble();
        end=System.currentTimeMillis();

        System.out.println("Noraml Stream execution time: "+(end-start) +" salarywith stream"+salaryWithStream);
        start=System.currentTimeMillis();
        double salaryWithParallel = employeeList.parallelStream()
                .map(Employee::getSalary)
                .mapToDouble(i -> i).average().getAsDouble();
        end=System.currentTimeMillis();

        System.out.println("parallel Stream execution time: "+(end-start) +" salarywith parallel stream"+salaryWithParallel);
    }
}

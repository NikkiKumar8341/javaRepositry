package assignment9;

import java.io.Serializable;
import java.util.Date;

public class Employee implements Serializable {
    String name;
    Date dateofBirth;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dateofBirth=" + dateofBirth +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Employee() {

    }

    String department;
    double salary;

    public Employee(String name, Date dateofBirth, String department, double salary) {
        this.name = name;
        this.dateofBirth = dateofBirth;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateofBirth() {
        return dateofBirth;
    }

    public void setDateofBirth(Date dateofBirth) {
        this.dateofBirth = dateofBirth;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

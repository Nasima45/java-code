package org.javaDev.StreamQuestion;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

class Employee{
    String name;
    Integer salary;
    String email;
    String department;

    public Employee(String name, Integer salary, String email, String department) {
        this.name = name;
        this.salary = salary;
        this.email = email;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", email='" + email + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
public class SecondHighestSalary {
    public static void main(String[] args) {
        List<Employee> employeeList= Arrays.asList(
                new Employee("paro",1200,"nasim@gmail","hr"),
                new Employee("kuhu",1100,"im@gmail","dev"),
                new Employee("naj",1900,"na@gmail","test"),
                new Employee("nasu",7000,"m@gmail","dev")
                );
        Optional<Employee> secHighSalary = employeeList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
                .skip(1)
                .findFirst();
        System.out.println(secHighSalary);
        employeeList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
                .skip(1)
                .findFirst()
                .ifPresent(System.out::println);
        Optional<Integer> justSalary=employeeList.stream().map(Employee::getSalary)
                .distinct().sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
        System.out.println("just salary print :" + justSalary);

        List<Integer> list = Arrays.asList(3,2,1,4,5);
        //descending
        list.stream().sorted().skip(1).findFirst()
                .ifPresent(System.out::println);
        list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst()
                .ifPresent(System.out::println);
    }
}

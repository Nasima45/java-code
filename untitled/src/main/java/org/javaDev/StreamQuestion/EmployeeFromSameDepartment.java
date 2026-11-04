package org.javaDev.StreamQuestion;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeFromSameDepartment {
    public static void main(String[] args) {
        List<Employee> employeeList= Arrays.asList(
                new Employee("paro",1200,"nasim@gmail","hr"),
                new Employee("kuhu",1100,"im@gmail","dev"),
                new Employee("naj",1900,"na@gmail","test"),
                new Employee("nasu",7000,"m@gmail","dev")
        );
        Map<String,List<Employee>> sameDept = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println(sameDept);
    }
}

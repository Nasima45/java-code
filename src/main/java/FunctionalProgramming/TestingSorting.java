package FunctionalProgramming;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class Employee {
    private final String name;
    private final int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class TestingSorting {
    static void main() {
        List<Employee> emp = List.of(
                new Employee("kuhu", 25),
                new Employee("paro", 45),
                new Employee("nasu", 34)
        );
        List<String> list = List.of("1", "5", "3");
        list.stream().map(Integer::parseInt).
                map(n -> Math.pow(n, 2)).
                reduce(Double::sum).
                ifPresent(System.out::println);


        List<Employee> sorted = emp.stream().
                sorted((emp1, emp2) -> Integer.compare(emp1.getAge(), emp2.getAge())).
                collect(Collectors.toList());
        System.out.println(sorted);

    }
}

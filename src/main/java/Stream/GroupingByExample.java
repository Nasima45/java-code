package Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
class Employee {
    String dept;
    String name;
    Integer salary;

    public Integer getSalary() {
        return salary;
    }

    public Employee(String dept, String name, Integer salary) {
        this.dept = dept;
        this.name = name;
        this.salary=salary;
    }

    public String getDept() {
        return dept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "dept='" + dept + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public String getName() {
        return name;
    }
}
public class GroupingByExample {
    static void main() {
        List<String> students =
                Arrays.asList("paro", "naj", "kj", "aditi", "aheli");
        List<Integer> age= Arrays.asList(23,12,54,27,28);
        System.out.println(students.stream().collect(Collectors.groupingBy(x->x.length())));
        System.out.println(students.stream().collect(Collectors.groupingBy(String::length)));
        Map<Boolean,List<Integer>> result=age.stream().collect(Collectors.groupingBy(x->x%2==0));
        System.out.println(result);
        Map<Integer,List<String>> length=students.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(length);
        Map<Boolean,Integer> evenSum =age.stream().collect(Collectors.groupingBy(x->x%2==0,Collectors.summingInt(x->x)));
        System.out.println(evenSum);
        System.out.println(age.stream().filter(x->x%2==0).mapToInt(Integer::intValue).sum());
        System.out.println(age.stream().filter(x->x%2==0).reduce((a,b)->a+b));
        List<Employee>eployees= Arrays.asList(
                new Employee("IT", "Kuhu",900),
                new Employee("DEV", "Nasu",8900),
                new Employee("IT", "Aditi",500),
                new Employee("DEV", "Paro",7000)
        );
        Map<String,List<Employee>> bydept=eployees.stream().collect(Collectors.groupingBy(Employee::getDept));
        Map<String,List<Employee>> byName = eployees.stream().collect(Collectors.groupingBy(Employee::getName));
        List<Employee> sortedemp=eployees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).toList();
        System.out.println(sortedemp);
        System.out.println(byName);
        System.out.println(bydept);
    }
}

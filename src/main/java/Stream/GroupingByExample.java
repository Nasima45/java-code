package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
class Employee {
    String dept;
    String name;

    public Employee(String dept, String name) {
        this.dept = dept;
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    @Override
    public String toString() {
        return "employee{" +
                "dept='" + dept + '\'' +
                ", name='" + name + '\'' +
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
                new Employee("IT", "Kuhu"),
                new Employee("DEV", "Nasu"),
                new Employee("IT", "Aditi"),
                new Employee("DEV", "Paro")
        );
        Map<String,List<Employee>> bydept=eployees.stream().collect(Collectors.groupingBy(Employee::getDept));
        System.out.println(bydept);
    }
}

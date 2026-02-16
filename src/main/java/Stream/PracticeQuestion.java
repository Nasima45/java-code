package Stream;

import java.util.*;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class PracticeQuestion {
    private static final Logger logger = Logger.getLogger(PracticeQuestion.class.getName());

    static void main() {
        List<Integer> list = Arrays.asList(1, 4, 2, 5, 6, 9, 3);
        List<String> students =
                Arrays.asList("paro", "naj", "kj", "aditi", "aheli");

        list.stream().forEach(System.out::println);
//How do you convert a stream back to a list?
        list.stream().toList();
        //How do you find the count of elements in a stream?
        Long count = list.stream().filter(x -> x == 4).count();
        System.out.println(count);
        //How do you filter even numbers from a list using streams?
        list.stream().filter(x -> x % 2 == 0).forEach(System.out::println);
//How do you transform a list of strings to uppercase using streams?
        students.stream().map(String::toUpperCase).forEach(System.out::println);
        //How do you sort a list of numbers using streams?
        list.stream().sorted().forEach(System.out::println);
        //How do you limit a stream to the first 5 elements?
        list.stream().limit(5).forEach(System.out::println);
        //How do you skip the first 3 elements in a stream?
        list.stream().skip(3).forEach(System.out::println);
        //How do you find the first element of a stream?
        Optional<Integer> firstValue = list.stream().findFirst();
        System.out.println(firstValue.get());
        //How do you check if all elements in a stream match a given condition?
        boolean result = list.stream().allMatch(x -> x % 2 == 0);
        System.out.println(result);
        //How do you check if any element in a stream matches a given condition?
        boolean result2 = list.stream().anyMatch(x -> x % 2 == 0);
        System.out.println(result2);
        //How do you remove duplicate elements from a list using streams?
        List<Integer> unique = list.stream().distinct().toList();
        System.out.println(unique);
        //How do you collect elements from a stream into a Set?
        Set<Integer> usingSet = list.stream().collect(Collectors.toSet());
        System.out.println(usingSet);
        //How do you create a stream from an array?
        int arr[] = {3, 2, 4, 5};
        Arrays.stream(arr).forEach(System.out::println);
//How do you find the sum of a list of integers using streams?
        Optional<Integer> summation = list.stream().reduce((a, b) -> a + b);
        list.stream().mapToInt(Integer::intValue).sum();
        System.out.println(summation.orElse(0));
        //How do you find the maximum and minimum values in a stream?
        Optional<Integer> max = list.stream().sorted(Comparator.reverseOrder()).findFirst();
        System.out.println(max);
        Optional<Integer> min = list.stream().min((a, b) -> a - b);
        //How do you find the average of numbers in a list using streams?

        list.stream().mapToInt(Integer::intValue).average();
        //How do you concatenate multiple lists into a single stream?
        List<List<String>> multiplerList = Arrays.asList(
                Arrays.asList("kuhu", "naj"),
                Arrays.asList("hyk", "j")
        );
        List<String> singleList = multiplerList.stream().flatMap(m -> m.stream()).toList();
        System.out.println(singleList);
        List<Integer> numbers = Arrays.asList(3, 45, 15, 1, 6, 7, 23);
        //How do you group a list of numbers into even and odd using streams?
        Map<String, List<Integer>> oddEven =
                numbers.stream().collect(Collectors.groupingBy(x -> x % 2 == 0 ? "EVEN" : "ODD"));
        logger.info("oddEven: " + oddEven);
        //How do you group a list of employees by department using streams?
        List<CapgEmployee> empList=Arrays.asList(
                new CapgEmployee("IT", "Kuhu", 23000L),
                new CapgEmployee("DEV", "Nasu",9800L),
                new CapgEmployee("IT", "Aditi",1287L),
                new CapgEmployee("DEV", "Paro",78659L)
        );
        Map<String,List<CapgEmployee>> byDeptFilter=empList.stream().collect(Collectors.groupingBy(CapgEmployee::getDept));
        logger.info("filtered by dept : " + byDeptFilter);
        //How do you find the second highest number in a list using streams?
        Optional<Integer> secondHighest=numbers.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        Optional<Integer> secSmallest=numbers.stream().distinct().sorted().skip(1).findFirst();
OptionalInt maxValue=numbers.stream().distinct().mapToInt(Integer::intValue).max();
        logger.info(" second highest number : "+ secondHighest.get());
        logger.info(" second smallet number : "+ secSmallest.get());
        //How do you partition a list of numbers into two groups: greater than 10 and less than 10?
        Map<String,List<Integer>> greater=numbers.stream().collect(Collectors.groupingBy(x->x>10 ? "Greater" :"NotGreater"));
        logger.info("checking less and greater 10: " + greater);
        //How do you count occurrences of each word in a list using streams?
        Map<String,Long> countOfWord=students.stream().collect(Collectors.groupingBy(word->word,Collectors.counting()));
        //How do you remove null values from a list using streams?
        List<String> notNullString=students.stream().filter(Objects::nonNull).toList();
        //.How do you concatenate all strings in a list into a single string using streams?
        Optional<String> concatString=students.stream().reduce((a,b)->a+b);
        //How do you flatten a list of lists into a single list using streams?
        multiplerList.stream().flatMap(x->x.stream()).forEach(System.out::println);
        System.out.println(concatString);
        System.out.println(countOfWord);
        //How do you find duplicate elements in a list using streams?
         List<Integer> uniqueList=list.stream().filter(e->!new HashSet<>().add(e)).toList();
        System.out.println(uniqueList);
        //How do you get the top 3 highest numbers from a list using streams?
List<Integer> max3= list.stream().sorted(Comparator.reverseOrder()).limit(3).toList();
//How do you convert a list of strings into a map of string-length pairs?
        Map<String,Integer> mapCovert=students.stream().collect(Collectors.toMap(word->word,word->word.length()));
        System.out.println(mapCovert);
        //How do you find the longest word in a list using streams?

        int n=arr.length;
        reverse(arr,n);
        printAray(arr,n);

    }
    public static void reverse(int arr[], int n){
        //l=3
        for(int i=0;i<n/2;i++){
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
    }
    public static void printAray(int arr[],int n){
        System.out.println("printing sorted array: ");
        for(int i:arr){
            System.out.println(i);
        }
    }

}
class CapgEmployee {
    String name;
    String dept;
    Long salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public CapgEmployee(String name, String dept, Long salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "CapgEmployee{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                '}';
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }
}

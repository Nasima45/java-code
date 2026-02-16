package Stream;

import java.util.function.*;

class Practise1 {

    public static void main(String[] args) {

        // 1️⃣ Lambda with Thread
        Thread t1 = new Thread(() -> System.out.println("Hello from thread"));
        t1.start();

        // 2️⃣ Even / Odd check
        System.out.println("Normal method: " + isEven(20));
        System.out.println("Using Predicate: " + isEvenUsingPredicate(20));

        // 3️⃣ Custom Functional Interface
        MathOperation sumOperation = (a, b) -> a + b;
        MathOperation mulOperation = (a, b) -> a * b;

        System.out.println("Sum: " + sumOperation.operate(2, 3));
        System.out.println("Multiply: " + mulOperation.operate(4, 5));

        // 4️⃣ Predicate examples
        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println(isEven.test(5));
        System.out.println(isEven.test(4));

        Predicate<String> startsWithK = x -> x.startsWith("k");
        System.out.println(startsWithK.test("kuhu"));

        // 5️⃣ Function examples
        Function<Integer, Integer> doubleIt = x -> x * 2;
        Function<Integer, Integer> tripleIt = x -> x * 3;

        System.out.println(doubleIt.andThen(tripleIt).apply(10)); // (10*2)*3

        // 6️⃣ Consumer example
        Consumer<Integer> print = System.out::println;
        print.accept(8);

        // 7️⃣ Predicate + Function + Consumer together
        Predicate<Integer> checkEven = x -> x % 2 == 0;
        Function<Integer, Integer> square = x -> x * x;

        if (checkEven.test(10)) {
            print.accept(square.apply(2));
        }

        // 8️⃣ BiPredicate
        BiPredicate<Integer, Integer> sumIsEven = (x, y) -> (x + y) % 2 == 0;
        System.out.println(sumIsEven.test(5, 5));

        // 9️⃣ BiFunction
        BiFunction<String, String, Integer> lengthOfConcat =
                (x, y) -> (x + y).length();

        print.accept(lengthOfConcat.apply("hi", "kuhu"));
    }

    // Normal even check
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    // Predicate-based even check
    public static boolean isEvenUsingPredicate(int n) {
        Predicate<Integer> check = x -> x % 2 == 0;
        return check.test(n);
    }
}

// Custom Functional Interface
@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

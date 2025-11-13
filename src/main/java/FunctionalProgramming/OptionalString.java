package FunctionalProgramming;

import java.util.Optional;

public class OptionalString {
    static void main() {
        System.out.println(toOptional(null));
        System.out.println(toOptional(" kuhu "));
    }

    public static Optional<String> toOptional(String str) {
        if (str == null || str.isEmpty()) {
            return Optional.empty();
        }
        return Optional.of((str.toUpperCase()));
    }
}

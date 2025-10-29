package javaCode;

public class StringOperation {
    final String name;

    StringOperation(String name) {
        this.name = name;
    }

    static void main() {
        String s1 = "nasima";
        String s2 = "aktar";


        System.out.println(s1.concat(" ").concat(s2).toUpperCase());
        StringBuilder str = new StringBuilder("paro");
        StringBuilder[] sb = {new StringBuilder("naj"), new StringBuilder("kuhu")};
        StringBuilder combined = new StringBuilder();
        for (StringBuilder s : sb) {
            combined.append(s);
        }

        System.out.println("conat:" + combined);
    }
}

package javaCode;

public class StarPattern {
    static void main() {
        patten();
        patten2();
        patten3();
    }

    public static void patten() {
        int line = 0;
        while (line < 5) {
            System.out.print("*");
            int i=0;
            while(i<line){
                System.out.print(" *");
                i++;
            }
            System.out.println();
            line++;
        }
    }
    public static void patten2() {
        int line = 5;
        while (line>0) {

            int i=0;
            while(i<line){
                System.out.print("* ");
                i++;
            }
            System.out.println();
            line--;
        }
    }
    public static void patten3() {
        int line = 0;
        while (line<5) {

            int i=0;
            while(i<line){
                System.out.print("* ");
                i++;
            }
            System.out.println();
            line++;
        }
    }
}

package OOPSWork;

public class PassByReferrence {
    public static class values{
        int x;
        int y;

        public values(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "values{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }
    public static void changeValues(values v){
        v.x+=2;
        v.y+=2;
        System.out.println(v);
    }
    public static void swapValues(values v){
        int temp=v.x;
        v.x=v.y;
        v.y=temp;
    }

    static void main() {
        values p=new values(8,9);
        System.out.println("before swapping :" + p);
        swapValues(p);
        System.out.println("after swapping : "+  p);

    }
}

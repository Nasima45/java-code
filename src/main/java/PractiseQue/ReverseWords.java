package PractiseQue;

public class ReverseWords {
    static void main() {
        String name= "  i am kuhu";
        //char words[]=name.toCharArray();
        String rev=" ";
        for(int i=0;i<name.length();i++){
            rev=name.charAt(i)+rev;
        }
        System.out.println(rev);
        reverse(name);

    }
    public static void reverse(String name){
        String words[]=name.trim().split(" ");
        int n=words.length;
        String rev=" ";
        for (int i = n - 1; i >= 0; i--) {
            rev = rev + words[i] + " ";
        }
        System.out.println(rev.trim());
        

    }
}

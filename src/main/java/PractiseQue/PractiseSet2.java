package PractiseQue;

public class PractiseSet2 {
    static void main() {
        removeDuplicateFromString();
        reaverseString();
        reverseWords();
        reverseSentence();
    }
    public static void removeDuplicateFromString(){
        String name="ababagafa";
        char single[]=name.toCharArray();
        int n=single.length;
        for(int i=0;i<n;i++){
            boolean isDup=false;
            for(int j=0;j<i;j++){
                if(single[i]==single[j]){
                    isDup=true;
                    break;
                }
            }
            if(!isDup){
                int count=0;
                for(int k=0;k<n;k++){
                    if(single[i]==single[k]){
                        count++;
                    }
                }
                System.out.print(single[i]+""+count);
            }
        }
    }
    public static void reaverseString(){
        System.out.println("printing reversed string");
        String name ="nasima aktar";
        String reverese="";
        for(int i=0;i<name.length();i++){
            reverese=name.charAt(i)+reverese;
        }
        System.out.println(reverese);
    }
    public static void reverseWords(){
        String name="nasima aktar parvin";
        String[] words=name.split(" ");
        for(int i= words.length-1;i>=0;i--){
            System.out.println(words[i] + " ");
        }
        String name2="kuhu";
        for(int i=name2.length()-1;i>=0;i--){
            System.out.println(name2.charAt(i));
        }
        int arr[]={4,3,2,9};
        for(int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }
        for (int i:arr){
            System.out.println(i);
        }
        for(int i=0;i<arr.length/2;i++){
            int temp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }
        for (int i:arr){
            System.out.println(i);
        }
    }
    public static void reverseSentence(){
        String name="nasima aktar parvin";
        String result="";
        for(int i=0;i<name.length();i++){
            if(name.charAt(i)!=' '){
                result=name.charAt(i)+result;
            }
        }
        System.out.println(result);
    }
}

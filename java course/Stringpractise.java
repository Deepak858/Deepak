
import java.util.Arrays;

public class Stringpractise {
    public static void main(String[] args) {
        String str=" deepak nayak";
        // int count=0;
        // str=str.toLowerCase();
        // for(int i=0;i<str.length();i++){
        //     char ch=str.charAt(i);
        //     if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
        //         count++;
        //     }
        // }
        // System.out.println("the total vowels is prestent in string is"+count+" ");
        String str1="nayakdeepak";
        str=str.replace(" ", "");
        str1=str1.replace(" ", "");
        char[]a=str.toCharArray();
        char[]b=str1.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        boolean res=Arrays.equals(a, b);
        if(res==true){
           System.out.println("striing is anagaram");
        }
        else{
            System.out.println("String is not a anagaram");
        }
    }
    
}

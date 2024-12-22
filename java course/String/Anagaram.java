package String;
import java.util.Arrays;

public class Anagaram {
    public static void main(String[] args) {
        String s="karnataka";
        String t="rnatakaak";
        //conver array
        char a[]=s.toCharArray();
        char b[]=t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        boolean result=Arrays.equals(a,b);
        if(result==true){
            System.out.println("The string is Anagaram");
        }
        else{
            System.out.println("string is not Anagaram");
        }

    }
    
}

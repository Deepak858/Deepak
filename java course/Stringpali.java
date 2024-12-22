import java.util.*;
public class Stringpali {


public static void main(String[] args) {
    System.out.println("enter any string type");
    Scanner s=new Scanner(System.in);
    String str=s.nextLine();
    int l=str.length();
    for(int i=0;i<str.length()/2;i++){
        if(str.charAt(i)!=str.charAt(l-1-i)){
            System.out.println("String is not a palindrome");
            
        }else{
        System.out.println("String is a palindrome");
        
        }
    }
  
}
}

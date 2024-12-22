import java.util.Scanner;

public class St{

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter your string");
        String t=s.nextLine();
       
        
    //  String  Str="deepak";
    //   String name=new String("bayak");
    //   System.out.println(Str.compareTo(name));
int start=0;
int end=t.length()-1;
while(start<=end){
    if (t.charAt(start)!=t.charAt(end-start)) {
        System.out.println("String is not a palindro'me");
        break;
        
    }
else
    System.out.println("String is  a palindrome");
    break;


}
start++;
end--;
   
      
    }
}

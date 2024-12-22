public class Stringpalindrome {
    public static void main(String[] args) {
        String name="nit in";
        String res=" ";
        for(int i=name.length()-1;i>=0;i--){
            res=res+name.charAt(i);}
            System.out.println(res);
            if (res.equals(name)){
                System.out.println(res+  "string is palindrome");
                
            }
            else
                System.out.println("String is not palindrome");
            

        }   
      
     //   System.out.println(res); 
    
}


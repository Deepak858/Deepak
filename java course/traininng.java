public class traininng {
    public static void main(String[] args) {
        String s="madam";
        System.out.println(main(s));
   
  
    }
public static boolean  main(String s) {
    int l=s.length()/2;
    for(int i=0;i<l/2;i++){
        if(s.charAt(i)!=s.charAt(l-1-i)){
          return false;
        }
    }
    return true;
}
    
}

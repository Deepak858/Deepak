public class Multiplyb3 {
    public static boolean  main(String[] args) {
        int n=45;
        //check 45 is power of 3
        if(n==0){
            System.out.println("invalid");
        }
        while((n%3)==0){
            n/=3;
        }
      return (n==1);
    }
    
}

public class Friendspair {
    public static void main(String[] args) {
        System.out.println(Friendpair(4));
        
    }
    public static int Friendpair(int n) {
          //base case
          if (n==1||n==2) {
            return n;
            
          }        
          return Friendpair(n-1)+(n-1)*Friendpair(n-2);
    }
    
}

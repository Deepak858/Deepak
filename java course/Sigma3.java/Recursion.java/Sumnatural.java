public class Sumnatural {
    public static void main(String[] args) {
     int n=10; 
   System.out.println(sumno(n));
    }
    static  int sumno(int n){
        if(n==1){
            return 1;
        }
      int sum=n+sumno(n-1);
      return sum;
    }
}

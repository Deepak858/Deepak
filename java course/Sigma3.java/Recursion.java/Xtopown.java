public class Xtopown {
    public static void main(String[] args) {
        int x=4,n=6;
        System.out.println(pow(x,n));
    }
    public static int pow(int x,int n){
        //base condition
       if(n==0){
        return 1;
       }
       int z= pow(x, n/2);
       if(n%2!=0){
        return x*z*z;
       }
       return z*z;
    }
}

public class Factorial {
//    public static void main(String[] args) {
//     int n=5;
//     Factorial f=new Factorial();
// System.out.println(f.fact(n));

//    }
//    int  fact(int n){
//     if(n==0||n==1){
//         return 1;
//     }
    
//    return n*fact(n-1);
    
//    }





//problem  fibbonacci series

public static void main(String[] args) {
   
    

System.out.println( fibo(5));
}
static int fibo(int n){
    if(n==0||n==1){
        return n;
    }
 return n*fibo(n-1);

}
}

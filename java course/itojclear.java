class itojclear{
    public static void main(String[] args) {
//    int n=45;
//    int i=2,j=6;
//    int a=(~0)<<(j+1);
//    int b=(1<<i)-1;
//    int bitmask=a|b;
//    System.out.println(n&bitmask);
// find number is 2 power number


    System.out.println(main(1024));  
    }
    public static boolean main(int n) {
        return (n & (n-1))==0;


        
    }
}
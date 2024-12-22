public class kadanssubarray {
    public static void main(int [] n) {
       int ms=Integer.MIN_VALUE;
       int cs=0;
       for(int i=0;i<n.length;i++){
      cs=cs+n[i];
        if(cs<0){
            cs=0;
        }
        ms=Integer.max(cs, ms);
     //   System.out.print(ms);

       }
       System.out.println("the  max sum is"+ms);
    }
    public static void main(String[] args) {
        int n[]={-1,-4,0,9,3};
        main(n);
    }
    
}

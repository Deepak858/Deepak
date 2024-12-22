public class fastexponsition {
    public static void main(String[] args) {
      //count bit;
        //   int count =0;
        //   int n=13;
        //   while(n>0){
        //     if((n&1)==1){
        //         count++;
        //     }
        //     n=n>>1;
        //   }
        //   System.out.println(count);

        //fast exponsitiation
        // int a=8;
        // int n=3;
        // int ans=1;
        // while(n>0){
        //     if((n&1)==1){
        //         ans*=a;
        //     }
        //     a=a*a;
        //     n=n>>1;
        // }
       // System.out.println(ans);
       



       //count bit
    //    int n=25;
    //    int count=0;
    //    while(n!=0){
    //     if((n&1)!=0){
    //         count++;

    //     }
    //     n=n>>1;
    //    }
    //    System.out.println("The total bit is "+count);


    //fast expontitional
    int a=6;
    int n=3;

System.out.println(main(n, a));

    
}
public static int main(int n,int a) {
    int ans=1;
    while(n!=0){
        if((n&1)==1){
            ans=ans*a;
        }
        a=a*a;
        n=n>>1;
    }
   // System.out.println("the total result is "+ ans);
    return ans;
}

}

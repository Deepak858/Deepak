public class brute {
    public static void main(int n[]) {
      // int sum=0;
        int ms=Integer.MIN_VALUE;
        for(int i=0;i<n.length;i++){
            int start=i;
            for(int j=i;j<n.length;j++ ){
                int end=j;
             int   sum=0;
                for(int k=start;k<=end;k++){
                 
                    sum+=n[k];
                }
                  
                
               System.out.println(sum);
                    if (ms<sum) {
                        ms=sum;
                        
                    }                
             
            }
        }
           
               System.out.println("the maximu"+ms);
        
    
}
    public static void main(String[] args) {
        int n[]={3,5,7,3,4};
        main(n);
    }
    
}

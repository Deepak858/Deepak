public class practise {
    public static void main(int n[]) {
        //total pair
        /* 
        int tp=0;
        //pairs
        for(int i=0;i<n.length;i++){
            int curr=n[i];
            for(int j=i+1;j<n.length;j++){
            System.out.print("("+curr+","+n[j]+")");
            tp++;
            }
            System.out.println();
        }
        System.out.println("the total pair is:"+tp);
        
        //maximum subarray
        int ms=Integer.MIN_VALUE;
        for(int i=0;i<n.length;i++){
            int start=i;
            for(int j=i;j<n.length;j++){
                int end=j;
                int cs=0;
                for(int k=start;k<=end;k++){
                    cs+=n[k];
                  
                    }
                    System.out.println(cs);
                    if(cs>ms){
                        ms=cs;
                    }
            }
           
        }
        System.out.println("the maximum sum is:"+ms);
        
        //kadan's algorithm
        int cs=0;
        int ms=Integer.MIN_VALUE;
        for(int i=0;i<n.length;i++){
            cs=cs+n[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(ms, cs);

        }   
        System.out.println("the maximum value is given  subarray is:"+ms); 
        
        //prefix array
        int cs=0;
        int ms=Integer.MIN_VALUE;
        int pre[]=new int[n.length];
        pre[0]=n[0];
        for(int i=1;i<n.length;i++){
            pre[i]=pre[i-1]+n[i];
        }  
        for(int i=0;i<n.length;i++){
            int start=i;
            for(int j=i;j<n.length;j++){
                int end=j;
               cs= start==0?pre[end]:pre[end]-pre[start-1];
               if(cs>ms){
                ms=cs;
               }
            }
        } 
        System.out.println("the maximum sum is "+ms);
        */
        //again prefix array
        int cs=0;
        int ms=Integer.MIN_VALUE;
        int pre[]=new int[n.length];
        pre[0]=n[0];
        for(int i=1;i<n.length;i++){
            pre[i]=pre[i-1]+n[i];
        }
        for(int i=0;i<n.length;i++){
            int start=i;
            for(int j=i;j<n.length;j++){
                int end=j;
                cs=start==0?pre[end]:pre[end]-pre[start-1];
                if(cs>ms){
                    ms=cs;
                }
            
            }
           
        }
System.out.println("the max is"+ms);
    }
    public static void main(String[] args) {
        int n[]={3,0,-4,3,4};
        main(n);
    }
    
}

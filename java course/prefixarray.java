public class prefixarray {
    public static void main(int []n) {
        int ms=Integer.MIN_VALUE;
        int cs=0;
        int []pre=new int[n.length];
        pre[0]=n[0];
        for(int i=1;i<pre.length;i++){
            pre[i]=pre[i-1]+n[i];
        }
        for(int i=0;i<n.length;i++){
            int start=i;
            for(int j=i;j<n.length;j++){
                int end=j;
                cs=start==0?pre[end]:pre[end]-pre[end];
                if(ms<cs){
                    ms=cs;
                }
              //  System.out.println("the max value is:"+ms);
            }
           // System.out.println(cs);
        }
        System.out.println("the max value is:"+ms);
       
               
           
            
         
    }
    public static void main(String[] args) {
        int n[]={0,4,5,6};
        main(n);
    }
    
}

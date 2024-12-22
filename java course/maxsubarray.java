public class maxsubarray {
    public static void maxsa(int [] n) {
        //by using find maxsubarray sum is brute form
        
        int maxsum=Integer.MIN_VALUE;
        
        for(int i=0;i<n.length;i++){
            int start=i;
            for(int j=i;j<n.length;j++){
                int end=j;
                int currsum=0;
              
                for(int k=start;k<=end;k++){
                    currsum+=n[k];

                }
                System.out.println(currsum);
                if (currsum>maxsum) {
                maxsum=currsum;
                    
                }
            }
        }
        System.out.println("The total sum is:"+maxsum);
        
    }
    public static void main(String[] args) {
        int n[]={3,6,4,2,6,78,8};
        maxsa(n);

    }
    
}

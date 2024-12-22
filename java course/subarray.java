public class subarray {
    public static void subar(int[] n) {
        int tp=0;
        for(int i= 0;i<n.length;i++){
            int start=i;
            for(int j=i;j<n.length;j++){
                int end=j;
            
            for(int k=start;k<=end;k++){
                System.out.print(n[k]+" ");
                tp++;   
            }
            System.out.println();
        }
            System.out.println();

        }
        System.out.println("the total subarray is:"+tp);
        
    }
    public static void main(String[] args) {
        int []n={2,4};
subar(n);
    }
    
}

public class Pracrisetest {
    public static void main(String[] args) {
        //reverse of array
    
        int n[]={2,5,6,4,6,8,4};
        int start=0;
        int end=n.length-1;
        while (start<=end) {
            int temp=n[start];
           n[start]=n[end];
            n[end]=temp;
            start++;
            end--;
            
        }
        for(int i=0;i<n.length;i++){
            System.out.println(n[i]+" ");
        }

        
    }
    
}

public class insertionsort {
    public static void main( int[] n) {
        for(int i=0;i<n.length;i++){
            int curr=i;
            int prev=i-1;
            while (prev>=0 && n[curr]>n[prev]) {
                n[prev+1]=n[prev];
                prev--;
                
            }
            n[prev+1]=n[curr];
        }
        for(int j=0;j<n.length;j++){
           
     System.out.print(n[j]+"  ");
        }
        System.out.println();

        
    }
    public static void main(String[] args) {
        int n[]={5,73,8,67};
        main(n);
       
    }

    
}

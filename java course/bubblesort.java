public class bubblesort {
    public static void main(int n[] ) {
        int m=n.length;
        for(int i=0;i<m;i++){
            int turn=0;
            for(int j=0;j<m-1-i;j++){
                if (n[j]>n[j+1]) {
                    //swap
                    int temp=n[j];
                    n[j]=n[j+1];
                    n[j+1]=temp;
                    turn++;
                    
                }
            }
            System.out.println("the total turn"+turn);
        }
       // System.out.println(turn);
        
    }
    public static void man(int n[]) {
        for(int i=0;i<n.length;i++){
            System.out.print(n[i]+"  ");
        }
        System.out.println();
        
    }
    public static void main(String[] args) {
        int[] n={1,9,5,2,4,6};
        main(n);
        man(n);
    }
    
}

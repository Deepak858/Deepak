import java.util.Arrays;
public class selectionsort {
    public static void main(int n[] ) {
    //     for(int i=0;i<n.length;i++){
    //         int min=i;
    //         //unsorted ka liya
    //         for(int j=i+1; j<n.length;j++){
    //             if (n[min]<n[j]) {
    //                 min=j;
                  
                    
    //             }
    //         }
    //         int temp=n[min];
    //         n[min]=n[i];
    //         n[i]=temp;
    //     }
    //     for(int i=0;i<n.length;i++){
    //         System.out.print(n[i]+"  ");
    //     }
    //     System.out.println();
        
    // }
    //BUBBLE SORT IN THIS CODE IS THE CODE IS
    // for(int i=0;i<n.length;i++)
    // {
    //     for(int j=0;j<n.length-1-i;j++)
    //     {
    //         if (n[j]>n[j+1]) {
    //             int temp=n[j];
    //             n[j]=n[j+1];
    //             n[j+1]=temp;
                
    //         }
    //     }
    // }
    // for(int i=0;i<n.length;i++){
    //     System.out.print(n[i]+"  ");
    // }


    //SELECTION SORT IN THIS CODE
    // for(int i=0;i<n.length;i++){
    //     int min=i;
    //     for(int j=i+1;j<n.length;j++){
    //         if (n[min]<n[j]) {
    //             min=j;
                
    //         }
    //     }
    //     //swap
    //     int temp=n[i];
    //     n[i]=n[min];
    //     n[min]=temp;
    // }
    // for(int i=0;i<n.length;i++){
    //     System.out.println(n[i]+"   ");
    // }

    //INSERTION SORT GIVEN THIS CODE HERE
   for(int i=0;i<n.length;i++){

    int curr=n[i];
    int prev=i-1;
    while(prev>=0 && n[prev]>curr){
             n[prev+1]=n[prev];
             prev--;
    }
    //insertion sort
    n[prev+1]=curr;

   }
    
    for(int i=0;i<n.length;i++){
        System.out.println(n[i]+"  ");
    }
    }
    public static void main(String[] args) {
        int []n={3,5,0,2,1,67,54,6,57,56,9};
    // main(n);
    Arrays.sort(n);
    }
}

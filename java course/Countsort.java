public class Countsort {
    public static int main(int height[]) {
        //selection  sort
    //   for(int i=0;i<n.length;i++){
    //     int min=i;
    //     for(int j=i+1;j<n.length;j++){
    //         if (n[j]<n[min]){
    //             min=j;
                
    //         }
    //     }
    //     //swap
    //     int temp=n[min];
    //     n[min]=n[i];
    //     n[i]=temp;
      
    //     }
    //insertion sort
//     for(int i=0;i<n.length;i++){
//         int curr=n[i];
//         int prev=i-1;
//         while (prev>=0 && n[prev]< curr) {
//             n[prev+1]=n[prev];
//             prev--;
            
//         }
//         n[prev+1]=curr;
//     }
//    for(int i=0;i<n.length;i++){
//     System.out.println(n[i]+" ");
//    }
//     }
    //counting sort
    //approach
    //1. find maximum array
    //2. create count array
    //3. find frequency in count sort
    //4. display the number
    //start and follow you 
    // int ms=Integer.MIN_VALUE;
    // for(int i=0;i<n.length;i++){
    //     ms=Math.max(ms, n[i]);
    // }
    // //create count sort
    // int count[]=new int [ms+1];
    // for(int i=0;i<n.length;i++){
    //     count[n[i]]++;
    // }
    // //find frequency
    // int j=0;
    // for(int i=0;i<n.length;i++){
    //     while (count[i]>0) {
    //         n[j]=i;
    //         j++;
    //         count[i]--;

            
    //     }
    // }
    //print count sort
    // for(int i=0;i<count.length;i++){
    //     System.out.println(n[i]+"  ");
    // }
    //bubble sort
    // for(int i=0;i<n.length;i++){
    //     for(int j=i;j<n.length-1;j++){
    //         if (n[j]>n[j+1]) {
    //             //swap
    //             int temp=n[j];
    //             n[j]=n[j+1];
    //             n[j+1]=temp;
                
    //         }
    //     }
    // }
    // for(int i=0;i<n.length;i++){
    //     System.out.println(n[i]+"  ");
    // }
    int n= height.length;
    int leftmax[]=new int[n];
    leftmax[0]=height[0];
    for(int i=1;i<n;i++){
        leftmax[i]=Math.max(leftmax[i-1],height[i]);
    }
    //find rightmax
    int rightmax[]=new int[n];
    rightmax[n-1]=height[n-1];
    for(int i=n-2;i>=0;i--){
        rightmax[i]=Math.max(rightmax[i+1],height[i]);
    }
    int trappedwater=0;
    for(int i=0;i<n;i++){
        int waterlavel=Math.min(rightmax[i],leftmax[i]);
        trappedwater+=waterlavel-height[i];
    }
    return trappedwater;
    
    }
    public static void main(String[] args) {
        int []height={4,2,0,3,2,5};
        System.out.println(main(height));
    }
    
}

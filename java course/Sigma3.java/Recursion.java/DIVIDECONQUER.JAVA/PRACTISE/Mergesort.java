package PRACTISE;

public class Mergesort {
    public static void main(String[] args) {
        int arr[]={2,4,6,1,3,8,7,-6,-8,9};
        mergesort(arr, 0,arr.length-1);
        printArr(arr);
       
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void mergesort(int arr[],int si,int ei){
        //base case
        if(si>=ei){
            return;
        }
        //kaam
        int mid=si+(ei-si)/2;
    mergesort(arr, si, mid);//left part
    mergesort(arr, mid+1, ei);//right  part
    merge(arr,si,mid,ei);

    }
    public static void merge(int arr[],int si,int mid,int ei){
        int temp[]=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k++]=arr[i++];

            }
            else{
                temp[k++]=arr[j++];
            }
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        } 
        while(j<=ei){
            temp[k++]=arr[j++];
        }  
        //copy element temp to origional array
        for(k=0,i=si;k<temp.length;i++,k++){
            arr[i]=temp[k];
        }
     }

   
    
}

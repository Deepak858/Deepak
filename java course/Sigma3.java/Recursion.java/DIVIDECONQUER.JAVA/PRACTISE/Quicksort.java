package PRACTISE;

class Quicksort{
    public static void main(String[] args) {
        int arr[]={1,5,3,6,3,7,-4,-3,-7,0,8,4,44,32};
        quicksort(arr, 0, arr.length-1);
        printArr(arr);
      
    

    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void quicksort(int arr[],int si,int ei){
        //base case
        if(si>=ei){
            return;
        }
        int pidx=partition(arr,si,ei);
        quicksort(arr, si, pidx-1);//left part of pivot index
        quicksort(arr,pidx+1, ei);//right part of pivot index
  }
  public static int partition(int arr[],int si,int ei){
    int i=si-1;
    int temp;
    int pivot=arr[ei];
    for(int j=si;j<ei;j++){
        if(arr[j]<=pivot){
            i++;
            temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
        }
    }
    //pivot ko sahi position par laya hai
    i++;
    temp=pivot;
    arr[ei]=arr[i];
    arr[i]=temp;
    return i;
    
  }
}
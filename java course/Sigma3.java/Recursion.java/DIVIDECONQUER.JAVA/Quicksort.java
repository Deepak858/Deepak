public class Quicksort{
    public static void main(String[]args){
        int arr[]={9,2,3,6,5,8};
        Quicksort(arr, 0, arr.length-1);
        printArr(arr);


    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void Quicksort(int arr[],int si,int ei){
        //base case
        if(si>=ei){
            return;
        }
        //used partition
        int pidx=partition(arr,si,ei);
        Quicksort(arr, si, pidx-1);//pivot sa less element left part
        Quicksort(arr,pidx+1,ei);//pivot sa greather element right part

    }
    public static int partition(int arr[],int si,int ei){
        int pivot=arr[ei];
        int i=si-1;
        for(int j=si;j<ei;j++){
            if(arr[j]<=pivot){
                //gajah banani hai pivot sa less element ka liya
                 i++;
                 //swap
                 int temp=arr[j];
                 arr[j]=arr[i];
                 arr[i]=temp;

            }
        }
        //pivot ko uski sahi [position] par lana 
        i++;
        int temp=pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;
    }
}
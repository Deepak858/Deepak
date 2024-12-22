class Merge{
    public static void main(String[] args) {
        int arr[]={2,43,53,1,7,6};
        mergesort(arr, 0, arr.length-1);
        printarr(arr);
    }
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void mergesort(int arr[],int si,int ei){
        //base case
        int mid=si+(ei-si)/2;
        if(si>=ei){
            return;
        }
        mergesort(arr, si,mid);
        mergesort(arr, mid+1, ei);
        merge(arr,si,mid,ei);
    }
    public static void merge(int arr[],int si,int mid,int ei){
        int temp[]=new int[ei-si+1];
        int i=si;//left iteration
        int j=mid+1;//right iteration
        int k=0;//temperary
        while(i<=mid &&j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        while (i<=mid) {
            temp[k++]=arr[i++];
        }
        while (j<=ei) {
            temp[k++]=arr[j++];
        }
        //copy temp to origional
        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }
}
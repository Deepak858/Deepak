public class RotatesortedArray {
public static void main(String[] args) {
    int arr[]={2,4,5,7,8,9,1,3,6};
    int target=1;
    int taridx=search(arr, target, 0,arr.length-1);
    System.out.println(taridx);
}
public static int search(int arr[],int target,int si,int ei){
    //base case
    if(si>ei){
        return -1;
    }
    //kaam
    int mid=si+(ei-si)/2;
    if(arr[mid]==target){
        return mid;
    }
    //mid on line 1
    if(arr[si]<=arr[mid]){
        //case a:left part
        if(arr[si]<=target && target<=arr[mid]){
            return search(arr, target, si, mid-1);
        }
        else{
            //case b:right part
            return search(arr, target, mid+1, ei);
        }
    }
    //mid on line 2
    else{
        //case c: right part
        if(arr[mid]<=target && target<=arr[ei]){
            return search(arr, target, mid+1, ei);
        }
        else{
            //case d:left part
            return search(arr, target, si, mid);
        }
    }

}
  
}
    
    


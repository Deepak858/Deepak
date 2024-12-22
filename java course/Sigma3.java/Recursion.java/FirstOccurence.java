public class FirstOccurence {
    public static void main(String[] args) {
        int arr[]={2,3,43,5554,56,45,65,3,4,45,6,56,4,54,5,67,65 };
        System.out.println(FirstOccurence(arr, 5,arr.length-1));
    }
    public static int FirstOccurence(int arr[],int key,int i){
        if(i==arr.length-1){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return FirstOccurence(arr, key, i-1);
    }
    
}

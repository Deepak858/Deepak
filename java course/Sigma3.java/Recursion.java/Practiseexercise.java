public class Practiseexercise{
public static void main(String[] args) {
    int arr[]={1,3,5,2,5,7,8,2,8,7};
    int key=2;
   Problem1(arr, key, 0);
   System.out.println();
}
public static void Problem1(int arr[],int key,int idx){
    if(idx==arr.length-1){
        return;
    }
    if(arr[idx]==key){
        System.out.println(idx+" ");
    }
    Problem1(arr, key, idx+1);
    

}
}
    

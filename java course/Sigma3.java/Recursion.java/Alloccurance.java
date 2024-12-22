
public class Alloccurance {
    static {
        System.out.println("hello");
    }
    public static void main(String[] args) {
        int arr[]={2,4,5,6,3,2,4,7,8,4,3,6,2,2,5,8};
        int key=2;
        Alloccurance(arr, key, 0);
         System.out.println();  
        
    }
    public static void Alloccurance(int arr[],int key,int idx) {
        if(idx==arr.length){
            return;
        }
        if(arr[idx]==key){
            System.out.print(idx+" ");

        }
        Alloccurance(arr, key, idx+1);
     
        
    }
    
}

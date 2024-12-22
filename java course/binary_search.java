public class binary_search {
    public static int bs(int ar[],int key) {
        int start=0;
        int end=ar.length-1;
        
      
      while (start<=end) {
        int mid=(start+end)/2;
        //compared
        if (ar[mid]==key) {
            
            return mid;
            
        }
        else if (ar[mid]>key) {
            end=mid-1;
            
        }
        else
        {
            start=mid+1;
        }

        
      }
      return -1;
  
        
    }
    public static void main(String[] args) {
        int ar[]={2,3,5,7,8,9,45,65};
        int key=9;
      System.out.println("the iindex is"+  bs(ar, key));
    }
    
}

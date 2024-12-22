public class Mountainpeekindex {
    public static int main(String[] args) {
        int n[]={3,4,6,8,9,8,6,4,3,2};
        int start=0;
        int end=n.length-1;
        while (start<=end) {
            int mid=(start+end)/2;
            if(n[mid]>n[mid-1] && n[mid]>n[mid+1]){
                return mid;
            }
            if(n[mid]>n[mid-1]){
                start=mid+1;
            }
            else
            end=mid-1;
            
        }
        return -1;
    }
    
}

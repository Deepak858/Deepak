package DIVIDECONQUER.JAVA.PRACTISE;

public class Majorityelement {
    public static void main(String[] args) {
        int arr[]={2,2,1,1,1,2,2};
       calling(arr);
     
    }
    public static int majority(int arr[],int num,int si,int ei){
        int count=0;
        for(int i=si;i<ei;i++){
            if(arr[i]==num){
                count++;
            }
        }
        return count++;

       
    }
    public static int  majorityelement(int arr[],int si,int ei){
        //base case
        if(si==ei){
            return arr[si];
        }
        int mid=(si+ei)/2;
        int left=majorityelement(arr, si, mid);
        int right=majorityelement(arr, mid+1, ei);
        if(right==left){
            return left;
        }
        int leftcount=majority(arr, left, si, ei);
        int rightcount=majority(arr, right, si, ei);
        return leftcount>rightcount?left:right;
    }
    //calling majorityelement
    public static int calling(int arr[]){
       return majorityelement(arr, 0, arr.length);
    }
    
}

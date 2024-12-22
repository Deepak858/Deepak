public class Stringmerge {
    public static void main(String[] args) {
        String str[]={"earth","mercury","sun","jupitrar","moon"};
        String []arr=mergesort(str,0,str.length-1);
        printArr(arr);
        
    }
    public static void printArr(String arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
  }
  public static String[] mergesort(String []str,int si,int ei){
    //base case
    if(si==ei){
        String[]A= { str[si]};
        return A;
    }
    int mid=(si+ei)/2;
   String arr1[]= mergesort(str, si, mid);
   String arr2[]= mergesort(str, mid+1, ei);
   String arr3[]= merge(arr1,arr2);
   return arr3;
  }
  public static String[] merge(String [] arr1,String [] arr2){
    int n=arr1.length;
    int m=arr2.length;
    String arr3[]=new String[m+n] ;
    int i=0;
    int j=0;
    int k=0;
    while(i<=n && j<=m){
        if (isAlphabeticallySmaller(arr1[i],arr2[j])){
            
            arr3[k++]=arr1[i++];
        }
        else{
            arr3[k]=arr2[j];
            k++;
        j++;
        }
    }
    while (i<=n) {
        arr3[k++]=arr1[i++];
        
    }
    while(j<=m){
        arr3[k++]=arr2[j++];
    }
    return  arr3;
  }
  public static boolean isAlpha(String[] str1,String[] str2){
    if(str1.compareTo(str2)<0){
        return  true;
    }
    return false;

  }
    
}

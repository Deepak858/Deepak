public class revesearray {
    public static void rev(int n[]){
        int start=0;
        int end=n.length-1;
        while (start<end){
            int temp=n[start];
            n[start]=n[end];
            n[end]=temp;
            start++;
            end--;

        }
            
        

    }
    public static void main(String[] args) {
        int n[]={2,5,7,3,4,8,9,5,6,5,453,3,3424,46,56,453,34,32342,53,0,534};
        rev(n);
        //print array
        for(int i=0;i<n.length;i++){
            System.out.print(n[i]+"   ");
        }
        System.out.println();
    }
    
}

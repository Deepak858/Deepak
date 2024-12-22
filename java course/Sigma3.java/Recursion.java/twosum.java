public class twosum {
    public static void main(String[] args) {
        int arr[]={2,4,6,4,7,8 ,9};
        int target=12;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length-1;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println("true");
                }
            }
        }
        System.out.println("false");
        int sc='c'-'a';
        System.out.println(sc);
      
}
}

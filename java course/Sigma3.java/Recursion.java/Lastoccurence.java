public class Lastoccurence {
    public static void main(String[] args) {
        int arr[]={4,6,34,75,7,6,5,4,45,5,45,6,455,4,5,4};
        System.out.println(Lastoccurence(arr, 5, 0));
    }
    //first method



    public static int Lastoccurence(int arr[],int key,int i){
    //     if(i==arr[0]){
    //         return -1;
    //     }
    //     if(arr[i]==key){
    //         return i;
    //     }
    //     return Lastoccurence(arr, key, i-1);
    // }



    //second method

    int isfound=Lastoccurence(arr,key,i+1);
    if(i==arr.length){
        return -1;
    }
    if(isfound!=-1  && arr[i]==key){
        return i;
    }
 
    return isfound;
    
}
}

public class Practise {
    public static void main(String[] args) {
        //problem no 1
        //friend pair
        // System.out.println(friendpair(5));


        //problem no 2
        //binary string
     Strings(3, 0, " ");
     String str="deepaknayak i am loni ghaziabad from uttar pradesh";
     reversestring(str, str.length()-1);
        

    }
    // public static int friendpair(int n){
    //     //base case
    //     if(n==1 || n==2){
    //         return n;

    //     }
    //     //kaam
    //     //single
    //     int f1=friendpair(n-1);
    //     //pair
    //     int f2=friendpair(n-2);
    //     int total=f1+(n-1)*f2;
    //     return total;
    // }
    



public static void Strings(int n,int lastpalace,String str){
    //basecase
    if(n==0){
        System.out.println(str);
        return;
    }
    //kaam
    if(lastpalace==0){
        Strings(n-1, 0, str+="0");
        Strings(n-1, 1, str+="1");
    }
    else{
        Strings(n-1, 1, str+="0");
    }

}
public static void reversestring(String str,int idx){
    //basecase
    if(idx==0){
        System.out.println(str.charAt(idx));
        return;
    }
    System.out.print(str.charAt(idx));
    reversestring(str, idx-1);
}
}
    


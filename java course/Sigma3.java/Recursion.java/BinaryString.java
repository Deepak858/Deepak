public class BinaryString {
    public static void main(String[] args) {
        Strings(3, 0, " ");
        
    }
    public static void Strings(int n,int lastplace,String str){
        //base case
        if(n==0){
        System.out.println(str);
        return;
        }
     
        if(lastplace==0){
            Strings(n-1, 0, str+="0");
            Strings(n-1, 1, str+="1");
        }
        else{
            Strings(n-1, 0, str+="0");
        }

    }
    
}

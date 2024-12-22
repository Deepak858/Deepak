import javax.sound.midi.Soundbank;

public class practice {
    /* 
    
     static int foo(int...args){
        int result=0;
        for (int i : args) {
            result+=i;
            
        }
        return result;


    }
    public static void foo(){
        System.out.println("hello good morning");
    }
        
    public static int foo(int x,int y,int z){
        int res=x+y+z;
        return res;
    }
    
    public static void main(String[] args) {
        System.out.println(foo(5,7,9));
        System.out.println("the total sum in given value"+ foo(7,9,4,6));
        System.out.println("hello coder");
        System.out.println("the total sum is"+foo(6,7,5,4,7));
    }
    )
    //problem 1 print table
    public static void mul(int n){
       // int w=0;
      for(int i=1;i<=10;i++){
     int w=n*i;
     System.out.println(w);
      }
     
    }
        
    
    public static void main(String[] args) {
        mul(7);
        
    
    //problem no2 print n number sum
    public static void sum(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        sum(6);
    }
    */
    public static int fb(int n){
        for(int i=0;i<=n;i++){
            if (i==0) 
            {
                return 0;
                
            }
            else{
                return fb(n-1)+fb(n-2);
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        fb(6);
    }
}

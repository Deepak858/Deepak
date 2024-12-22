/**
 * basic
 */
 public class bsi{
    
    void foo(){
        System.out.println("hello coder");
    }
    void foo(int x){
        int z=x*x;
        System.out.println(z);
        
    }
    int foo(int r,int y){
        int v=r+y;
        return v;

}

    

    public static void main(String[] args) {
        bsi obj=new bsi();
    System.out.print(obj.foo(5,7));
}
}

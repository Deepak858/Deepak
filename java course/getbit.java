public class getbit {
    public static void main(String[] args) {
        int i=2;
        int n=10;
        if((n|1<<i)==0){
            System.out.println("bit is 0");
        }
        else{
            System.out.println("bit is 1");
        }
    }
    
}

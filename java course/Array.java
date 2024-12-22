import java.util.*;
public class Array {
    public static void main(String[] args) {
       int []marks=new int[5];
       marks[0]=95;
       marks[1]=56;
       marks[2]=87;
       marks[3]=67; 
       marks[4]=97;
       
       System.out.println("The math mark is:"+marks[0]);
       System.out.println("The eng mark is:"+marks[1]);
       System.out.println("The phy mark is:"+marks[2]);
       System.out.println("The mchemark is:"+marks[3]);
       System.out.println("The hindi mark is:"+marks[4]);
       int per=(marks[0]+marks[1]+marks[2]+marks[3]+marks[4])/5;
       System.out.println("The final Result is"+per+"%");


       


    }
    
}

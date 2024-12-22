import java.util.*;
public class twodarray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int [][]a=new int[3][3];
        System.out.println("enter your arrays elements");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
             a[i][j]=s.nextInt();
            }
       }
    //   int min=Integer.MAX_VALUE;
    
    //     for(int i=0;i<a.length;i++){
    //         for(int j=0;j<a[0].length;j++){
    //             min=Math.min(a[i][j], min);
    //         }
           
           
    //     }
    //     System.out.println("the minimum element in present in  array is:"+min);
    System.out.println("enter your element");
int n=s.nextInt();
for(int i=0;i<a.length;i++){
    for(int j=0;j<a[i].length;j++){
        if(a[i][j]==n){
         System.out.println("row"+i+","+"col"+j);
    }
}
        
    }
    
}
}

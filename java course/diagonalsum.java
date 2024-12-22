public class diagonalsum {
    public static void main(String[] args) {
        int [][]a={{1,2,3,4},
                   {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,16}};
                    int sum=0;
                //left diagonal sum
                // for(int i=0;i<a.length;i++){
                //     for(int j=0;j<a[0].length;j++){
                //         if(i==j){
                //             sum+=a[i][j];
                //         }
                //         else if((i+j)==a.length-1){
                //             sum+=a[i][j];
                //         }
                //     }

                   
                // }
                // System.out.println("the total sum is:"+sum);
                // for(int i=0;i<a.length;i++){
                //     for(int j=0;j<a[0].length;j++){
                //         if(i==j){
                //             sum+=a[i][j];
                //         }
                //         else if((i+j)==a.length-1){
                //             sum+=a[i][j];
                //         }
                //     }
                // }
                // System.out.println("The maximum sum is:"+sum);
                //     }
                // for(int i=0;i<a.length;i++){
                //     //primary diagonal
                //     sum+=a[i][i];
                //     //secondary diagonal
                //     if(i!=a.length-1-i){
                //         sum+=a[i][a.length-i-1];
                //     }
                // }
                // System.out.println("the total is " +sum);
                for(int i=0;i<a.length;i++){
                    //primary diagonal sum
                    sum+=a[i][i];
                    //secondary diagonal
                    int j=a.length-1-i;
                    if(i!=j){
                        sum+=a[i][j];
                    }
                }
                System.out.println("the total sum is "+" "+sum);
    
}
}
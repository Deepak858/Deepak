

public class searchsortedarray {
    public static void main(int[][] mat,int key) {
      
                     //spiral matrix
        // int startrow=0;
        // int startcol=0;
        // int endrow=mat.length-1;
        // int endcol=mat.length-1;
        // while(startrow<=endrow && startcol<=endcol){
        //     //top startrow fix
        //     for(int i=startcol;i<=endcol;i++){
        //         System.out.println(mat[startrow][i]+" ");
        //     }
        //     //right endcol fix
        //     for(int i=startrow+1;i<=endrow;i++){
        //         System.out.println(mat[i][endcol]+" ");
        //     }
        //     //bottom endrow fix
        //     for(int i=endcol-1;i>=startcol;i--){
        //         System.out.println(mat[endrow][i]+" ");
        //     }
        //     //left startcol fix
        //     for(int  i=endrow-1;i>=startrow+1;i--){
        //         System.out.println(mat[i][startcol]+" ");
        //     }
        //     startcol++;
        //     startrow++;
        //     endcol--;
        //     endrow--;


        // }
        // System.out.println();
        //diagonal sum part 1
        // int sum=0;
        // for(int i=0;i<mat.length;i++){
        //     for(int j=0;j<mat.length;j++){
        //         if(i==j){
        //             sum+=mat[i][j];
        //         }
        //         else if((i+j)==mat[0].length-1){
        //             sum+=mat[i][j];

        //         }

        //         }
        //     }
        //     System.out.println(sum);
        //diagonal sum part 2nd
        // int sum=0;
        // for(int i=0;i<mat.length;i++){
        //     //primary diaona
        //     sum+=mat[i][i];
        //     int j=mat.length-1-i;
        //     if(i!=j){
        //         sum+=mat[i][j];
        //     }
        // }
        // System.out.println("the total value is:"+ sum);
        // 
        
    //search in element in a sorted array
    int row=0;
    int col=mat.length-1;
    while (row<mat.length && col>=0) {
        if(mat[row][col]==key){
            System.out.println("("+row+","+col+")");
            break;
        }
        else if(key<mat[row][col]){
            col--;
        }
        else{
            row++;
        }
     //   System.out.println("key is not found");
        
     }
  
    

   
    }
    public static void main(String[] args) {
        int mat[][]={{1,2,3,4},
    {5,6,7,8},{9,10,11,12},{13,14,15,17}};
    int key=12;
    main(mat, key);

    }
}
  
public class Spiralmatrix {
    public static void main(String[] args) {
        int[][]arr={{1,2,54} , 
    
                    }
                    
                    };
        int sr=0;
        int sc=0;
        int er=arr.length-1;
        int ec=arr.length-1;
        while (sr<=er && sc<=ec) {
            for(int i=sc;i<=ec;i++)
            //top
{
    System.out.println(arr[sr][i]+" ");
}    
//right
for(int i=sr+1;i<=ec;i++){
    System.out.println(arr[i][ec]+" ");
} //bottom  
for(int i=ec-1;i>=sc;i--){
    System.out.println(arr[er][i]+" ");
}    
//left
for(int i=er-1;i>=sr+1;i--){
    System.out.println(arr[i][sc]+" ");
} 
sr++;
sc++;
er--;
ec--;
        }
        System.out.print(" ");
    }
    
}

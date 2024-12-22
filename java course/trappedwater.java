public class trappedwater {
    public static int main(int [] height) {
      int n=height.length;

      //fiind leftmaximum
      int leftmaximum[]=new int[n];
      leftmaximum[0]=height[0];
      for(int i=1;i<n;i++){
        leftmaximum[i]=Math.max(leftmaximum[i-1],height[i]);
      }  
      //find rightmax 
      int rightmax[]=new int[n];
      rightmax[n-1]=height[n-1];
      for(int i=n-2;i>=0;i--){
        rightmax[i]=Math.max(height[i],rightmax[i+1] );

      }
      //find water level
      int trappedwater=0;
      for(int i=0;i<n;i++){
        int waterlevel=Math.min(rightmax[i], leftmaximum[i]);
        trappedwater+=waterlevel-height[i];
      }   
      return trappedwater;  

     
        
    }
    public static void main(String[] args) {
        int height[]={1,8,6,2,5,4,8,3,7};
        System.out.println(main(height));

    }
    
}

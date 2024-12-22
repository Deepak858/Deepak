public class Watertrapp {
    public static int main(int []height) {
        int n=height.length;
        //find leftmax
        int leftmax[]=new int [n];
        leftmax[0]=height[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(height[i], leftmax[i-1]);
        }
        int rightmax[]=new int [n];
        rightmax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(height[i], rightmax[i+1]);
        }
        int trappedwater=0;
        for(int i=0;i<n;i++){
            int waterlevel=Math.min(rightmax[i], leftmax[i]);
            trappedwater+=waterlevel-height[i];
        }
       //System.out.println(trappedwater);
        return trappedwater;
    }
    public static void main(String[] args) {
        int height[]={2,0,3,5,2,6,9,4};
    System.out.println( main(height));  
    }
}

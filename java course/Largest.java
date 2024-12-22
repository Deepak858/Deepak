public class Largest {
    public static void main(String[] args) {
        String str[]={"mango","banana","guava","deepak"};
       int l=str.length;
       String largest=str[0];
       for(int i=1;i<l;i++){
        if (largest.compareTo(str[i])<0) {
            largest=str[i];

            
        }
       }
       System.out.println("The maximum String is "+" "+largest);

      
    }
    
}

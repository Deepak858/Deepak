public class linear_search {
    /*
    private static int ls(String name[],String s){
        int z=name.length;
        for(int i=0;i<z;i++){
            if (name[i]==s) {
                return  i;
                
            }

        }
        return -1;
    }
    public static void main(String[] args) {
       String name[]={"apple","banana","mango","graphes"};
       String s=new  String();
               s="mango";
        int index=ls(name, s);
        if (index==-1) 
        {
            System.out.println("nor found");

            
        }
        else
        System.out.println("the key is"+index);
    }
         */
        //find maximum element in array
        private static void min(int ar[])
    {
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i]<min) {
                min=ar[i];
                
            }
        }
        System.out.println(min);

    }
    public static void main(String[] args) {
        int [] ar={2,4,23,6,8,2,1,45,7,3456,78,3,4,64,6,5,3};
       min(ar);

    }
}

public class octo {
    //String comparission
    // public static void main(String[] args) {
    //     String str="aaabbbfffjjjddddkkol";
    //     System.out.println(main(str));

    // }
    // public static String main(String str) {
    //     String newstr="";
    //     for(int i=0;i<str.length();i++){
    //         Integer count=1;
    //         while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
    //             count ++;
    //             i++;
    //           }
    //           newstr+=str.charAt(i);
    //           if(count>1){
    //             newstr+=count.toString();
    //           }
    //     }
    //     return newstr;
        
    // }
    //string convert each word

    
    /**
     * @param args
     */
    public static void main(String[] args) {
        String str="i am deepak a nayak boy";
        System.out.println(main(str));

        
    }
    public static String main(String str) {
        String newstr="";
        char ch=Character.toUpperCase(str.charAt(0));
        newstr+=ch;
        for(int i=1;i<str.length();i++){
            if((str.charAt(i)).toString()==""&& i<str.length()-1){
                newstr+=str.charAt(i);
                i++;
                newstr+=Character.toUpperCase(str.charAt(i));
            }
            else{
                newstr+=str.charAt(i);
            }
        }
        return newstr.toString();

       

    }
}
    
      
public class Duplicate2 {
    public static void main(String[] args) {
        String str="apnacollege";
        duplicate(str, 0, new StringBuilder(""), new boolean[26]);
     
  
    }
    public static void duplicate(String str,int idx,StringBuilder newstr,boolean map[]){
        //base case
        if(idx==str.length()-1){
            System.out.println(newstr);
            return;
        }
        //kam
        char currchar=str.charAt(idx);
        if(map[currchar-'a']==true){
            duplicate(str, idx+1, newstr, map);
        }
        else{
            map[currchar-'a']=true;
            duplicate(str, idx+1, newstr.append(currchar), map);
        }

    }
}
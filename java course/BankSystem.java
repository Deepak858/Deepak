

public  class BankSystem{
    public static void main(String[] args) {
        // int a[]={10,20,50,50,30,20,10};
        // int res=0;
        // for(int i=0;i<a.length;i++){
        //    res=res^a[i];
        // }
        // System.out.println(res);
        //minimum bit change karka start ko end kaisa banya
        int start=20;
        int end=25;
        int count=0;
       int res=start^end;
       while(res!=0){
        res=res&(res-1);
        count++;
        
       }
       System.out.println("the total number of bits is  used is "+count);
       
        }
        
     
    }

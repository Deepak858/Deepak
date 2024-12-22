public class Tiles {

public static void main(String[] args) {
    System.out.println(Tiles(5));
    
}
public static int Tiles(int n){
    if(n==0||n==1){
        return 1;
    }
//vertical
int var=Tiles(n-1);
//horizontal
int hor=Tiles(n-2);
int total=var+hor;
return total;
}
}

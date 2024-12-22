public class Oopsconcept {
    public static void main(String[] args) {
        student s=new student();
        
       
      
       
        s.setmail("deepaknayak9857@gmail.com");
        System.out.println("your name is:");
        System.out.println( s.newname("Deepak"));
        
        System.out.println(" your age is:");
        System.out.println(s.age(18));
        System.out.println(" your email id is:");
        System.out.println(s.email);
        
    }
}
class student{
    String name;
    int age;
    String email;
    void setname(String newname){
        name=newname;
    }
    void setage(int newage){
        age=newage;
    }
    void setmail(String newmail){
        email=newmail;
    }

}
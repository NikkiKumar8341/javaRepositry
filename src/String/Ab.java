package String;

public class Ab {
    int rollno;//instance variable
    String name;
    static String college ="ITS";//static variable

    Ab(int r, String n){
        rollno = r;
        name = n;
    }
    void display (){System.out.println(rollno+" "+name+" "+college);}


    public static void main(String args[]){
        Ab s1 = new Ab(111,"Karan");
        Ab s2 = new Ab(222,"Aryan");
        //we can change the college of all objects by the single line of code
        //Student.college="BBDIT";
        s1.display();
        s2.display();
    }
}

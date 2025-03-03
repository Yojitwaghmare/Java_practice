
public class file {
    @SuppressWarnings("static-access")
    public static void main(String[] args){
        Newstaticclass s1 = new Newstaticclass();
        s1.schoolname="st. paul";
        s1.setname("yojit",42);
        System.out.println(s1.get());
        Newstaticclass s2 = new Newstaticclass();
        s2.schoolname="new";
        System.out.println(s2.schoolname);
        System.out.println(s2.persentage(34, 45));
    }
}

class Newstaticclass{

    static int persentage(int math, int phy){
       return (math + phy)/2;
    }    
    static String schoolname;
    String name;
    int rollno;

    void setname(String name, int rollno){
        this.name = name;
        this.rollno = rollno;
    }

    String get(){
        return this.name;
    }
}


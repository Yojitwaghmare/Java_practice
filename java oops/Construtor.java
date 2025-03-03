
public class Construtor {
    public static void main(String[] args) {
        Student s = new Student("yojit",42);

        Student s1 = new Student(s);
        s1.name="Student";

    }
}

class Student {
    String name;
    int rollno;

    Student(String name, int rollno) {
        this.name = name;
        this.rollno=rollno;
        System.out.println("Student " + name + " with roll no " + rollno);
    }

    Student(Student s){

        System.out.println("Student " + s.name );
    }
}
// import java.util.Arrays;

// public class copyconstructor {
//     public static void main(String[] args) {
//         Student s = new Student();
//         s.name="yojit"; 
//         s.rollno=42;
//         s.marks[0]=100;
//         s.marks[1]=90;
//         s.marks[2]=80;
//         Student s1 = new Student(s);
//         for (int i = 0; i < 3; i++) {
//             System.out.println(s1.marks[i]);  
//         }
//         System.out.println("Student " + s1.name + " with roll no " + s1.rollno+ " get marks" + Arrays.toString(s1.marks));
//     }
// }

// class Student {
//     String name;
//     int rollno;
//     int marks[]= new int[3];
//     // deep copy of constructor
//     Student(Student s) {
//         this.name = s.name;
//         this.rollno=s.rollno;
//         for (int i = 0; i < marks.length; i++) {
//             this.marks[i] = s.marks[i];
//         } 
//     }

//     // Student(Student s) {
//     //     this.name = s.name;
//     //     this.marks = s.marks;
//     //     this.rollno=s.rollno;
//     //     int marks[]= new int[3];
        
//     // }

//     Student(){
//         System.out.println("Student class is called");
//     }
// }

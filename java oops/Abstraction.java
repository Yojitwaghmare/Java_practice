public class Abstraction {
    public static void main(String[] args) {
        bird b = new bird();
        
        b.walk();
        System.out.println(b.color);
    }
}
abstract class Animal{
    String color;
    Animal(){
         color="brown";
        System.out.println(color);
    }
    void name(){
        System.out.println("Animal");       
    }

    abstract void walk();
} 

class bird extends Animal{

    bird(){
        color="black";
        System.out.println(color);
    }
    void changecolor(){
        color="black";
    }
    void walk(){
        System.out.println("fly");
    }
}
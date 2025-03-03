
public class Inteface {
    public static void main(String[] args) {
        queen q=new queen();
        // king k=new king();
        // rook r=new rook();
        q.move();
        beer b=new beer();
        b.drink();
        b.eat();
    }
}
interface carnivorus {
    void eat();
}

interface harvivorus{
    void drink();
}

class beer implements carnivorus,harvivorus{
    public void drink(){
        System.out.println("water");
    }

    public void eat(){
        System.out.println("fish");
    }
}

interface chessplayer{
    void move();
}

class queen implements chessplayer   {
    public void move(){
        System.out.println("queen move");
    }
}

class king implements chessplayer   {
    public void move(){
        System.out.println("king move");
    }
}

class rook implements chessplayer   {
    public void move(){
        System.out.println("Rook move");
    }
}

public class Cookie{
    private String color;

    public Cookie(String yojit) { 
        this.color=yojit; 
    }
 
    public String give(){
        return color;
    }

    public void set(String yojit){
        this.color=yojit;
    }


    public static void main(String[] args){
    
        Cookie name =new Cookie("waghmare");

        System.out.println(name.give());
    }

}



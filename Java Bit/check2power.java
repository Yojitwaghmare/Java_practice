
public class check2power {

    public static boolean isPower(int n){
        int check=n & (n-1);
        if(n==1||n==0){
            System.out.println("not a power of 2");
            return false;
        }
        if(check==0){
            System.out.println("it is a power of 2");
            return true;
        }else{
            System.out.println("it is not a power of 2");
            return false;
        }
    }
    public static void main(String[] args) {
        isPower(0);
        
    }
}

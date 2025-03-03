
public class increasing {
    public static void dec(int n){
        if (n==1) {
            System.out.print(n);
            return;
        }
        dec(n-1);
        System.out.print(n);
       
    }
    public static void main(String[] args) {
        dec(10);
    }
}

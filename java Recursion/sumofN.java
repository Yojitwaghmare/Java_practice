
public class sumofN {
    public static int sumsofN(int n){
        
        if (n==1) {
            return 1;
        }
        int fact = n;
        fact = fact+sumsofN(n-1);
        return fact;
    }
    public static void main(String[] args) {
        int result=sumsofN(5);
        System.out.println(result);
    }
}

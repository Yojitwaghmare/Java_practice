

public class factorial {
    public static int factorialofN(int n){
        
        if (n==1) {
            return 1;
        }
        int fact = n * factorialofN(n-1) ;
        return fact;
    }
    public static void main(String[] args) {
        int result=factorialofN(5);
        System.out.println(result);
    }
}

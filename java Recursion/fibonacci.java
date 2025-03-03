

public class fibonacci {
    public static int fibnacciofN(int n){
        if(n==0||n==1){
            return n;
        }else{
            return fibnacciofN(n-1)+fibnacciofN(n-2);
        } 
    }
    public static void main(String[] args) {
        
        System.out.println(fibnacciofN(8));
        
        
    }
}

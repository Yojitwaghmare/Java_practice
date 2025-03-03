

public class fastexponentition {
    public static void fastmultiplication(int a,int power){
       int ans = 1;

        while (power > 0) {
            int lsb=power&1;
            if (lsb!=0) {
                ans=ans*a;
                a=a*a;
            }else{
                a=a*a;
                ans=ans*1;
            }
            power=power>>1;
        }

        System.out.println(ans);
    }
    public static void main(String[] args) {
        fastmultiplication(3, 5);
    }
    
}

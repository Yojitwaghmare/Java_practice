

public class getsetclear {
    public static void getbit(int n,int i) {
        int bitmax=1<<i;
        if ((n & bitmax)==0) {
            System.out.println("0");
        }else{
            System.out.println("1");
        }
    }

    public static void setbit(int n,int i,int v) {
        int bitmax=0;
        int bit = 0;
        if (v==0) {
            bitmax=1<<i;
            bit=n ^ bitmax;
        }else{
            bitmax=1<<i;
            bit = n | bitmax;
        }
        System.out.println(bit);
    }

    public static void clearbit(int n,int i) {
        int  bitmax=1<<i;
        int  bit=n ^ bitmax;
        System.out.println(bit);
    }
    public static void main(String[] args) {
        getbit(5, 0);
        setbit(6, 2, 0);
        clearbit(7, 2);
    }
}

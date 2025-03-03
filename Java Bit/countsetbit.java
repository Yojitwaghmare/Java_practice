

public class countsetbit {


    public static void count(int v) {
        int count=0;
        // for (int i = 0; i < 8; i++) {
        // int bitmax=1<<i;
        // if ((v & bitmax)!=0) {
        //     count++;    
        // }
        // }
        // System.out.println(count);
        while (v>0) {
            if ((v & 1)!=0) {
                count++;    
             }
             v=v>>1;
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        count(10);
    }
}



public class clearrangeij {
    public static void main(String[] args) {
        int n =15;
        int index=2;
        int start=1;
        for (int i = start; i <= index; i++) {
            int bitmax= 1<<i;
            n=n ^ bitmax;
            
        }
        System.out.println(n);
    }
}

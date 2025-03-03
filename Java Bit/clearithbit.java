
public class clearithbit {
    public static void main(String[] args) {
        int n =15;
        int index=2;
        
        for (int i = 0; i < index; i++) {
            int bitmax= 1<<i;
            n=n ^ bitmax;
            
        }
        System.out.println(n);
    }
    
}


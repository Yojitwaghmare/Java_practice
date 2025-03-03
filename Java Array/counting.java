
import java.util.Arrays;

public class counting {
    public static void main(String[] args) {

        int [] arr = {1,4,1,3,2,3,4,7};
        int []count=new int[arr.length];
        
        for (int i = 0; i <arr.length; i++) {
            count[arr[i]]=count[arr[i]]+1;
        }
        int var=0;
        for (int i = 0; i < count.length; i++) {
            for (int j = count[i]; j>0 ; j--) {
                arr[var]=i;
                var++;
            }
        }
        System.out.print(Arrays.toString(arr));
        
    }
}

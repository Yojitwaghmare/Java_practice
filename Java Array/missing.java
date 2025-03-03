
import java.util.Arrays;

public class missing {
    public static void main(String[] args) {
        int n=5;
        int arr[]={1,3,5};
        int count=0;
        int newarr[]=new int[n-(arr.length)];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != (arr[i-1]+1)) {
                  newarr[count] = arr[i-1]+1;
                  count++;
            }
        }
        System.out.print(Arrays.toString(newarr));
    }
}

import java.util.Arrays;

public class middlesum {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 4, 6, 10};
        int arr2[] = {4, 5, 6, 9, 12};

        int a1 = arr1.length;
        int b1 = arr2.length;
        int c1=a1+b1;
        int[] c = new int[c1];
        System.arraycopy(arr1, 0, c, 0, a1);
        System.arraycopy(arr2, 0, c, a1, b1);
        Arrays.sort(c);
        int sum=c[c.length/2]+c[(c.length/2)-1];
        System.out.println(Arrays.toString(c));
        System.out.println(sum);

        
    }
}

import java.util.*;

public class coding {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        int count=0;
        String s="dhjfke";
        String t="hdgvdd";
        int K=6;
    int arr[]=new int[s.length()];
    for (int i = 0; i < s.length(); i++) {
        int cost=Math.abs(s.charAt(i)-t.charAt(i));
        cost=Math.abs(K-cost);
        arr[i]=cost;
        K=cost;
    }
    System.out.println(Arrays.toString(arr));
    }
}

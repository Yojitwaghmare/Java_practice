public class Gridway {

    public static int gridways(int arr[][],int n,int m){
        if (m>arr.length-1||n>arr.length-1) {
            return 0;
        }

        if ((n==arr.length-1 && m==arr.length-1)) {
            return 1;
        }
        return gridways(arr, n, m+1)+gridways(arr, n+1, m);
    }

    public static void main(String[] args) {
        System.out.println(gridways(new int[3][3], 0, 0));

    }
}

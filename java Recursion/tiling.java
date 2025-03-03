public class tiling {
    

    public static int findways(int n) {
        if(n==1||n==0){
            return 1;
        }
        int val=findways(n-1)+findways(n-2);
        return val;
    }
    public static void main(String[] args) {
        System.out.println(findways(3));
    }
}


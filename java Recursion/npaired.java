public class npaired {
    // public static int findways(int n) {
    //     if(n==1||n==0){
    //         return 1;
    //     }
    //     int val=findways(n-1)+findways(n-2);
    //     return val;
    // }

    public static int findways(int n,int val) {
        if(n==1){
            return n;
        }
        // int val=(n)*findways(n-1)-findways(n-1);
        // int val=findways(n-1)+(n-1)*findways(n-2);
        
        val =findways(n-1,val+1);
        
        return val;
    }

    public static void main(String[] args) {
        System.out.println(findways(4,0));
    }
}

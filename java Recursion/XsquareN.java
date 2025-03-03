public class XsquareN {
    public static int squareof(int x, int power) {
        if(power==1){
            return x;
        }
       int val=x*squareof(x, power-1);
       return val;
    }

    public static int optimize(int x, int power) {
        if(power==1){
            return x;
        }
        // if (power%2==0) {
        //     int val=optimize(x, (power/2))*optimize(x, (power/2));
        //     return val;
        // }else{
        //     int val=x*optimize(x, (power/2))*optimize(x, (power/2));
        //     return val;
        // }
        int val=optimize(x, (power/2));
        int valsquare= val*val;
        if(power%2!=0){
            valsquare=x*valsquare;
        }
        return valsquare;
    }

    public static void main(String[] args) {
        System.out.println(optimize(2,10));
    }
}

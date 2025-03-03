public class MovingXend {
    public static void moveX(int n,String str,String str1,String str2){
        if (n==str.length()) {
            System.out.println(str1+str2);
            return;
        }
        if (str.charAt(n) == 'x') {
            moveX(n+1, str, str1, str2+'x');
        }else{
            moveX(n+1, str, str1+str.charAt(n), str2);
        }
    }
    public static void main(String[] args) {
        moveX(0, "axbcxxd", "", "");
    }
}

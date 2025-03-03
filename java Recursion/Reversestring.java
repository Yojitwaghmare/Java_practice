public class Reversestring {


    public static void reversestring(int n,String str,String str1){
        if (n==str.length()) {
            System.out.println(str1);
            return;
        }
        reversestring(n+1, str, str1+str.charAt(str.length()-n-1));
    }
    public static void main(String[] args) {
        reversestring(0,"abcd", "");
    }
}

public class substring {
    public static void Findsubstring(int n,String str, String ans ) {
        if (n==str.length()) {
            System.out.println(ans);
            return;
        }
        Findsubstring(n+1, str, ans+str.charAt(n));
        Findsubstring(n+1, str, ans);
        
    }
    public static void main(String[] args) {
        String str="abc";
        
        Findsubstring(0, str,new String(""));
    }
}

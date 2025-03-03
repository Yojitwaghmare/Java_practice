public class samechar {
    public static int countSubstrs(String str, int i, int j, int n) {
        if (n == 1) {
        return 1;
        }
        if (n <= 0) {
        return 0;
        }
        int res = countSubstrs(str, i + 1, j, n - 1) + countSubstrs(str, i, j - 1, n - 1) - countSubstrs(str, i + 1, j - 1, n - 2);
        if (str.charAt(i)==str.charAt(j)) {
            res=res+1;
        }
        return res;
    }
    public static void main(String[] args) {
        
        String str="aba";
        System.out.println(countSubstrs(str, 0, str.length()-1, str.length()));
        int count =0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                if (str.charAt(i)==str.charAt(j)) {
                    count++;
                }
            }
        }
        System.out.println(count);

    }
}

public class phonekeyword {
    public static String[] keyword={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printkeyword(String str,int idx,String comb){
        if (idx==str.length()) {
            System.out.println(comb);
            return;
        }
        char currchar = str.charAt(idx);
        String mapping  = keyword [currchar-'0'];

        for (int i = 0; i < mapping.length(); i++) {
            printkeyword(str, idx+1, comb+mapping.charAt(i));
        }
    }
    public static void main(String[] args) {
        printkeyword("63", 0, "");
    }
}

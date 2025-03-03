import java.util.LinkedHashSet;

public class removeduplicate {
    
    public static LinkedHashSet<Character> remove(String str,int n,LinkedHashSet<Character>hs){ 
        if (n==str.length()) {
            return hs;
        }
        hs.add(str.charAt(n));
        remove(str, n+1,hs);
        return hs;
    }
    // public static void remove(String str,int n,StringBuilder sb,boolean arr[]){ 
    //     if (n==str.length()) {
    //         System.out.println(sb);
    //         return ;
    //     }
    //     char current=str.charAt(n);
    //     if (arr[current-'a']!=true) {
    //         arr[current-'a']=true;
    //         sb.append(current);
    //         remove(str, n+1,sb,arr);
    //     }else{
    //         remove(str, n+1,sb,arr);
    //     }
        
    public static void main(String[] args) {
        String str="appnacollege";
        // StringBuilder sb = new StringBuilder();
        // boolean arr[]=new boolean[26];
        // remove(str,0,sb,arr);
        LinkedHashSet<Character>hs= new LinkedHashSet<>();
        System.out.println(remove(str, 0,hs));
        
    }
        
}

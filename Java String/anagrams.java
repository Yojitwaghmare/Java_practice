import java.util.Arrays;

public class anagrams {

    
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        findanagrams(str1, str2);
    }

    private static void findanagrams(String str1, String str2) {
        char[] ch=str1.toCharArray();
        char[] ch1=str2.toCharArray();

        // Sort both strings
        Arrays.sort(ch);
        Arrays.sort(ch1);

        // Check if sorted strings are equal
        if(Arrays.equals(ch, ch1)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }
}

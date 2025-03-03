public class RecursiveCount {

    // Single recursive function to simulate the double for loop
    public static int countSubstrs(String S, int i, int j, int n) {
        // Base case: If i has reached the end of the string, we're done
        if (i == n) {
            return 0;
        }
        // Base case: If j has reached the end of the string, move to the next i
        if (j == n) {
            return countSubstrs(S, i + 1, i, n);
        }
        // Check if the characters at positions i and j are the same
        int count = (S.charAt(i) == S.charAt(j)) ? 1 : 0;
        // Continue with the next j, or move to the next i when j reaches n
        return count + countSubstrs(S, i, j + 1, n);
    }

    public static void main(String[] args) {
        String S = "abcab";
        int n = S.length();
        // Start the recursion with the initial values of i and j
        System.out.println("The count of all contiguous substrings starting and ending with the same character is: " + countSubstrs(S, 0, 0, n));
    }
}
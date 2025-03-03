

public class Practice {
    public static void printindex(int n,int arr[],int key){
        if (n==arr.length) {
            return;
        }

        if (arr[n]==key) {
            System.out.print(n);
        }
        printindex(n+1,arr, key);
    }

    public static void converDtoS(int n,String word[],int number[],StringBuilder str){
      if (n==number.length) {
        System.out.println(str);
        return;
      }  

      int val=number[n];
      str.append(word[val-1]+" ");
      converDtoS(n+1, word, number, str);
    }

    public static int endsubstring(int n,String str,int count,int arr[]){
        if (n==str.length()) {
            return 0;
        }
        arr[str.charAt(n)-'a']++;
        endsubstring(n+1, str, count, arr);   
        if (n==0) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i]>1) {
                    arr[i]++;
                }
                count+=arr[i];
            }  
        }
        return count;
    }

    public static int countSubstrs(String str, int i, int j, int n) {
        if (n == 1) {
        return 1;
        }
        if (n <= 0) {
        return 0;
        }
        int res = countSubstrs(str, i + 1, j, n - 1) + countSubstrs(str, i, j - 1, n - 1) - countSubstrs(str, i + 1, j - 1, n - 2);

       
        return res;
    }
       
    public static void main(String[] args) {
        // int arr[]= {3,2,5,6,2,7,2,2};
        // printindex(0,arr,2);

        // String word[]={"one","two","three","four","five","six","seven","eight","nine"};
        // int number[]={1,9,4,7};
        // converDtoS(0, word, number,new StringBuilder(""));
        String str="abcab";
        // for (int i = 0; i < str.length(); i++) {
        //     int sum=endsubstring(0, str,0,str.charAt(i));
        //     System.out.println(sum);
        // }
        // int arr[]=new int[26];
        // System.out.println(endsubstring(0, str,0,arr));
        System.out.println(countSubstrs(str, 0, str.length()-1, str.length()));

    }
}

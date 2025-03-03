import java.util.Arrays;
public class Quicksort {

    public static void quicksorting(int arr[],int starti,int endi){
        if (starti>=endi) {
            return;
        }
        int prt=partition(arr, starti, endi);
        quicksorting(arr, starti, prt-1);
        quicksorting(arr, prt+1, endi);
    }


    public static int partition(int arr[],int starti,int endi) {
        int i=starti-1;
        int pvoit=arr[endi];
        for (int j = starti; j < endi; j++) {
            
            if (arr[j]<=pvoit) {
                i++;
                int temp =arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }  
        }
            i++;
            int temp =pvoit;
            arr[endi]=arr[i];
            arr[i]=temp;
        
        return i;
    }
    public static void main(String[] args) {
        int arr[]={2,1,5,3,7,4};
        quicksorting(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}

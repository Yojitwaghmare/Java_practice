import java.util.Arrays;

public class mergesort {
    
    public static void mergesorting(int arr[],int starti,int endi){
        if (starti>=endi) {
            return;
        }
        int middle=starti+(endi-starti)/2;
        
        mergesorting(arr, 0, middle);
        mergesorting(arr, middle+1, endi);
        
        int Temp[]=new int[endi-starti+1];
        int i=starti;
        int j=middle+1;
        int k=0;
        while(i<=middle&&j<=endi) {
            if (arr[i]<arr[j]) {
                Temp[k]=arr[i];
                i++;
            }else{
                Temp[k]=arr[j];
                j++;
            }
            k++;
        }

        while (i<=middle) {
            Temp[k++]=arr[i++];
        }

        while (j<=endi) {
            Temp[k++]=arr[j++];
        }
        for ( k = 0 , i=starti; k < Temp.length; k++,i++) {
            arr[i]=Temp[k];
        }
        
    }

    public static void main(String[] args) {
        int arr[]={2,1,5,3,7,4};
        mergesorting(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}

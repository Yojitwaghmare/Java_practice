
import java.util.*;

public class target {
    public static void main(String[] args) {
        int arr[]={0,1,2,4,5,6,7,8};
        int arrnew[]=new int[arr.length];
        int key=3; 
        int target=4;
        int value=Integer.MIN_VALUE; 
        for (int i = 0; i <arr.length-key; i++) {
            arrnew[i]=arr[i+key];
        }

        for (int i = arr.length-key; i < arr.length; i++) {
            arrnew[i]=arr[i-(arr.length-key)];
        }
        System.out.println(Arrays.toString(arrnew));
        for(int i=0;i<arrnew.length;i++){
            if(arrnew[i]==target){
               value=i;
               System.out.println(i);
            }  
        }if(value<0){
            System.out.println("-1");
        }
        
    }

}


import java.util.*;

public class Array {

    public static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        ArrayList<Integer> list= new ArrayList<>();
        int i,j,k;
        int r = s;
        int sum=0;
        for(i=0;i<arr.length;i++){
            for(j=i;j<arr.length;j++){
                sum=0;
                for(k=i;k<=j;k++){
                    sum+=arr[k];
                    if(sum==r){
                        break;
                    } 
                    else if(sum>n){
                        break;
                    }
                }
                if(sum==r){
                    list.add(i);
                    list.add(j);
                    break;
                }
            sum=0;
            }
           
        }
         if(sum!=r){ System.out.println(-1);
    }
        
        return list;
    }
    
    public static void main(String[] args){
       ArrayList<Integer> result= subarraySum(new int[]{1,2,3,7,5},5,12);
       System.out.println(result);
    }
}

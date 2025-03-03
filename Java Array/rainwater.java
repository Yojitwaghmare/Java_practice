
import java.util.*;

public class rainwater {
    public static void main(String[] args) {
        int []array = new int[]{4,2,0,6,3,2,5,};
        int var1=0;
        int var2=0;
        int volume=0;
        int []array1 = new int[array.length];
        int []array2 = new int[array.length];
        for (int i=0; i<array.length; i++) {
            if(array[i]>var1){
                var1 = array[i];
                array1[i] = var1;
            }else{
                array1[i] = var1;
            }
        }

        for (int i=array.length-1; i>=0; i--) {
            if(array[i]>var2){
                var2 = array[i];
                array2[i] = var2;
            }else{
                array2[i] = var2;
            }
        
        }
        for(int i = 0; i <array.length; i++){
            int v = Math.min(array1[i], array2[i]);
            volume += v-array[i];
        }
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(volume);
    }
}


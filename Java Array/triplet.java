
import java.util.ArrayList;


public class triplet {
    public static void main(String[] args) {

        int []array = {-1,0,1,2,-1,-4};
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-1; j++) {
                if(i!=j){
                   list.clear();    
                    if (array[i]+array[j]+array[j+1]==0 && i!=j+1 && i!=j&& j!=j+1) {
                        list.add(array[i]);
                        list.add(array[j]);
                        list.add(array[j+1]);
                        System.out.println(list.toString());
                    }
                    
                }
            }
        }
    }
}

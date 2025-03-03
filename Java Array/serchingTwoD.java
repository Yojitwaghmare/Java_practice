
public class serchingTwoD {
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int key=16;
        for (int i = 0; i < matrix.length; i++) {
            int startcol = 0;
            int endcol = matrix[0].length-1;
            while (startcol<=endcol) {
                    
                int middle = (startcol+endcol)/2;
                if (matrix[i][middle] == key) {
                    System.out.println("key found at: "+ i + ","+ middle);
                }

                if(key>matrix[i][middle]){
                    startcol = middle+1;
                }else{
                    endcol = middle-1;
                }
                middle = (startcol+endcol)/2;

            }
        }
    }
}

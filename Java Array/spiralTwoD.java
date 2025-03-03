
public class spiralTwoD {
    public static void main(String[] args) {
        // int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int matrix[][]={{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        int startrow=0;
        int endrow=matrix.length-1;
        int startcol=0;
        int endcol=matrix[0].length-1;
        while (startrow<=endrow && startcol<=endrow) {
            
        
        for (int i = startcol; i <=endcol; i++) {
            System.out.print(matrix[startrow][i]+" ");
            
        }startrow++;
        
        for (int i = startrow; i <=endrow; i++) {
            System.out.print(matrix[i][endcol]+ " ");
        }endcol--;
        
        if (startcol < endcol ) {
            for (int i =endcol; i >=startcol; i--) {
                System.out.print(matrix[endrow][i]+ " ");
            } endrow--;
        }
       
        if (startrow < endrow) {
            for (int i = endrow; i>=startrow; i--){
                System.out.print(matrix[i][startcol]+ " ");
            }startcol++;
        }
        
        }
    
    }
}

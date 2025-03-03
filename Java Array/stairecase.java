
public class stairecase {

    public static boolean search(int matrix[][],int key){
        
        int i=0, j=matrix[0].length-1;
        while (i<matrix.length && j>=0) {
            if (matrix[i][j]>key) {
                j=j-1;
            }else if(matrix[i][j]<key){
                i=i+1;
            }
            else{
                System.out.println("("+i+","+j+")");
                return true;
            }
            
        }
        System.out.println("not found");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        search(matrix,9);
        
       
    }
}

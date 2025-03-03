public class Nqueen {

    public static boolean isSafe(char chess[][] ,int row,int col){
        for (int i = row-1; i >=0; i--) {
            if (chess[i][col]=='Q') {
                return false;
            }
        }

        for (int i = row-1,j=col-1; i >=0 && j>=0; i--,j--) {
            if (chess[i][j]=='Q') {
                return false;
            }
        }
        for (int i = row-1,j=col+1; i >=0 && j<chess.length; i--,j++) {
            if (chess[i][j]=='Q') {
                return false;
            }
        }
        return true;
    }

    public static void NQueen(char[][] chess, int row) {
        if (row==chess.length) {
            print(chess);
            return;
        }

        for (int j = 0; j < chess.length; j++) {
            if(isSafe(chess, row, j)){
            chess[row][j]='Q';
            NQueen(chess, row+1);
            chess[row][j]='X';
            }
            
        }
    }

    public static void print(char[][] chess) {
        System.out.print("_______chess_______");
        for (int i = 0; i < chess.length; i++) {
            System.out.println();
            for (int j = 0; j < chess.length; j++) {
                System.out.print(chess[i][j]+" ");
            }
            
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n=4;
        char chess[][]=new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                chess[i][j]='X';
            }
        }
        NQueen(chess,0);
    }
}

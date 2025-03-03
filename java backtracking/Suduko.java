public class Suduko {
    public static boolean isSafe(int soduko[][],int row,int col,int num){
        for (int i = 0; i < 9; i++) {
           if(soduko[row][i]==num) {
            return false;
           }
        }

        for (int i = 0; i < 9; i++) {
            if(soduko[i][col]==num) {
             return false;
            }
        }

        int sr=(row/3)*3;
        int sc=(col/3)*3;

        for (int i=sr; i < sr+3; i++) {
            for(int j=sc; j<sc+3; j++){
                if (soduko[i][j]==num) {
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean Sodukosolve(int soduko[][],int row,int col){
        if (row==9&&col==0){
           return true;
           
        }
        int nextrow=row,nextcol=col+1;
        if (nextcol==9){
            nextrow=row+1;
            nextcol=0;
        }
        
        if (soduko[row][col]!=0) {
            return Sodukosolve(soduko, nextrow,nextcol);
        }

        for (int num = 1; num <= 9; num++) {
            if(isSafe(soduko,row,col,num)){
                soduko[row][col]=num;
                if (Sodukosolve(soduko, nextrow, nextcol)) {
                    return true;
                }
                soduko[row][col]=0;
            }
        }
        return false;
    }
    public static void printsoduko(int[][] soduko) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(soduko[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int sodoku [] [] = { {0, 0, 8, 0, 0, 0, 0, 0, 0},
        {4, 9, 0, 1, 5, 7, 0, 0, 2},
        {0, 0, 3, 0, 0, 4, 1, 9,0},
        {1, 8, 5, 0, 6, 0, 0, 2, 0},
        {0, 0, 0, 0, 2, 0, 0, 6,0},
        {9, 6, 0, 4, 0, 5, 3, 0, 0},
        {0, 3, 0, 0, 7, 2, 0, 0, 4},
        {0, 4, 9,0, 3, 0, 0, 5, 7},
        {8, 2, 7, 0, 0,9, 0, 1, 3} 
        };
        if (Sodukosolve(sodoku, 0, 0)) {
            System.out.println("Solution");
            printsoduko(sodoku);
        }else{
            System.out.println("no soloution");
        }

    }
}


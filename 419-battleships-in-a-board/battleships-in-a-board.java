class Solution {
    public int countBattleships(char[][] board) {
            int r = board.length;
            int c = board[0].length;        

int battle = 0 ;
             for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                    if(board[i][j]=='X'){
                        battle++;
                        board[i][j]='.';
                        int temp1=j;
                        while(temp1+1<c && board[i][temp1+1]=='X'){
                            board[i][temp1+1]='.';
                            temp1++;
                        }
                        int temp2=i;
                        while(temp2+1<r && board[temp2+1][j]=='X'){
                            board[temp2+1][j]='.';
                            temp2++;
                        }
                    }
            }
           
             }
               return battle;
    }
}
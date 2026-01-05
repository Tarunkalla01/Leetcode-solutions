class Solution {
    public int countBattleships(char[][] board) {
            int r = board.length;
            int c = board[0].length;        
            int battle=0;
                for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                    if(board[i][j]=='X'){
                       battle++;
                       if(i>0&&board[i-1][j]=='X'){
                        battle--;
                       }
                       if(j>0&&board[i][j-1]=='X'){
                        battle--;
                       }

                    }

            }
           
             }
               return battle;
    }
}
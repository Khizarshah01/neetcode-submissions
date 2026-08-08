class Solution {
    public boolean isValidSudoku(char[][] board) {
        int l = 9;
        int n = 9;

        // row
        for(int i = 0; i<n; i++){
            Set<Character> mySet = new HashSet<>();
            for(int j =0; j<l; j++){
                if(board[i][j]=='.') continue;
                if(mySet.contains(board[i][j])) return false;
                mySet.add(board[i][j]);
            }
        }

        // column

        for(int i = 0; i<n; i++){
            Set<Character> mySet = new HashSet<>();
            for(int j =0; j<l; j++){
                if(board[j][i]=='.') continue;
                if(mySet.contains(board[j][i])) return false;
                mySet.add(board[j][i]);
            }
        }

        // box

        for(int sr = 0; sr<9; sr+=3){
            int er = sr+2;

            for(int sc = 0; sc<9; sc+=3)
            {
                int ec = sc+2;
                if(!inbox(board,sr,er,sc,ec)){
                    return false;
                }
            }
        }

        return true;
    }
    private boolean inbox(char[][] board, int sr, int er, int sc, int ec){
        Set<Character> mySet = new HashSet<>();
        for(int i = sr; i<=er; i++){
            for(int j = sc; j<=ec; j++){
                if(board[i][j]=='.') continue;
                if(mySet.contains(board[i][j])) return false;
                mySet.add(board[i][j]);
            }
        }
        return true;
    }
}

class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet seen = new HashSet<Character>();
        

        //check row by row
        //row
        for (int i = 0; i < board[0].length; i++){
            //col\
            seen.clear();
            for (int j = 0; j < board.length; j++){
                if (seen.contains(board[i][j])){
                    return false;
                } else if (board[i][j] != '.')
                {
                    seen.add(board[i][j]);
                }
            }
        }

        for (int i = 0; i < board.length; i++){
            //col\
            seen.clear();
            for (int j = 0; j < board[0].length; j++){
                if (seen.contains(board[j][i])){
                    return false;
                } else if (board[j][i] != '.')
                {
                    seen.add(board[j][i]);
                }
            }
        }

        //each box row
        for (int i = 0; i < board[0].length; i+=3){
            //for each box Col
            for (int j = 0; j < board.length; j+=3){
                seen.clear();
                
                for (int x = 0; x < 3; x++){
                    for (int y = 0; y < 3; y++){
                        if (seen.contains(board[x + i][y + j])){
                            return false;
                        } else if (board[x + i][y + j] != '.'){
                            seen.add(board[x + i][y + j]);
                        }
                        
                    }
                }
            }
        }
        return true;
    }
}

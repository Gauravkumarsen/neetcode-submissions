class Solution {
    public boolean isValidSudoku(char[][] board) {
        for( int row = 0;row<9;row++){
            Set<Character> set = new HashSet<>();
            for( int column=0;column<9;column++){
                if(board[row][column] == '.') continue;
                if(set.contains(board[row][column])) return false;
                set.add(board[row][column]);
            }
        }

        for(int column=0;column<9;column++){
            Set<Character> set = new HashSet<>();
            for(int row = 0;row<9;row++ ){
                if(board[row][column] == '.') continue;
                if(set.contains(board[row][column])) return false;
                set.add(board[row][column]);
            }
        }
        for( int box = 0;box<9;box++){
            Set<Character> set = new HashSet<>();
            for( int row=0;row<3;row++){
                for(int column=0;column<3;column++){
                    int boxRow = row + (box/3)*3;
                    int boxColumn = column + (box%3)*3;
                if(board[boxRow][boxColumn] == '.') continue;
                if(set.contains(board[boxRow][boxColumn])) return false;
                set.add(board[boxRow][boxColumn]);                }
            }
        }

        return true;
    }

}

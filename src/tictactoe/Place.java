package tictactoe;


public class Place {
    char[][] board = PrintBoard.board;
    public static class FullPlace {
        char[][] board = PrintBoard.board;

        public boolean isFull(int row, int col) {
            if (board[row - 1][col - 1] == 'X' || board[row - 1][col - 1] == 'O')//si un X ou un Y est déja present
                 {
                return true;
            }
            return false;
        }


    }
}

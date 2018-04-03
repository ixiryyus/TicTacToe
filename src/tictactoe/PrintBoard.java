package tictactoe;

public class PrintBoard {
    public static char[][] board = new char[3][3];


    public void printBoard() {

        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
        }
        System.out.println("-------------");

    }
}

// -------------
//| _ | _ | _ |
//| _ | _ | _ |
//| _ | _ | _ |
//-------------
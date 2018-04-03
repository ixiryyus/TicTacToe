package tictactoe;

import java.util.Scanner;

class Game {
    PrintBoard map = new PrintBoard();
    Place.FullPlace fullPlace = new Place.FullPlace();
    ChangePlayer playerChanger = new ChangePlayer();
    HasWon winner = new HasWon();
    Scanner input = new Scanner(System.in);
    char[][] board = PrintBoard.board;
    int row, col;


    void StartGame() {


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '_';
            }
        }


        map.printBoard();
        while (winner.Winner()) {

            row = input.nextInt();
            col = input.nextInt();
            if (row > 3 || col > 3) {
                System.err.println("Dans le tableaux, c'est mieux!!\nTry again!");

            } else {
                if (fullPlace.isFull(row, col)) {
                    System.err.println("Tu ne peux pas poser de jeton par dessus un autre");

                } else {
                    board[row - 1][col - 1] = playerChanger.getTurn();
                    map.printBoard();
                    playerChanger.whichPlayer();
                }

            }


        }
        playerChanger.whichPlayer();
        System.out.println("Le gagnant est" + playerChanger.getTurn()); // affiche le gagnant et passe à l'autre joueur;
    }

    public static class ChangePlayer {
        public char turn = 'X';

        public void whichPlayer() {
            if (turn == 'X') {
                turn = 'O';
                System.out.println("C'est au tour de O");
            } else {
                turn = 'X';
                System.out.println("C'est au tour de X");

            }
        }

        public char getTurn() {
            return turn;
        }


    }
}
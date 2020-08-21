package tictactoe;

public class Board {
    private static final char[][] board = new char[3][3];

    public void fillBoard(String fieldLine) {
        int current = 0;

        for (int row = 2; row >= 0; row--) {
            for (int col = 0; col <= 2; col++) {
                board[row][col] = fieldLine.charAt(current++);
            }
        }

    }

    public char[][] getBoard() {
        return board.clone();
    }

    public void printBoard() {
        System.out.println("---------");

        for (int row = 2; row >= 0; row--) {
            System.out.print("| ");
            for (int col = 0; col <= 2; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.print("|");

            System.out.println();
        }
        System.out.println("---------");

    }
}

package tictactoe;

import java.util.Random;

public class Easy extends Player {
    static String coordinate;
    char character;

    public Easy(char character) {
        this.character = character;
    }

    @Override
    public String makeMove(char[][] board) {
        System.out.println("Making move level \"easy\"");
        coordinate = easyPlay(board);
        return coordinate;
    }

    public static String easyPlay(char[][] board) {
        Random random = new Random();
        int row = 0;
        int col = 0;
        boolean invalid = true;
        while (invalid) {
            row = random.nextInt(3) + 1;
            col = random.nextInt(3) + 1;
            if (board[col - 1][row - 1] == ' ') {
                invalid = false;
            }
        }
        return row + " " + col;
    }
}

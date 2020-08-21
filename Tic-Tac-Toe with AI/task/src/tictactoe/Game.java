package tictactoe;

public class Game {

    public static char turn(char[][] board) {
        int countX = 0;
        int countO = 0;
        for (int row = 2; row >= 0; row--) {
            for (int col = 0; col <= 2; col++) {
                if (board[row][col] == 'X') {
                    countX++;
                }
                if (board[row][col] == 'O') {
                    countO++;
                }
            }
        }
        return countX > countO ? 'O' : 'X';
    }

    public static String checkGame(char[][] board) {
        int countDiaX = 0;
        int countDiaO = 0;
        boolean empty = false;
        String result = "Draw";
        for (int row = 2; row >= 0; row--) {
            int countLineO = 0;
            int countLineX = 0;
            if (board[row][row] == 'X') {
                countDiaX++;
                if (countDiaX == 3) {
                    result = "X wins";
                    break;
                }
            }
            if (board[row][row] == 'O') {
                countDiaO++;
                if (countDiaO == 3) {
                    result = "O wins";
                    break;
                }
            }
            if (board[2][0] == 'X' && board[1][1] == 'X' && board[0][2] == 'X') {
                result = "X wins";

                break;
            }
            if (board[0][row] == 'X' && board[1][row] == 'X' && board[2][row] == 'X') {
                result = "X wins";

                break;
            }
            if (board[0][row] == 'O' && board[1][row] == 'O' && board[2][row] == 'O') {
                result = "O wins";

                break;
            }
            for (int col = 0; col <= 2; col++) {
                if (board[row][col] == 'X') {
                    countLineX++;
                    if (countLineX == 3) {
                        result = "X wins";

                        break;
                    }
                } else {
                    countLineX = 0;
                }

                if (board[row][col] == 'O') {
                    countLineO++;
                    if (countLineO == 3) {
                        result = "O wins";

                        break;
                    }
                } else {
                    countLineO = 0;
                }
                if (board[row][col] == ' ') {
                    empty = true;
                }

            }
        }
        if (result.equals("Draw") && empty) {
            result = "Game not finished";
        }
        return result;
    }

    public static void play(char[][] board, Player player1, Player player2) {
        int row = 0;
        int col = 0;
        String coordinates;

        boolean inValid = true;

        while (inValid) {
            if (turn(board) == 'X') {
                coordinates = player1.makeMove(board);

            } else {

                coordinates = player2.makeMove(board);
            }
            try {
                row = getRow(coordinates);
                col = getCol(coordinates);
            } catch (NumberFormatException e) {

                row = 50;
                col = 50;
            }
            inValid = checkPlay(board, row, col);
        }
        board[col][row] = turn(board);
        //printBoard(board);
        if (!checkGame(board).equals("Game not finished")) {
            checkGame(board);
        }

    }

    public static int getRow(String coordinates) {
        return Integer.parseInt(String.valueOf(coordinates.charAt(0))) - 1;
    }

    public static int getCol(String coordinates) {
        int i;
        try {
            i = Integer.parseInt(String.valueOf(coordinates.charAt(2))) - 1;
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("You must type both column and row");
            return 40;
        }
        return i;
    }


    public static boolean checkPlay(char[][] board, int row, int col) {
        boolean inValid = true;

        if (row >= 0 && row <= 2 && col >= 0 && col <= 2) {
            if (board[col][row] != ' ') {
                System.out.println("This cell is occupied! Choose another one!");
                inValid = true;
            } else {

                inValid = false;
            }
        }
        if (row == 50 && col == 50) {
            System.out.println("You should enter numbers!");
            return true;
        }

        if (row < 0 || row > 2 || col < 0 || col > 2) {
            System.out.println("Coordinates should be from 1 to 3!");
            return true;
        }

        return inValid;
    }


    public void startGame(String play1, String play2) {
        Board board = new Board();
        Player player1;
        Player player2;

        if ("user".equals(play1)) {
            player1 = new Human('X');
        } else if ("easy".equals(play1)) {
            player1 = new Easy('X');
        } else if ("medium".equals(play1)) {
            player1 = new Medium('X');
        } else {
            player1 = new Hard('X');
        }
        if ("user".equals(play2)) {
            player2 = new Human('O');
        } else if ("easy".equals(play2)) {
            player2 = new Easy('O');
        } else if ("medium".equals(play2)) {
            player2 = new Medium('O');
        } else {
            player2 = new Hard('O');
        }

        board.fillBoard("         ");
        boolean game = true;
        board.printBoard();
        while (game) {
            play(board.getBoard(), player1, player2);
            if (!checkGame(board.getBoard()).equals("Game not finished")) {
                board.printBoard();
                System.out.println(checkGame(board.getBoard()));
                game = false;
            } else {
                board.printBoard();
            }
        }
    }
}

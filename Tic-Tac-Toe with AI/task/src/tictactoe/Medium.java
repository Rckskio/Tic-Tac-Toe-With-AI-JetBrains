package tictactoe;

import java.util.Random;

public class Medium extends Player {
    static String coordinate;
    char character;
    char opponent;

    public Medium(char character) {
        this.character = character;
        if (this.character == 'X') {
            this.opponent = 'O';
        } else {
            this.opponent = 'X';
        }
    }

    @Override
    public String makeMove(char[][] board) {
        System.out.println("Making move level \"medium\"");
        coordinate = mediumPlay(board);
        return coordinate;
    }

    public static String mediumPlayRandom(char[][] board) {
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

    // It was mediumPlay
    // public static String mediumPlay(char[][] board) {
    //     Random random = new Random();
    //     int row = 0;
    //     int col = 0;
    //     boolean invalid = true;
    //     while (invalid) {
    //         row = random.nextInt(3) + 1;
    //         col = random.nextInt(3) + 1;
    //         if (board[col - 1][row - 1] == ' ') {
    //             invalid = false;
    //         }
    //     }
    //     return row + " " + col;
    // }

    // It was checkWillWin
    public String mediumPlay(char[][] board) {
        if (!"".equals(checkRowsWin(board, character))) {
            // System.out.println("win row " + checkRowsWin(board, character));
            return checkRowsWin(board, character);
        }
        if (!"".equals(checkRowsLose(board, opponent))) {
            //System.out.println("lose row" + checkRowsWin(board, opponent));
            return checkRowsLose(board, opponent);
        }
        if (!"".equals(checkColWin(board, character))) {
            //System.out.println("win col" + checkColWin(board, character));
            return checkColWin(board, character);
        }
        if (!"".equals(checkDiaWin(board, character))) {
            //System.out.println("win dia" + checkDiaWin(board, character));
            return checkDiaWin(board, character);
        }
        if (!"".equals(checkColLose(board, opponent))) {
            //System.out.println("lose col" + checkColLose(board, opponent));
            return checkColLose(board, opponent);
        }
        if (!"".equals(checkDiaLose(board, opponent))) {
            ///System.out.println("Lose dia" + checkDiaLose(board, opponent));
            return checkDiaLose(board, opponent);
        }

        return mediumPlayRandom(board);
    }

    // public String checkWillWin(char[][] board) {
    //     if(!"".equals(checkRowsWin(board, character))) {
    //         return checkRowsWin(board, character);
    //     }
    //     if(!"".equals(checkColWin(board, character))) {
    //         return checkColWin(board, character);
    //     }
    //     if(!"".equals(checkDiaWin(board, character))) {
    //         return checkDiaWin(board, character);
    //     }
    //     if(!"".equals(checkRowsLose(board, opponent))) {
    //         return checkRowsLose(board, opponent);
    //     }
    //     if(!"".equals(checkColLose(board, opponent))) {
    //         return checkColLose(board, opponent);
    //     }
    //     if(!"".equals(checkDiaLose(board, opponent))) {
    //         return checkDiaLose(board, opponent);
    //     }
    //
    //     return "";
    // }

    public String checkRowsWin(char[][] board, char character) {
        int countCharacter;
        String emptyXY = "";
        boolean empty;
        for (int row = 0; row <= 2; row++) {
            countCharacter = 0;
            empty = false;

            for (int col = 0; col <= 2; col++) {
                if (board[row][col] == ' ') {
                    empty = true;
                    emptyXY = (col + 1) + " " + (row + 1);
                }
                if (board[row][col] == character) {
                    countCharacter++;
                }
                if (countCharacter == 2 && empty) {
                    return emptyXY;
                }
            }
        }
        return "";
    }

    public String checkRowsLose(char[][] board, char character) {
        int countCharacter;
        String emptyXY = "";
        boolean empty;
        for (int row = 0; row <= 2; row++) {
            countCharacter = 0;
            empty = false;

            for (int col = 0; col <= 2; col++) {
                if (board[row][col] == ' ') {
                    empty = true;
                    emptyXY = (col + 1) + " " + (row + 1);
                }
                if (board[row][col] == character) {
                    countCharacter++;
                }
                if (countCharacter == 2 && empty) {
                    return emptyXY;
                }
            }
        }
        return "";
    }

    public String checkColWin(char[][] board, char character) {
        int countCharacter;
        String emptyXY = "";
        boolean empty;
        for (int col = 0; col <= 2; col++) {
            countCharacter = 0;
            empty = false;
            if (board[0][col] == ' ') {
                empty = true;
                emptyXY = (col + 1) + " " + 1;
            }
            if (board[1][col] == ' ') {
                empty = true;
                emptyXY = (col + 1) + " " + 2;
            }
            if (board[2][col] == ' ') {
                empty = true;
                emptyXY = (col + 1) + " " + 3;
            }
            if (board[0][col] == character) {
                countCharacter++;
            }
            if (board[1][col] == character) {
                countCharacter++;
            }
            if (board[2][col] == character) {
                countCharacter++;
            }
            if (countCharacter == 2 && empty) {
                return emptyXY;
            }

        }
        return "";
    }

    public String checkColLose(char[][] board, char character) {
        int countCharacter;
        String emptyXY = "";
        boolean empty;
        for (int col = 0; col <= 2; col++) {
            countCharacter = 0;
            empty = false;
            if (board[0][col] == ' ') {
                empty = true;
                emptyXY = (col + 1) + " " + 1;
            }
            if (board[1][col] == ' ') {
                empty = true;
                emptyXY = (col + 1) + " " + 2;
            }
            if (board[2][col] == ' ') {
                empty = true;
                emptyXY = (col + 1) + " " + 3;
            }
            if (board[0][col] == character) {
                countCharacter++;
            }
            if (board[1][col] == character) {
                countCharacter++;
            }
            if (board[2][col] == character) {
                countCharacter++;
            }
            if (countCharacter == 2 && empty) {
                return emptyXY;
            }

        }
        return "";
    }

    public String checkDiaWin(char[][] board, char character) {
        int countCharacter = 0;
        String emptyXY = "";
        boolean empty = false;
        if (board[2][0] == ' ') {
            empty = true;
            emptyXY = 1 + " " + 3;
        }
        if (board[1][1] == ' ') {
            empty = true;
            emptyXY = 2 + " " + 2;
        }
        if (board[0][2] == ' ') {
            empty = true;
            emptyXY = 3 + " " + 1;
        }
        if (board[2][0] == character) {
            countCharacter++;
        }
        if (board[1][1] == character) {
            countCharacter++;
        }
        if (board[0][2] == character) {
            countCharacter++;
        }

        if (countCharacter == 2 && empty) {
            return emptyXY;
        }

        countCharacter = 0;
        emptyXY = "";
        empty = false;
        if (board[2][2] == ' ') {
            empty = true;
            emptyXY = 3 + " " + 3;
        }
        if (board[1][1] == ' ') {
            empty = true;
            emptyXY = 2 + " " + 2;
        }
        if (board[0][0] == ' ') {
            empty = true;
            emptyXY = 1 + " " + 1;
        }
        if (board[2][2] == character) {
            countCharacter++;
        }
        if (board[1][1] == character) {
            countCharacter++;
        }
        if (board[0][0] == character) {
            countCharacter++;
        }

        if (countCharacter == 2 && empty) {
            return emptyXY;
        }

        return "";
    }

    public String checkDiaLose(char[][] board, char character) {
        int countCharacter = 0;
        String emptyXY = "";
        boolean empty = false;
        if (board[2][0] == ' ') {
            empty = true;
            emptyXY = 1 + " " + 3;
        }
        if (board[1][1] == ' ') {
            empty = true;
            emptyXY = 2 + " " + 2;
        }
        if (board[0][2] == ' ') {
            empty = true;
            emptyXY = 3 + " " + 1;
        }
        if (board[2][0] == character) {
            countCharacter++;
        }
        if (board[1][1] == character) {
            countCharacter++;
        }
        if (board[0][2] == character) {
            countCharacter++;
        }

        if (countCharacter == 2 && empty) {
            //System.out.println("return first ifs");
            return emptyXY;
        }

        countCharacter = 0;
        emptyXY = "";
        empty = false;
        if (board[2][2] == ' ') {
            empty = true;
            emptyXY = 3 + " " + 3;
        }
        if (board[1][1] == ' ') {
            empty = true;
            emptyXY = 2 + " " + 2;
        }
        if (board[0][0] == ' ') {
            empty = true;
            emptyXY = 1 + " " + 1;
        }
        if (board[2][2] == character) {
            countCharacter++;
        }
        if (board[1][1] == character) {
            countCharacter++;
        }
        if (board[0][0] == character) {
            countCharacter++;
        }

        if (countCharacter == 2 && empty) {
            //System.out.println("return second ifs");

            return emptyXY;
        }

        return "";
    }
}

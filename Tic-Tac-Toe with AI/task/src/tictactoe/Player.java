package tictactoe;

import java.util.Scanner;

public class Player {
    static String coordinate;

    public String makeMove(char[][] board) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter coordinates: ");
        coordinate = scanner.nextLine();
        return coordinate;
    }
}

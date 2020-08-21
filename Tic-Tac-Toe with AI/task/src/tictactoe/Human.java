package tictactoe;

import java.util.Scanner;

public class Human extends Player {
    static String coordinate;
    char character;

    public Human(char character) {
        this.character = character;
    }

    @Override
    public String makeMove(char[][] board) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter coordinates: ");
        coordinate = scanner.nextLine();
        return coordinate;
    }
}

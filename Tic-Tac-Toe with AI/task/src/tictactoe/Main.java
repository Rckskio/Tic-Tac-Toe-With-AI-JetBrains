package tictactoe;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Game game = new Game();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Input command: ");
            String[] command = scanner.nextLine().split(" ");
            if ("exit".equals(command[0])) {
                break;
            }
            try {
                if ("start".equals(command[0]) && command[1] != null && command[2] != null) {
                    System.out.println("Game started!");
                    game.startGame(command[1], command[2]);
                } else {
                    System.out.println("Bad parameters!");
                }

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Bad parameters!");
            }

        } while (true);
    }
}
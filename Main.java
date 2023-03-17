import java.util.Scanner;

public class TicTacToeTester
{
    public static void main(String[] args)
    {
        TicTacToe game = new TicTacToe();

        // setup
        int gameType = 7;
        while (gameType != 1 && gameType != 0) {
            gameType = Integer.parseInt(prompt("0: Player vs Player\n1: Player vs Bot\n\nenter game type: "));
        }

        for (int i = 0; i < 9; i++) {
            if (game.checkWin()) continue;

            if (gameType == 0) twoPlayerGame(game);
            else onePlayerGame(game);
            
        }

        clear();
        game.printBoard();
        System.out.println();

        if (game.checkWin()) {
            System.out.println("Game over!\n");
            System.out.println((game.getTurn() % 2 == 1 ? "X" : "O") + " won.");
        } else System.out.println("It's a tie! :(");

    }

    static void twoPlayerGame(TicTacToe game) {
        clear();
        game.printBoard();
        System.out.println();
        
        int row = 69;
        int col = 69;
        while (!game.pickLocation(row, col)) {
            System.out.println("⚠ this program will cry if you don't enter an integer between 0 and 2 ⚠\n");
            System.out.println("It's " + (game.getTurn() % 2 == 0 ? "X" : "O") + "'s turn");
            System.out.println("make a move:");
            row = Integer.parseInt(prompt("row: "));
            col = Integer.parseInt(prompt("col: "));
        }
        game.takeTurn(row, col);
    }

    static void onePlayerGame(TicTacToe game) { }

    static String prompt(String text) {
        Scanner input = new Scanner(System.in);
        System.out.print(text);
        return input.nextLine();
    }

    static void clear() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
}

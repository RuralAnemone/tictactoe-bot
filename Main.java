import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        TicTacToe game = new TicTacToe();

        // setup
        int gameType = 3;
        while (gameType <=1 && gameType >= 0) {
            gameType = Integer.parseInt(prompt("0: Player against Player\n1: Player against Bot\n\nenter game type: "));
        }
        
        

        for (int i = 0; i < 9; i++) {
            twoPlayerGame(game);
        }
    }

    static void twoPlayerGame(TicTacToe game) {
        clear();
        game.printBoard();
        System.out.println();
        
        int row = 69;
        int col = 69;
        while (!game.pickLocation(row, col)) {
            System.out.println("⚠ this program will cry if you don't enter an integer between 0 and 2 ⚠\n");
            System.out.println("make a move:");
            row = Integer.parseInt(prompt("row: "));
            col = Integer.parseInt(prompt("col: "));
        }
        game.takeTurn(row, col);
    }

    static String prompt(String text) {
        Scanner input = new Scanner(System.in);
        System.out.print(text);
        return input.nextLine();
    }

    static void clear() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
}

// // you guess whether I wrote this first part or whether it was gpt-3

public class Zobrist {

    // private long[][] zobristTable;
    private int size;
    private String[][] board;
    private String[] digits = {
        "0",
        "1",
        "2",
        "3",
        "4",
        "5",
        "6",
        "7",
        "8",
        "9",
        "a",
        "b",
        "c",
        "d",
        "e",
        "f",
        "g",
        "h",
        "i",
        "j",
        "k",
        "l",
        "m",
        "n",
        "o",
        "p",
        "q"
    };

    // constructor
    /* public Zobrist(TicTacToe board) {
        this.size = board.getBoard().length;
        zobristTable = new long[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                zobristTable[i][j] = generateRandomNumber();
            }
        }
    } */
    public Zobrist(TicTacToe board) {
        this.board = board.getBoard(); // hehe wow that's fun to read :)
    }
    
    // generate random numbers for zobrist table
    private long generateRandomNumber() {
        return (long) (Math.random() * Long.MAX_VALUE);
    }

    // generate a hash value for the tic-tac-toe board
    public long zHash(TicTacToe board) {
        long hash = 0;
        String[][] boardState = board.getBoard();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (boardState[i][j] == "X") {
                    hash ^= zobristTable[i][j];
                } else if (boardState[i][j] == "O") {
                    hash ^= zobristTable[i][j];
                }
            }
        }
        return hash;
    }

    // ok so the board hash is a ternary number (troll emoji) where 0 is empty space, 1 is X, and 2 is O
    // ... and then it's condensed into nonary and then trinonary
    public String /* for minimal data loss??? */ hash(TicTacToe board) { //you know, I should really make my own data type for this :)
        String hash = "";
        for (String[] e : board) {
            for (String f : e) {
                if (f.equals("-")) hash += "0";
                else if (f.equals("X")) hash += "1";
                else if (f.equals("O")) hash += "2";
                else throw new Bingus();
            }
        }
        return condense(hash);
    }

    public String condense(String ternaryString) {
        // to trinonary (base-27, [0-9a-q])!!
        
    }

}
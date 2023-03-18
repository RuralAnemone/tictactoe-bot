// you guess whether I wrote this or whether it was gpt-3

public class Zobrist {

    private long[][] zobristTable;
    private static final int SIZE = 3;

    // constructor
    public Zobrist() {
        zobristTable = new long[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                zobristTable[i][j] = generateRandomNumber();
            }
        }
    }
    
    // generate random numbers for zobrist table
    private long generateRandomNumber() {
        return (long) (Math.random() * Long.MAX_VALUE);
    }

    // generate a hash value for the tic-tac-toe board
    public long hash(TicTacToe board) {
        long hash = 0;
        String[][] boardState = board.getBoard();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (boardState[i][j] == "X") {
                    hash ^= zobristTable[i][j];
                } else if (boardState[i][j] == "O") {
                    hash ^= zobristTable[i][j];
                }
            }
        }
        return hash;
    }

}
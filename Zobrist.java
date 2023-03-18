// you guess whether I wrote this or whether it was gpt-3

public class Zobrist {

    private long[][] zobristTable;
    private int size;

    // constructor
    public Zobrist(TicTacToe board) {
        this.size = board.getBoard().length;
        zobristTable = new long[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
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

}
public class TicTacToe
{
    //copy over your constructor from the Tic Tac Toe Board activity in the previous lesson!
    private int turn;
    private String[][] board = {
        {"-", "-", "-"},
        {"-", "-", "-"},
        {"-", "-", "-"}
    };

    public TicTacToe() { };
    
    //this method returns the current turn
    public int getTurn()
    {
        return this.turn;
    }
    
    /*This method prints out the board array on to the console
    */
    public void printBoard()
    {
        System.out.println("  0 1 2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (String e : board[i]) {
                System.out.print(e + " ");
            }
            System.out.println();
        }
    }
    
    //This method returns true if space row, col is a valid space
    public boolean pickLocation(int row, int col)
    {
        if (!((row >= 0 && row <= 2) && (col >= 0 && col <= 2))) return false;
        if (!(board[row][col].equals("-"))) return false;
        return true;
    }
    
    //This method places an X or O at location row,col based on the int turn
    public void takeTurn(int row, int col)
    {
        String move = turn % 2 == 0 ? "X" : "O";
        board[row][col] = move;
        turn++;
    }
    
    //This method returns a boolean that returns true if a row has three X or O's in a row
    public boolean checkRow()
    {
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == board[i][1] && board [i][1] == board[i][2]) && !board[i][0].equals("-")) return true;
        }
        return false;
    }
    
     //This method returns a boolean that returns true if a col has three X or O's
    public boolean checkCol()
    {
        for (int i = 0; i < 3; i++) {
            if ((board[0][i] == board[1][i] && board [1][i] == board[2][i]) && !board[0][i].equals("-")) return true;
        }
        return false;
    }
    
     //This method returns a boolean that returns true if either diagonal has three X or O's
    public boolean checkDiag()
    {
        if ((board[0][0] == board[1][1] && board[1][1] == board[2][2]) && !board[0][0].equals("-")) return true;
        if ((board[0][2] == board[1][1] && board[1][1] == board[2][0]) && !board[1][1].equals("-")) return true;
        return false;
    }
    
    //This method returns a boolean that checks if someone has won the game
    public boolean checkWin()
    {
        return checkRow() || checkCol() || checkDiag();
    }
}

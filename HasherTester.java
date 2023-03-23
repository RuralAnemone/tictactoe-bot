public class HasherTester {
    
	static TicTacToe board = new TicTacToe();
    
	public static void main(String[] args) {
		moves();

		System.out.println(Hasher.hash(board));

	}

	static void moves() {
		board.takeTurn(2,2);
		board.takeTurn(1,1);
		board.takeTurn(0,1);
		board.takeTurn(1,2);
		board.takeTurn(0,2);
		board.takeTurn(0,0);
		board.takeTurn(1,0);
		board.takeTurn(2,0);
		board.takeTurn(2,1);
	}
}
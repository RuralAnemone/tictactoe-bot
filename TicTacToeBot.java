public class TicTacToeBot {

	private TicTacToe board;
	private String hash;

	public TicTacToeBot(TicTacToe board) {
		this.board = board;
		this.hash = Hasher.hash(board);
	}

	public int[] move() {
		// welcome to the tenth circle of hell

	}
}
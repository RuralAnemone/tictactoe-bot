public class HasherTester {

	static TicTacToe board = new TicTacToe();
	static int[][] moves = {

	}

	public static void main(String[] args) {
		playMoves();

		System.out.println(Hasher.hash(board));

	}

	static void playMoves() {
		for (int[] e : moves) {
			board.takeTurn(e[0], e[1]);
		}
	}
}
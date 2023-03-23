public class TicTacToeBot {

	private TicTacToe board;
	private String hash;

	public TicTacToeBot(TicTacToe board) {
		this.board = board;
		this.hash = Hasher.hash(board);
	}

	public int[] move() {
		// welcome to the tenth circle of hell

        int[] out = {420,69};
		switch(hash) {
		 // case "hash": return {row, col};
			case "0":
				out[0] = 0;
				out[1] = 0;
				break;

			// default: throw new Bingus();
		}
		
		return out;

	}
}
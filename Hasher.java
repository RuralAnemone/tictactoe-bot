public class Zobrist {

	// private long[][] zobristTable;
	private int size;
	private String[][] board;

	// constructor
	public Hasher(TicTacToe board) {
		this.board = board.getBoard(); // hehe wow that's fun to read :)
		// board board board board board board board board board board board
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
		return Integer.toString(Integer.parseInt(ternaryString, 3), 27);
	}

}
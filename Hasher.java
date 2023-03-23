public class Hasher {

	// ok so the board hash is a ternary number (troll emoji) where 0 is empty space, 1 is X, and 2 is O
	// ... and then it's condensed into nonary and then trinonary
	public static String /* for minimal data loss??? */ hash(TicTacToe board) { //you know, I should really make my own data type for this :)
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

	public static String condense(String ternaryString) {
		// to trinonary (base-27, [0-9a-q])!!
		return Integer.toString(Integer.parseInt(ternaryString, 3), 27);
	}

}
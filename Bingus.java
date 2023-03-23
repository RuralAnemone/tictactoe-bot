public class Bingus extends Exception {
	public Bingus() { super(); }
	public Bingus(String message) { super(message); }
    public Bingus(String message, Throwable cause) { super(message, cause); }
    public Bingus(Throwable cause) { super(cause); }
}
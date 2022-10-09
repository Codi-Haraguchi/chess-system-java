package boardgame;

public class Board {
	
	private int rows;
	private int columms;
	private Piece[][] pieces;
	public Board(int rows, int columms, Piece[][] pieces) {
		this.rows = rows;
		this.columms = columms;
		pieces = new Piece[rows][columms];
	}
	

}

package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null; // por padrão o java ja coloca a a posição como nula
	}

	protected Board getBoard() {
		return board;
	}

	
	
	
	
	

}

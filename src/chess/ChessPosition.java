package chess;

import boardgame.Position;

public class ChessPosition {
	
	private char column;
	private int row;
	
	public ChessPosition(char column, int row) {
<<<<<<< HEAD
		if (column < 'a' || column > 'h' || row < 1 || row > 8) {
			throw new ChessException("Error instantiating ChessPosition. Valid values are from a1 to h8.");
=======
		if(column < 'a' || column > 'h' || row < 1 || row > 8) {
			 throw new ChessException("Error instantiating ChessPosition. Valid values are from a1 to h8.");
>>>>>>> efd22f4f86eecda2613fa2128e3e46bbf3468f99
		}
		this.column = column;
		this.row = row;
	}

	public char getColumn() {
		return column;
	}

	public int getRow() {
		return row;
	}
<<<<<<< HEAD

=======
	
>>>>>>> efd22f4f86eecda2613fa2128e3e46bbf3468f99
	protected Position toPosition() {
		return new Position(8 - row, column - 'a');
	}
	
<<<<<<< HEAD
	protected static ChessPosition fromPosition(Position position) {
=======
	protected static ChessPosition fromPosition (Position position) {
>>>>>>> efd22f4f86eecda2613fa2128e3e46bbf3468f99
		return new ChessPosition((char)('a' - position.getColumn()), 8 - position.getRow());
	}
	
	@Override
	public String toString() {
		return "" + column + row;
	}
<<<<<<< HEAD
=======
	

>>>>>>> efd22f4f86eecda2613fa2128e3e46bbf3468f99
}

package chessGame;

public class Case {

	Piece piece = null;
	
	public Case() {
		
	}
	
	public Case(Piece piece) {
		this.piece = piece;
	}
	
	public boolean isEmpty() {
		return piece == null;
	}
	
	public void setPiece(Piece piece) {
		this.piece = piece;
	}
	
	public Piece getPiece() {
		return piece;
	}
	
	@Override
	public String toString() {
		if(isEmpty())
			return "  ";
		else
			return piece.toString();
	}
}
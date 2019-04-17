//Piece est une classe abstraite

public abstract class Piece {
	private String positionPiece;
	private String couleur;
	
	public Piece() {
		this.positionPiece = "";
		this.couleur="";
	}
	
	public void déplacerPiece() {
		
	}

	public String getPositionPiece() {
		return positionPiece;
	}

	public void setPositionPiece(String nouvPosition) {
		this.positionPiece = nouvPosition;
	}
	
	

}
//Piece est une classe abstraite

public abstract class Piece {
	private int lig ;
	private char col ;
	private String couleur;
	
	public Piece() {
		this.lig = 0;
		this.col="";
		this.couleur="";
	}
	
	public Piece (int ligne, char colonne, String coul)
	{
		this.lig = ligne;
		this.col = colonne;
		this.couleur = coul;
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
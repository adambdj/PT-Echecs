//La Reine se déplace d'un nombre quelconque de cases verticalement, horizontalement et en diagonale sans pouvoir sauter une pièce.

public class Reine extends Piece
{
	private String forme;

	public Reine()
	{
		super();
		if(this.getCouleur() == 0)		// si la pièce est noire
			this.forme = "D";
		else							// si la pièce est blanche
			this.forme = "D";
	}

	public Reine(int ligne, int colonne, int coul)
	{
		super(ligne,colonne,coul);
		if(this.getCouleur() == 0)
			this.forme = "D";			// si la pièce est noire
		else
			this.forme = "D";			// si la pièce est blanche
	}

	public String getForme()
	{
		return this.forme;
	}

	public void deplacerPiece(Echiquier e,int i, int j)
	{
	}


	//Si la piece est une Reine
	//Pareil que le roi et si la case désigné = caseVide : True
	public boolean verifDeplacement(Echiquier e)
	{
		if(this.mouvementPossible(e))
			return true;
		return false ;	
	}
	
	public boolean mouvementPossible(Echiquier e) {
		int x =this.getPosX();
		int y = this.getPosY();
		
		if(super.mouvementDiagonal(e, x, y) )
			return true;
		else if (super.mouvementHorizontal(e, x, y) )
			return true;
		else if(super.mouvementVertical(e, x, y))
			return true;
			
		return false;
	}
	public String toString()
	{
		return super.toString() + " et la piece a la forme " + this.forme;
	}

}

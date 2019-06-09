//Le Roi se déplace d'une seule case dans toutes les directions et de deux cases lors du roque.

public class Roi  extends Piece
{

	private String forme;
	
	public Roi()
	{
		super();
		if(this.getCouleur() == 0)
			this.forme = "R";				// si la pièce est noire
		else
			this.forme = "R";				// si la pièce est blanche
	}

	public Roi(int ligne, int colonne, int coul)
	{
		super(ligne,colonne,coul);
		if(this.getCouleur() == 0)
			this.forme = "R";				// si la pièce est noire
		else
			this.forme = "R";				// si la pièce est blanche
	}

	public String getForme()
	{
		return this.forme;
	}

	public void deplacerPiece()
	{
	}

	/* Msg de Soumeya pour Salim
	*En faisant le déplacement de la Reine 
	* je suis passé par le déplacement du Roi du coup 
	*je te met la methode ici il faut juste faire déplacement mtn
	*/
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

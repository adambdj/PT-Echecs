//Le Roi se déplace d'une seule case dans toutes les directions et de deux cases lors du roque.

public class Roi  extends Piece
{

	private String forme;

	public Roi()
	{
		super();
		if(this.getCouleur() == 0)
		{
			this.forme = "R";				// si la pièce est noire
		}
		else
		{
			this.forme = "R";				// si la pièce est blanche
		}
	}

	public Roi(int ligne, int colonne, int coul)
	{
		super(ligne,colonne,coul);
		if(this.getCouleur() == 0)
		{
			this.forme = "R";				// si la pièce est noire
		}
		else
		{
			this.forme = "R";				// si la pièce est blanche
		}
	}

	public String getForme()
	{
		return this.forme;
	}

	public void deplacerPiece()
	{
	}

	public String toString()
	{
		return super.toString() + " et la piece a la forme " + this.forme;
	}

}

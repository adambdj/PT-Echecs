//La Reine se déplace d'un nombre quelconque de cases verticalement, horizontalement et en diagonale sans pouvoir sauter une pièce.

public class Reine extends Piece
{
	private String forme;

	public Reine()
	{
		super();
		if(this.getCouleur() == 0)		// si la pièce est noire
		{
			this.forme = "D";
		}
		else							// si la pièce est blanche
		{
			this.forme = "D";
		}
	}

	public Reine(int ligne, int colonne, int coul)
	{
		super(ligne,colonne,coul);
		if(this.getCouleur() == 0)
		{
			this.forme = "D";			// si la pièce est noire
		}
		else
		{
			this.forme = "D";			// si la pièce est blanche
		}
	}

	public String getForme()
	{
		return this.forme;
	}

	public void deplacerPiece()
	{
	}


	//Si la piece est une Reine
	//Pareil que le roi et si la case désigné = caseVide : True
	public boolean verifDeplacement(Echiquier e)
	{
		return true;		// JUSTE POUR LA COMPILATION
	}
	public String toString()
	{
		return super.toString() + " et la piece a la forme " + this.forme;
	}

}

//La Reine se déplace d'un nombre quelconque de cases verticalement, horizontalement et en diagonale sans pouvoir sauter une pièce.

public class Reine extends Piece
{
	private String forme;

	public Reine(int ligne, char colonne, int coul)
	{
		super(ligne,colonne,coul);
		this.forme="";
	}

	public void deplacerPiece()
	{
	}


	//Si la piece est une Reine
	//Pareil que le roi et si la case désigné = caseVide : True
	public boolean verifDeplacement(Echiquier e)
	{

	}

}

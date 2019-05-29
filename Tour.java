//La tour se déplace d'un nombre quelconque de cases horizontalement
//	ou verticalement et peut sauter seulement par-dessus le Roi lors du roque.

public class Tour extends Piece
{
	private String forme;

	public Tour(int ligne, int colonne, int coul)
	{
		super(ligne,colonne,coul);
		this.forme="T";
	}

	public void deplacerPiece()
	{
	}

	//Si la piece est une Tour
	//Si il n'y a personne devant moi ou a coté et si la case désigné est une caseVide : True
	public boolean verifDeplacement(Piece p)
	{
		return true;		// JUSTE POUR LA COMPILATION

	}

}

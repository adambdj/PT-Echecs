//La tour se déplace d'un nombre quelconque de cases horizontalement 
//	ou verticalement et peut sauter seulement par-dessus le Roi lors du roque.
public class Tour extends Piece
{
	private String forme;

	public Tour(int ligne, char colonne, int coul)
	{
		super(ligne,colonne,coul);
		this.forme="";
	}

	public void déplacerPiece()
	{	
	}

	//Si la piece est une tour
	//Si il n'y a personne devant moi ou a coté et si la case désigné est une caseVide : True 
	public boolean verifDeplacement(Piece p)
	{
	}

}
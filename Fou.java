public class Fou extends Piece
{
	private String forme;

	public Fou(int ligne, char colonne, int coul)
	{
		super(ligne,colonne,coul);
		this.forme="";
	}
	
	
	public void déplacerPiece()
	{	
	}

	//Si la piece est un fou
	//Si il n'y a personne dur ma diagonale et si la case désigné et une caseVide : True
	public boolean verifDeplacement(Echiquier e)
	{
		
	}
		
}

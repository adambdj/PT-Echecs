//Le Fou se déplace d'un nombre quelconque de cases en diagonale sans pouvoir sauter une pièce.
//	Il y a un fou sur cases blanches (appelé « blanc », peu importe la couleur des pièces) et un fou sur cases noires (appelé « noir »),
//		ce nom leur vient de leur case de départ, et du fait que leur déplacement ne peut se faire que sur des cases de cette couleur.

public class Fou extends Piece
{
	private String forme;

	public Fou()
	{
		super();
		this.forme = "F";
	}

	public Fou(int ligne, char colonne, int coul)
	{
		super(ligne,colonne,coul);
		this.forme="";
	}

	public String getForme()
	{
		return this.forme;
	}

	public String toString()
	{
		return super.toString() + " et la piece a la forme " + this.forme;
	}
}
	public void deplacerPiece()
	{
	}

	//Si la piece est un fou
	//Si il n'y a personne dur ma diagonale et si la case désigné et une caseVide : True
	public boolean verifDeplacement(Echiquier e)
	{

	}

}

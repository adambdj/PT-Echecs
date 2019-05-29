//Le Roi se déplace d'une seule case dans toutes les directions et de deux cases lors du roque.

public class Roi  extends Piece
{

	private String forme;

	public Roi(int ligne, int colonne, int coul)
	{
		super(ligne,colonne,coul);
		this.forme="Roi";
	}

	public void deplacerPiece()
	{
	}

}

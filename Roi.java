//Le Roi se déplace d'une seule case dans toutes les directions et de deux cases lors du roque.

public class Roi  extends Piece
{

	private String forme;

	public Roi()
	{
		super();
		this.forme = "Ro";
	}

	public Roi(int ligne, int colonne, int coul)
	{
		super(ligne,colonne,coul);
		this.forme="Roi";
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

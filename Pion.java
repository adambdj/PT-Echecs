public class Pion  extends Piece
{
	private String forme;
	
	public Pion()
	{
		super();
		this.forme="";
	}
	
	public Pion(int ligne, char colonne, String coul)
	{
		super(ligne,colonne,coul);
		this.forme="";
	}
	
	public void déplacerPiece()
	{
	}
	
}

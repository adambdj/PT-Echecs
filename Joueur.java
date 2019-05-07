public class Joueur
{
	private String prénom;
	private int couleur;
	private ArrayList<Piece> tabPiece;

	public Joueur(String p, int c)
	{
		this.prénom=p;
		this.couleur=c;
	}


	//Les accesseurs
	public String getPrénom()
	{
		return prénom;
	}
	
	public void setPrénom(String prénom)
	{
		this.prénom = prénom;
	}
	
	public int getCouleur()
	{
		return couleur;
	}
	
	public void setCouleur(int couleur)
	{
		this.couleur = couleur;
	}
	
	public ArrayList<Piece> getTabPiece()
	{
		return tabPiece;
	}
	
	public void setTabPiece(ArrayList<Piece> tabPiece)
	{
		this.tabPiece = tabPiece;
	}

}

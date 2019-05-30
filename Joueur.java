import java.util.ArrayList;


public class Joueur
{
	private String prenom;
	private int couleur;
	private ArrayList<Piece> tabPiece;

	public Joueur(String p, int c)
	{
		this.prenom=p;
		this.couleur=c;
	}


	//Les accesseurs
	public String getPrenom()
	{
		return prenom;
	}
	
	public void setPrenom(String prenom)
	{
		this.prenom = prenom;
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

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

	public int convertion(char lettre) {
		if (lettre == 'A' )
			return 0;
		else if (lettre == 'B')
			return 1;
		else if (lettre == 'C')
			return 2;
		else if (lettre == 'D')
			return 3;
		else if (lettre == 'E')
			return 4;
		else if (lettre == 'F')
			return 5;
		else if (lettre == 'G')
			return 6;
		else 
			return 7;	
	}
	public Case getChoixCase(Echiquier e , int ligne, char colonne) {
		return e.getCase( ligne-1,this.convertion(colonne));
	}
	
	public Piece getChoixPiece(Echiquier e , int ligne, char colonne) {
		return e.getCase( ligne-1,this.convertion(colonne)).getPiece();
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

	public String coul() {
		String s ="";
		if(this.couleur == 1)
			s+="Blanche";
		else 
			s+="Noire";
		return s ;
	}
	
	public String toString() {
		return "Joueur "+this.getPrénom()+" posséde les pieces "+this.coul();
	}

}

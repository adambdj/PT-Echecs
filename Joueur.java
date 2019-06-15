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

	public Joueur(Joueur j)
	{
		this.prenom=new String(j.prenom);
		this.couleur=j.couleur;
	}
	
	/*Soumeya
	 * Pour alterner les joueurs, j'utilise une variable int tours que j'incrémenterais 
	 * a chaque tour. (tours = 1 au debut)
	 * Si tour paire alors c'est le joueurs qui joue en 2 (les pieces noires)
	 * Sinon impaire c'est le premier joueurs 
	 */
	public Joueur alternationJoueur(int tours, Joueur j1, Joueur j2) {
		if(tours%2 == 0)//Paire
			return j2;
		return j1;
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
		return "Joueur " + this.getPrenom() + " posséde les pièces " + this.coul();
	}

}

//Ce qu'on peux faire pendant une partie
//une partie est composé d'un échiquier
public class Partie
{
	private Echiquier terrain; //Une Partie est composé d'un Echequier
	private Joueur joueur1;
	private Joueur joueur2;

	
	public Partie()
	{
		this.terrain=new Echiquier();
	}

	public Partie(Joueur j1, Joueur j2)
	{
		this.terrain=new Echiquier();
		this.joueur1=j1;
		this.joueur2=j2;
		
	}
	
//--------------Soumeya
	/*Le jeu annonce un MAT lorsque le Roi est attaqué et qu’il n’y a aucune possibilité de le sauver.*/

	// public boolean verifMAT()
	// {
	// }

	/*	Le jeu annonce un PAT lorsque le joueur ne peut déplacer aucune pièces 
	 *	et que le roi n’est pas en attaque et ne peut se déplacer sans se mettre en échec .*/

	// public boolean verifPAT()
	// {
	// }
	
	public boolean verifDeplacement(Piece p)
	{
		return true;		// JUSTE POUR LA COMPILATION
	}

	
	public Joueur joueurEnCour(Partie p) {
		return joueur1;
	}
	
//-------------------


	public void lancerPartie()
	{
	}

	public void sauvegarderPartie()
	{
	}

	public void restaurerPartie()
	{
	}

	public void effacerTerrain()
	{
	}

	public void historique()
	{
	}

	public void tourDeJeu()
	{
	}

	public Echiquier getTerrain()
	{
		return terrain;
	}

	public void setTerrain(Echiquier nouvTerrain)
	{
		this.terrain = nouvTerrain;
	}

	
	public Joueur getJoueur1() {
		return this.joueur1;
	}
	
	public Joueur getJoueur2() {
		return this.joueur2;
	}
	
}
//Ce qu'on peux faire pendant une partie
//une partie est composé d'un echiquier
public class Partie
{
	private Echiquier terrain; //Une Partie est composé d'un Echequier
	private Joueur joueur1;
	private Joueur joueur2;

	
	public Partie()
	{
		this.terrain=new Echequier();
	}
	
//--------------Soumeya
	/*Le jeu annonce un MAT lorsque le Roi est attaqué et qu’il n’y a aucune possibilité de le sauver.*/
	public boolean verifMAT()
	{
	}

	/*	Le jeu annonce un PAT lorsque le joueur ne peut déplacer aucune pièces 
	 *	et que le roi n’est pas en attaque et ne peut se déplacer sans se mettre en échec .*/

	public boolean verifPAT()
	{
	}
	
	/*public boolean verifDeplacement(Piece p)
	{
		
	}*/
	
	
	/*	A FAIRE
	 * Il faut une fonction qui renvoie le joueur qui est entrain de jouer 
	 * Pour pouvoir utiliser la fonction positionInitialePion()
	 */
	
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

	public Echequier getTerrain()
	{
		return terrain;
	}

	public void setTerrain(Echequier nouvTerrain)
	{
		this.terrain = nouvTerrain;
	}
	
}

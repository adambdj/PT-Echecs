//Ce qu'on peux faire pendant une partie

public class Partie {
	private Echequier terrain; //Une Partie est composé d'un Echequier
	
	public Partie() {
		this.terrain=new Echequier();
	}
	
//--------------Soumeya
	/*Le jeu annonce un MAT lorsque le Roi est attaqué et qu’il n’y a aucune possibilité de le sauver.*/
	public boolean verifMAT(){

	}

	/*	Le jeu annonce un PAT lorsque le joueur ne peut déplacer aucune pièces 
	 *	et que le roi n’est pas en attaque et ne peut se déplacer sans se mettre en échec .*/

	public boolean verifPAT(){

	}
	public boolean verifDeplacement(Piece p) {
		boolean reponse = false;
		if(p instanceof Tour) //Si la piece est une tour
		{
			//Si il n'y a personne devant moi ou a coté et si la case désigné est une caseVide : True 
		}
		if(p instanceof Roi) //Si la piece est un Roi
		{
			//Si il n'y a personne devant ou a droite ou a gauche ou derierre : True
		}
		if(p instanceof Reine) //Si la piece est une Reine
		{
			//Pareil que le roi et si la case désigné = caseVide : True
		}
		if(p instanceof Fou) //Si la piece est un fou
		{
			//Si il n'y a personne dur ma diagonale et si la case désigné et une caseVide : True
		}
		if(p instanceof Cavalier) //Si la piece est un Cavalier
		{
			/* Vérifie tout les points en L :
				si on prend la piece a déplacer comme orgine on a (i,j) (abscisse,ordonné) :
				(1,2) (2,1) (2,-1) (1,-2) (-1,-2) (-2,-1) (-2,1) (-1,2)
			*/
		}
			
		return reponse;
	}
	
//-------------------
	public Echequier getTerrain() {
		return terrain;
	}

	public void setTerrain(Echequier nouvTerrain) {
		this.terrain = nouvTerrain;
	}
	
	
}
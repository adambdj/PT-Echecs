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
	
	public boolean verifDeplacement(Piece p)
	{
		boolean reponse = false;
		if(p instanceof Tour) //Si la piece est une tour
		{
			//Si il n'y a personne devant moi ou a coté et si la case désigné est une caseVide : True 
		}
		else if(p instanceof Roi) //Si la piece est un Roi
		{
			//Si il n'y a personne devant ou a droite ou a gauche ou derierre : True
		}
		else if(p instanceof Reine) //Si la piece est une Reine
		{
			//Pareil que le roi et si la case désigné = caseVide : True
		}
		else if(p instanceof Fou) //Si la piece est un fou
		{
			//Si il n'y a personne dur ma diagonale et si la case désigné et une caseVide : True
		}
		else if(p instanceof Cavalier) //Si la piece est un Cavalier
		{
			/* Vérifie tout les points en L :
				si on prend la piece a déplacer comme orgine on a (i,j) (abscisse,ordonné) :
				(1,2) (2,1) (2,-1) (1,-2) (-1,-2) (-2,-1) (-2,1) (-1,2)


				Ou bien si le cavalier est sur une case blanche alors 
				il peut se déplacer dans toutes les cases noir du deuxieme carré qui l'encercle
				*: ou je peux me déplacer
				_____________
				|B  * B *  B|
				|* |B N B| *|
				|B |N C N| B|
				|* |B N B| *|
				|B  * B *  B|
			*/
				
		}
		else // p est un pion 
		{
			//Si la case de devant+1 est libre ou la case devant+2 quand on est en position initiale  
			//Je dois créer une méthode positionIntiale
			if ((this.positionInitialePion((Pion)p,this.joueurEnCour(this)) && this.terrain.etatCase(this.terrain.getCase(p.getPosX(), p.getPosY()+2))))	
				reponse = true;
			if(this.terrain.etatCase(this.terrain.getCase(p.getPosX(), p.getPosY()+1)) ) 
				reponse = true;
		}
		return reponse;
		
	}
	
	
	/*Soumeya___ permet de vérifier i le pion placé en paramètre est positionné dans sa case initiale ou non 
	 * On met en parametre le joueur car la position initiale est différente selon le joueur
	 */
	public boolean positionInitialePion(Pion p, Joueur numJoueur) {
		for (int j=1;j<9;j++)
			if(numJoueur == this.joueur1)
				if(p.getPosX()==2 && p.getPosY() == j)
					return true;	
			else
				if(p.getPosX()==7 && p.getPosY() == j)
					return true;
		
		return false;
	}
	
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

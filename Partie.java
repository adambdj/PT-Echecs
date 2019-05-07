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
			if (this.terrain.etatCase(p.getPosX(),p.getPosY()+1))
				reponse=true;
		}
			
		return reponse;
		
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

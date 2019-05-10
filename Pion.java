public class Pion  extends Piece
{
	private String forme;

	public Pion(int ligne, char colonne, int coul)
	{
		super(ligne,colonne,coul);
		this.forme="";
	}
	
	public void déplacerPiece()
	{
	}

	public boolean verifDeplacement(Echiquier e)
	{
		/*
		//Si la case de devant+1 est libre ou la case devant+2 quand on est en position initiale  
			//Je dois créer une méthode positionIntiale
			if ((this.positionInitialePion((Pion)p,this.joueurEnCour(this)) && this.terrain.etatCase(this.terrain.getCase(p.getPosX(), p.getPosY()+2))))	
				reponse = true;
			if(this.terrain.etatCase(this.terrain.getCase(p.getPosX(), p.getPosY()+1)) ) 
				reponse = true;
		*/
	}

	/*Soumeya___ permet de vérifier i le pion placé en paramètre est positionné dans sa case initiale ou non 
	 * On met en parametre le joueur car la position initiale est différente selon le joueur
	 
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
	*/
	
}

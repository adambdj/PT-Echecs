//Le Roi se déplace d'une seule case dans toutes les directions et de deux cases lors du roque.

public class Roi  extends Piece
{

	private String forme;

	public Roi()
	{
		super();
		if(this.getCouleur() == 0)
			this.forme = "R";				// si la pièce est noire
		else
			this.forme = "R";				// si la pièce est blanche
	}

	public Roi(int ligne, int colonne, int coul)
	{
		super(ligne,colonne,coul);
		if(this.getCouleur() == 0)
			this.forme = "R";				// si la pièce est noire
		else
			this.forme = "R";				// si la pièce est blanche
	}

	public String getForme()
	{
		return this.forme;
	}

		public boolean hautDroite(Case depart, Case arrive)
	{
		if(arrive.getPosX()==depart.getPosX()-1 && arrive.getPosY()==depart.getPosY()+1)  //en haut a droite
			return true;
		return false;
	}

	public boolean hautGauche(Case depart, Case arrive) {
		if(arrive.getPosX()==depart.getPosX()-1 && arrive.getPosY()==depart.getPosY()-1) //en haut a gauceh
			return true;
		return false;

	}
	public boolean basGauche(Case depart, Case arrive) {
		if (arrive.getPosX()==depart.getPosX()+1 && arrive.getPosY()==depart.getPosY()-1) //en bas a gauche
			return true;
		return false;
	}

	public boolean basDroite(Case depart, Case arrive) {
		if (arrive.getPosX()==depart.getPosX()+1 && arrive.getPosY()==depart.getPosY()+1) //en bas a gauche
			return true;
		return false;
	}

	public boolean memeLigne(Case depart, Case arrive) {
		if(depart.memeLigne(arrive)) {
			if(arrive.getPosY() == depart.getPosY()-1)
				return true;
			else if(arrive.getPosY() == depart.getPosY()+1)
				return true;
		}
		return false;
	}

	public boolean memeColonne(Case depart, Case arrive) {
		if(depart.memeColonne(arrive)) {
			if(arrive.getPosX() == depart.getPosX()-1)
				return true;
			else if(arrive.getPosX() == depart.getPosX()+1)
				return true;
		}
		return false;
	}


	/*
	 * les case autours
	 */
	public boolean verifdeplacement(Echiquier e, Case arrive)
	{
		Case depart = e.getCase(this.getPosX(), this.getPosY());
		if(!(this.memeColonne(depart, arrive)) || depart.getPiece().getCouleur() == arrive.getPiece().getCouleur())
			return false;

		if(!(this.memeLigne(depart, arrive)) || depart.getPiece().getCouleur() == arrive.getPiece().getCouleur())
			return false;

		if(!(this.hautDroite(depart, arrive)))
			return false;

		if(!(this.hautGauche(depart, arrive)))
			return false;

		if(!(this.basDroite(depart, arrive)))
			return false;

		if(!(this.basGauche(depart, arrive)))
			return false;

		if(super.memeCouleur(depart, arrive))
			return false;

		return true;
	}


	public String toString()
	{
		return super.toString() + " et la piece a la forme " + this.forme;
	}

}

//La Reine se déplace d'un nombre quelconque de cases verticalement, horizontalement et en diagonale sans pouvoir sauter une pièce.

public class Reine extends Piece
{
	private String forme;

	public Reine()
	{
		super();
		if(this.getCouleur() == 0)		// si la pièce est noire
			this.forme = "D";
		else							// si la pièce est blanche
			this.forme = "D";
	}

	public Reine(int ligne, int colonne, int coul)
	{
		super(ligne,colonne,coul);
		if(this.getCouleur() == 0)
			this.forme = "D";			// si la pièce est noire
		else
			this.forme = "D";			// si la pièce est blanche
	}

	public String getForme()
	{
		return this.forme;
	}

	/*Soumeya
	 * la reine peux aller partout
	 * la case d'arrive peut etre tout SAUF:
	 * 	---> entre case depart et case d'arrive aucune piece
	 * ----> et case arrive pas une piece
	 */

	public boolean deplacementValide(Echiquier e,Case arrive) {
		Case depart = e.getCase(this.getPosX(), this.getPosY());

		if(depart.memeColonne(arrive))
			if(this.boucleColonne(e, depart, arrive))
				return true;

		if(depart.memeLigne(arrive))
			if(this.boucleLigne(e, depart, arrive))
				return true;

		this.boucleDiagonale(e, depart, arrive);

		return false;
	}
/*
	public void boucleDiagonale(Echiquier e, Case depart, Case arrive) {
		if(depart.getPosX()>arrive.getPosX() && depart.getPosY()<arrive.getPosY())
		{
			System.out.println("en haut a droite");
			for(int i=depart.getPosX()-1;i>arrive.getPosX();i--);
			{
				for(int j=depart.getPosY()+1;j<arrive.getPosY();j++)
				{
					System.out.println("Case, i;j" + e.getCase(i, j));
						if(!(e.getCase(i, j).estVide()))
							System.out.println("il y a qlqn");

				}
			}
		}
	}
*/
	public void boucleDiagonale(Echiquier e,Case depart, Case arrive)
	{
		int x = depart.getPosX() - 1;
		int y = depart.getPosY() - 1;
		int i = arrive.getPosX();
		int j = arrive.getPosY();
		while(x >= i || y <= j)
		{
			if (e.etatCase(e.getCase(x,y)))
			{
				System.out.println("Case i : " + x + " j : " + y);
			}
			else
			if (e.etatCase(e.getCase(x,y)) == false)
			{
					System.out.println("case pas vide");
			}
			x = x - 1;
			y = y + 1;
	}
}

	public boolean boucleColonne(Echiquier e, Case depart, Case arrive) {
		if(arrive.getPosX()>depart.getPosX())
		{
			for(int i=depart.getPosX()+1; i<arrive.getPosX();i++)
			{
				System.out.println("Case, i"+i+e.getCase(i, depart.getPosY()));
				if(!(e.getCase(i, depart.getPosY()).estVide()))
					return false;
			}

		}else
			for(int i=arrive.getPosX()+1; i<depart.getPosX();i++)
			{
				System.out.println("Case, i"+i+e.getCase(i, depart.getPosY()));
				if(!(e.getCase(i, depart.getPosY()).estVide()))
					return false;
			}
		if(arrive.getPiece().getCouleur()==depart.getPiece().getCouleur())
			return false;

		return true;
	}

	public boolean boucleLigne(Echiquier e, Case depart, Case arrive) {
		if(arrive.getPosY()>depart.getPosY())
		{
			for(int j=depart.getPosY()+1; j<arrive.getPosY();j++) {
				System.out.println("Case, j"+j+e.getCase(depart.getPosX(),j));
				if(!(e.getCase(depart.getPosX(),j).estVide()))
					return false;
			}
		}else
			for(int j=arrive.getPosY()+1; j<depart.getPosY();j++) {
				System.out.println("Case, j"+j+e.getCase(depart.getPosX(),j));
				if(!(e.getCase(depart.getPosX(),j).estVide()))
					return false;
			}
		if(arrive.getPiece().getCouleur()==depart.getPiece().getCouleur())
			return false;

		return true;
	}
	public String toString()
	{
		return super.toString() + " et la piece a la forme " + this.forme;
	}

}

//Le Pion avance d'une case à la fois. Il se déplace d'une case en diagonale en prenant une pièce adverse.
//	S'il n'a pas encore bougé, il peut avancer de deux cases d'un coup, sans pouvoir sauter une pièce.
//		Lorsqu'il arrive à la dernière rangée, il est promu en une autre pièce (Cavalier, Fou, Tour ou Reine).

public class Pion  extends Piece
{
	private String forme;

	public Pion()
	{
		super();
		if(this.getCouleur() == 0)
		{
			this.forme = "♟";
		}
		else
		{
			this.forme = "♙";
		}
	}

	public Pion(int ligne, int colonne, int coul)
	{
		super(ligne,colonne,coul);
		if(this.getCouleur() == 0)
		{
			this.forme = "♟";
		}
		else
		{
			this.forme = "♙";
		}
	}

	public String getForme() {
		return this.forme;
	}

	public void deplacerPiece()
	{

	}

	public boolean caseVidedevant(Echiquier e, int x, int couleur) {
		/*if(e.getCase(x+1, this.getPosY()).getPiece()==null )
			return true;*/
		if(couleur == 0) {
			if(e.etatCase(e.getCase(x+1, this.getPosY())))
				return true;
		}else
			if(e.etatCase(e.getCase(x-1, this.getPosY())))
				return true;


		return false;
	}

	public boolean mouvementValideNoir(Echiquier e) {
		if(this.positionInitialePion()
				&& this.caseVidedevant(e,this.getPosX(),0)
				&& this.caseVidedevant(e,this.getPosX()+1,0))
			return true;//position initiale ; case+1 vide ; case+2 vide

		else if(this.positionInitialePion() && this.caseVidedevant(e,this.getPosX(),0 ) )
			return true; //position initiale ; case+1 vide

		else if(this.caseVidedevant(e,this.getPosX(),0))
			return true;//!position initiale ; case+1 vide

		return false ;//!position initiale ; case+1 non null | position initiale; case+1 non null
	}

	public boolean mouvementValideBlanc (Echiquier e) {
		if (this.positionInitialePion()
				&& this.caseVidedevant(e,this.getPosX(),1)
				&& this.caseVidedevant(e,this.getPosX()-1,1))
			return true; //position initiale ; case+1 vide ; case+2 vide
		else if(this.positionInitialePion() && this.caseVidedevant(e,this.getPosX(),1 ) )
			return true; //position initiale ; case+1 vide
		else if(this.caseVidedevant(e,this.getPosX(),1))
			return true; //!position initiale ; case+1 vide

		return false; //!position initiale ; case+1 non null | position initiale; case+1 non null
	}


	public boolean verifDeplacement(Echiquier e)
	{
		if(this.getCouleur()==0) { //Pion noir
			if(this.mouvementValideNoir(e))
				return true;
		}else
			if(this.mouvementValideBlanc(e))
				return true;
		return false;
	}

	public boolean positionInitialePion() {

		if(this.getCouleur() == 0)
		{
			for (int j = 0; j < 8 ; j++)
			{
					if(this.getPosX() == 1 && this.getPosY() == j)
						return true;
			}

		}else
		{
			for (int j = 0; j < 8 ; j++)
			{
				if(this.getPosX() == 6 && this.getPosY() == j)
					return true;
			}

		}
		return false;
	}


}

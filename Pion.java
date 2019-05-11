//Le Pion avance d'une case à la fois. Il se déplace d'une case en diagonale en prenant une pièce adverse. 
//	S'il n'a pas encore bougé, il peut avancer de deux cases d'un coup, sans pouvoir sauter une pièce.
//		Lorsqu'il arrive à la dernière rangée, il est promu en une autre pièce (Cavalier, Fou, Tour ou Reine).

public class Pion  extends Piece
{
	private String forme;
	private int nbrDeplacement;
	
	public Pion(int c) {
		super(c);
		this.forme="P";
	}
	public Pion(int ligne, char colonne, int coul)
	{
		super(ligne,colonne,coul);
		this.forme="";
	}
	
	public String getForme() {
		return this.forme;
	}
	
	public void déplacerPiece()
	{
		this.nbrDeplacement++;
	}

	public boolean caseVidedevant(Echequier e, int y) {
		if( e.etatCase(e.getCase(this.getPosX(), y+1)))
			return true;
		return false;
	}
	public boolean verifDeplacement(Echequier e)
	{
		if(this.getCouleur()==0) { //Pion noir
		//Position initiale pour avancer de 2
			if(this.positionInitialePion() 
					&& this.caseVidedevant(e,this.getPosY()) 
					&& this.caseVidedevant(e,this.getPosY()+2))
				return true;

		//Pour avancer de 1 que l'on soit en position initiale ou non 
			else if (this.caseVidedevant(e, this.getPosY()+1)) 
				return true;
			
		}

		return false;
	}

	/*Soumeya___ permet de vérifier i le pion placé en paramètre est positionné dans sa case initiale ou non 
	 * On met en parametre le joueur car la position initiale est différente selon le joueur*/
	
	
	public boolean positionInitialePion() {
		if (this.nbrDeplacement != 0)
			return false;
		return true;
	}
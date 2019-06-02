//Le Fou se déplace d'un nombre quelconque de cases en diagonale sans pouvoir sauter une pièce.
//	Il y a un fou sur cases blanches (appelé « blanc », peu importe la couleur des pièces) et un fou sur cases noires (appelé « noir »),
//		ce nom leur vient de leur case de départ, et du fait que leur déplacement ne peut se faire que sur des cases de cette couleur.

public class Fou extends Piece
{
	private String forme;

	public Fou()
	{
		super();
		if(this.getCouleur() == 0)
		{
			this.forme = "♝";
		}
		else
		{
			this.forme = "♗";
		}
	}

	public Fou(int ligne, int colonne, int coul)
	{
		super(ligne,colonne,coul);
		if(this.getCouleur() == 0)
		{
			this.forme = "♝";
		}
		else
		{
			this.forme = "♗";
		}
	}

	public String getForme()
	{
		return this.forme;
	}

	public String toString()
	{
		return super.toString() + " et la piece a la forme " + this.forme;
	}


	public void deplacerPiece()
	{
	}

	//Si la piece est un fou
	//Si il n'y a personne dur ma diagonale et si la case désigné et une caseVide : True
	public void verifDeplacement(Echiquier e, int i, int j)
	{
		boolean p = false;
		int a = this.getPosX();
		int b = this.getPosY();

		if (e.etatCase(e.getCase(i,j)) == false && e.getCase(i,j).getPiece().getCouleur() == this.getCouleur())
			System.out.println("La position de destination est Pion allie");
		else
			if (a > i && b < j)
			{
				a = a - 1;
				b = b + 1;
				while (a >= i || b <= j)
				{
					if (e.etatCase(e.getCase(a,b)) || e.getCase(a,b).getPiece().getCouleur() != this.getCouleur())
					{
							//p = true;
							System.out.println("case vide dans ligne : " + a + " colonne : " + b);
					}
					else
						if (e.etatCase(e.getCase(a,b)) == false && e.getCase(a,b).getPiece().getCouleur() == this.getCouleur())
						{
							System.out.println(" y a un pion dans la case !!! dans x : " + a + " y : " + b);
						}
						a = a - 1;
						b = b + 1;
				}
			}
	}


}

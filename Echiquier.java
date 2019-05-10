import java.util.*;
public class Echiquier
{
	private Case[][] grille;
	public Echiquier()
	{
		this.intialiser();
		//this.InitialiserPiece();
	}

	/* Initialise le tableau */
	public void intialiser()
	{
		this.grille = new Case[8][8];
		for(int i = 0; i < 8; i++)
		{
			for(int j = 0; j < 8; j++)
			{
				this.grille[i][j] = new Case(i,j);
			}
		}
	}

	/* getCase() */
	public Case getCase(int x, int y)
	{
		return this.grille[x][y];   // retourne la case par rapport a l'indice x, y
	}

	/* Soumeya___setCase() - on modifie la case en lui ajoutant une piece
	 *  On ajoute la piece dans la case concerné
	 * Si la case est vide alors je peux placer ma piece  */

	public void setCase(Case c, Piece p)
	{
		if(this.etatCase(c))
		{
			this.grille[c.getPosX()][c.getPosY()].setPiece(p);
		}
	}


	/*Soumeya___
	 * En ne mettant que la case concerné on retourn True si elle est vide ou bien false*/
	public boolean etatCase(Case c)
	{
		if(c.estVide())
			return true;
		return false;
	}

	/* GETTER */
	public Case[][] getGrille()
	{
		return this.grille;
	}

	public void initialiserPiecesNoir(Piece p)
	{
		//  Je place les pieces du joueur Noir
		for (int i = 0; i < 8 ; i++)
		{
				for (int j = 0; j < 2 ; j++)
				{
						this.setCase(this.grille[i][j],p);
						this.getCase(i,j).getPiece().setCouleur(1);
				}
		}

	}
	public void initialiserPiecesBlanche(Piece p)
	{
		for (int i = 0; i < 8 ; i++)
		{
			for (int j = 6; j < 8; j++)
			{
				this.setCase(this.grille[i][j],p);
				this.getCase(i,j).getPiece().setCouleur(0);
			}
		}
	}
	public String toString()
	{
		String s = "|";
		for (int i = 0; i < 8; i++)
		{
			for (int j = 0; j < 8; j++)
			{
				s = s + this.grille[i][j] + "	|	";
			}
		}
		return s;
	}

	public String afficher()
	{
		String s = "";
		for (int i = 0; i < 8; i++)
		{
				for (int j = 0; j < 8; j++)
				{
						if(this.etatCase(this.getCase(i,j)))
							s += ".";
					//	else
					//		s += this.getCase(i,j).getPiece().getForme();
				}
				s += "\n";
		}
		return s;
	}
}












/*			TEST initialiserPiecesNoir et initialiserPiecesBlanche
Echiquier e = new Echiquier();
Piece p = new Fou();
Piece pi = new Fou();
e.initialiserPiecesNoir(p);
e.initialiserPiecesBlanche(pi);
System.out.println(e.getCase(6,6));
*/

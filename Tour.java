//La tour se déplace d'un nombre quelconque de cases horizontalement
//	ou verticalement et peut sauter seulement par-dessus le Roi lors du roque.
import java.math.*;
public class Tour extends Piece
{
	private String forme;

	public Tour()
	{
		super();
		if(this.getCouleur() == 0)
		{
			this.forme = "\u265C";					// si la pièce est noire
		}
		else
		{
			this.forme = "\u2656";					// si la pièce est blanche
		}

	}
	public Tour(int ligne, int colonne, int coul)
	{
		super(ligne,colonne,coul);
		if(this.getCouleur() == 0)
		{
			this.forme = "\u265C";					// si la pièce est noire
		}
		else
		{
			this.forme = "\u2656";					// si la pièce est blanche
		}
	}

	public String getForme()
	{
		return this.forme;
	}

	public void deplacerPiece()
	{
	}

	//Si la piece est une Tour
	//Si il n'y a personne devant moi ou a coté et si la case désigné est une caseVide : True
	public boolean verifDeplacement(Echiquier e, Case arrive)
	{
		int departX = this.getPosX();
		int departY = this.getPosY();
		int i = arrive.getPosX();
		int j = arrive.getPosY();

		if(Math.abs(departX - i) <= 8 && Math.abs(departY - j) == 0 || Math.abs(departX - i ) == 0 && Math.abs(departY - j) <=8 )
		{
			return true;
		}
		else
		{
			return false;
		}

	}

	public String toString()
	{
		return super.toString() + " et la piece a la forme " + this.forme;
	}

}

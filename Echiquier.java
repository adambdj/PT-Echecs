public class Echiquier
{
	private Case[][] grille;
	public Echiquier()
	{
		this.intialiser();
	}
	
	/* Initialise le tableau */
	public void intialiser()
	{
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
	

}
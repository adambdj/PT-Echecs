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
		for(int i = 0; i < 8, i++)
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
		return this.grille[i][j];   // retourne la case par rapport a l'indice x, y
	}
	
	/* setCase() */
	public void setCase(int x, int y, Piece p)
	{
		if(this.etatCase(x,y))
		{
			this.grille[i][j] = p;
		}
	}
	
	/* GETTER */
	public Case[][] getGrille()
	{
		return this.grille;
	}
	
	//------Soumeya
	//Permet de mettre en paramètre les coordonné d'une case pour savoir directement son etat
	
	public boolean etatCase(int x, int y)
	{
		//  if (this.grille[x][y].getCaseLibre == true)
		//    return true;
		//  else 
		//    return false;
	}
	
	//-----------

}

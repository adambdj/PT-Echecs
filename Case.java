public class Case
{
	private int x; // position x
  	private int y; // position y
  	private Piece p; // case peut etre compose de piece
  		
	public Case(int x, int y)
	{
		this.x = x;
		this.y = y;
     		this.caseLibre = true;
	}
  	
	public Case(int x, int y, Piece p)
    	{
      		this.x = x;
      		this.y = y;
     		this.p = p;  // sinon par exemple je fais des if(p instanceof cavalier)
    	}
  
  	/* GETTERS */
  
  	public Piece getPiece()
    	{
		return this.p;
    	}
   	
  	public int getPosX()
  	{
  		return this.x;
 	}
  
 	public int getPosY()
 	{
  		return this.y;
  	} 
	
	/*___________________FIN DES GETTERS	*/
	
  
  	/* SETTERS */
	
    	public void setPosX(int x)
    	{
      		this.x = x;
   	}

    	public void setPosY(int y)
    	{
      		this.y = y;
    	}
  	
	/*	MET UNE PIECE DANS LA CASE */
  
  	public void setPiece(Piece piece)
    	{
    		this.p = piece;	// met la piece dans la case
      		this.caseLibre = false;	// dit que la case n'est plus libre 
    	}
	
	/*___________________FIN DES SETTERS	*/
	
	
	public String toString()
	{	
	}
	
	
  	/*	---------------------------------------- VERIFIE SI LA SAISIE DE LA CASE EST VALIDE ------------------- 
  
  	public boolean saisieValide()
    {
      char[] tabChar = {"A","B","C","D","E","F","G","H"};
      boolean t = false;
      if(this.positionCase.lenght != 2)	// faut pas que ca fasse A12 d'ou taille de la position different de 2
        return t;
      else
      {
      	for(int i = 0; i < tabChar.lenght; i++)
        {
          if( this.positionCase[0] >= 1 && this.positionCase[0] <= 8 && this.positionCase[1] == tabChar[i])
            p = true;	//	met true si la position est bien valide
        }
      }
 	  return p;
    }   
  		---------------------------------------------------------------------------------------------------------	*/
  
}

  public abstract class Piece
  {
  	private int couleur;	// 0 pour blanc, 1 pour noir
  	private int x;	// position x 
    private int y;	// position y 
   
    	// Constructeur avec paramètres
    	
  	public Piece(int x, int y, int couleur)
    	{
    	}
    
    	/* GETTERS */
    	public int getPosX()
    	{
  	  	return this.x;
    	}
    
   	public int getPosY()
    	{
    		return this.y;
    	}
    
    	public int getCouleur()
    	{
    		return this.couleur;
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
    
  	/*___________________FIN DES SETTERS	*/
  	
    	// Deplacer piece a redefinir dans les objects tour, cavalier etc...
    	public void deplacerPiece()
  	{
  	}
                         
   	/* Methode toString */              
    	public String toString()
    	{
      		return "X";
    	}
  }

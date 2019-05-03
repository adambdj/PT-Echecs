public abstract class Piece
{
  private String couleur;
  private boolean etatPiece;
  private int x;	// position x 
  private int y;	// position y 
  
  // Contructeur vide
  public Piece()
  {
  	this.couleur = "";
    this.etatPiece = true; // true(piece en jeu) false(piece detruite)
  }
 
  // Constructeur avec parametre
  public Piece(String c,int x, int y)
  {
  	this.couleur = c;
    this.etatPiece = true; // true(piece en jeu) false(piece detruite)
	this.x = x;
    this.y = y;
  }
  
  /* GETTER */
  public int getPosX()
  {
  	return this.x;
  }
  
  public int getPosY()
  {
  	return this.y;
  }
  
  public boolean getEtatPiece()
  {
  	return this.etatPiece;
  }
  
  public String getCouleur()
  {
  	return this.couleur;
  }
  
  /* SETTER */
  public void setPosX(int x)
  {
  	this.x = x;
  }
  
  public void setPosY(int y)
  {
  	this.y = y;
  }
  
  public void setEtatPiece(boolean etat)
  {
  	this.etatPiece = etat;
    if(etat == false)
    {
      this.x = 8;
      this.y = 9;
    }
  }
  
  // Deplacer piece a redefinir dans les objects tour, cavalier etc...
  public void deplacerPiece() {}
                       
  /* Methode toString */              
  public String toString()
  {
    return "X";
  }
}


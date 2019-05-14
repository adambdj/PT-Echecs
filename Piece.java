public abstract class Piece
{
  private int couleur;	// 0 pour noir, 1 pour blanc
  private int x;	// position x
  private int y;	// position y

    // Constructeur avec paramètres
  public Piece(){
  }

  public Piece(int x, int y, int couleur)
  {
    this.x = x;
    this.y = y;
    this.couleur = couleur;
  }
  public boolean verifDeplacement(Echiquier e)
  {
    return true;
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

    public String getForme() {
      return "";
    }

  /*___________________FIN DES GETTERS	*/

    /* SETTERS */
  public void setPosXetY(int x, int y) {
    this.setPosX(x);
    this.setPosY(y);
  }
    public void setPosX(int x)
    {
      this.x = x;
    }

    public void setPosY(int y)
    {
      this.y = y;
    }

    public void setCouleur(int c)
    {
      this.couleur = c;
    }
  /*___________________FIN DES SETTERS	*/

    // Deplacer piece a redefinir dans les objects tour, cavalier etc...
     public void deplacerPiece(){}


  /* Methode toString */
    public String toString()
    {
      String s ="";
      if(this.couleur == 0)
        s = "noir";
      else
        s = "blanc";
      
        return "Piece [" + this.x+";"  + this.y+ "]" + "couleur : " + s;
    }
}

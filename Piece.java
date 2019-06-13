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
  public boolean verifDeplacement(Echiquier e, int i, int j)
  {
    return true;
  }
  public boolean verifDeplacement(Echiquier e)
  {
    return true;
  }

  /*Methode utile pour le Roi, Reine, Tour
   * 
   * 
   * SOUMEYA
   */
  public boolean mouvementDiagonal(Echiquier e, int i, int j) {
   
    if(j+1>7) //Si je suis hors terrain - côté droit
    {
      if(e.etatCase(e.getCase(i+1, j-1)))
        return true;
      else if(e.etatCase(e.getCase(i-1,j-1)))
        return true;
    }
    else if (j-1<0) //Si je suis hors terrain - côté gauche
    {
      if(e.etatCase(e.getCase(i-1, j+1)))
        return true;
      else if (e.etatCase(e.getCase(i+1, j+1)) )
        return true;
    }
    else 
    {
      if(e.etatCase(e.getCase(i+1, j-1)))
      return true;
      else if (e.etatCase(e.getCase(i-1,j-1) ) )
          return true;
      else if (  e.etatCase(e.getCase(i-1, j+1)))
        return true;
      else if ( e.etatCase(e.getCase(i+1, j+1)))
        return true;
    }
    return false;   
  }
  
  public boolean mouvementVertical(Echiquier e, int i, int j) {
    if(i+1>7) //Si je suis hors terrain - côté bas
      if(e.etatCase(e.getCase(i-1, j)))
        return true;
    else if(i-1<0) //Si je suis hors terrain - côté haut
      if(e.etatCase(e.getCase(i+1, j)))
        return true;
    else
    {
      if(e.etatCase(e.getCase(i-1, j)))
        return true;
      else if (e.etatCase(e.getCase(i+1, j)))
        return true;
    }
    return false;
  }
  
  public boolean mouvementHorizontal(Echiquier e, int i, int j) {
    if(j+1>7) //Si je suis hors terrain - côté droit
      if(e.etatCase(e.getCase(i, j-1)))
        return true;
    else if (j-1<0) //Si je suis hors terrain - côté gauche
      if(e.etatCase(e.getCase(i, j+1)))
        return true;
    else 
    {
      if(e.etatCase(e.getCase(i, j-1)))
        return true;
      else if (e.etatCase(e.getCase(i, j+1)) )
        return true;
    }
    return false;
  }

   //Pour déplacer une piece - Fonctionne pour toute les pieces 
    public void deplacerPieces(Echiquier e, Case depart, Case arrive) {
    //Mettre des EXCEPTIONS !
      if(depart.getPiece().verifDeplacement(e))
      {
        if( (!(depart.estVide())) && arrive.estVide()) {
          e.setCase(arrive, depart.getPiece());
          depart.setPiece(null);
        }
      
      } 
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
     public void deplacerPiece(Echiquier e, int i, int j)
     {
       if (this.verifDeplacement(e,i,j))
       {
          int x = this.getPosX();
          int y = this.getPosY();
          e.setCase(e.getCase(i,j),e.getCase(this.x,this.y).getPiece());
       }
     }


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

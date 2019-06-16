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

  public void boucleDiagonale(Echiquier e, Case depart, Case arrive) {}
  public boolean deplacementValide(Echiquier e,Case arrive){return true;}

  public boolean verifDeplacement(Echiquier e, Case arrive)
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
     public void deplacerPiece(Echiquier e, Case arrive)
     {
       System.out.println("test 1");
       if (this.verifDeplacement(e,arrive))
       {
          int x = this.getPosX();
          int y = this.getPosY();
          int i = arrive.getPosX();
          int j = arrive.getPosY();
          System.out.println("x " + x + " y " + y);
          System.out.println("i " + i + " j " + j);
          e.setCase(e.getCase(i,j),e.getCase(x,y).getPiece());
          System.out.println(e.getCase(i,j));
          e.setCase(e.getCase(x,y),null);
          System.out.println(e.getCase(x,y));
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

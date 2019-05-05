public class Echiquier
{
  private Case[][] grille;
  private Piece[] tabPiece = {"Tour","Fou","Cavalier","Reine","Roi","Cavalier","Fou","Tour","Pion"};
  
  public Echiquier()
  {
  	for(int i = 0; i < 8, i++)
    {
    	for(int j = 0; j < 8; j++)
          this.grille[i][j] = new Case(i,j);
    }
  
  }

//------Soumeya
  //Permet de mettre en paramètre les coordonné d'une case pour savoir directement son etat
  public boolean etatCase(int x, int y){
    if (this.grille[x][y].getCaseLibre == true)
      return true;
    else 
      return false;
  }
//-----------

  public Case[][] getGrille(){
    return this.grille;
  }



}

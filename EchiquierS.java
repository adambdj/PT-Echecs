public class Echiquier
{
  private Case[][] grille;
  private Piece[] tabPiece = {"Tour","Fou","Cavalier","Reine","Roi","Cavalier","Fou","Tour","Pion"};
  
  public Echiquier()
  {
  	for(int i = 0; i < 8, i++)
    {
    	for(int j = 0; j < 8; j++)
          grille[i][j] = new Case(i,j);
    }
  
  }
}

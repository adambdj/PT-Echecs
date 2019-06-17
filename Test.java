import java.util.Scanner;

public class Test
{
  public static void main(String [] arg)
  {
    Echiquier e = new Echiquier();
    e.setCase(e.getCase(4, 3), e.getCase(7, 4).getPiece());
    e.getCase(7, 4).setPiece(null);
    System.out.println(e.afficher());

    System.out.println(e.enEchec(e.getCase(4, 3).getPiece()));
    e.listeEnnemie.clear();
        
  }

}

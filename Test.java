import java.util.Scanner;

public class Test
{
  public static void main(String [] arg)
  {
    Echiquier e = new Echiquier();
    Case depart = e.getCase(1, 0);
    Case arrive = e.getCase(2,0);
    
    System.out.println(e.afficher());
    
    System.out.println(depart);
    System.out.println(arrive);
    
    System.out.println(depart.getPiece().verifDeplacement(e, arrive));
    if(depart.getPiece().deplacerPieces(e,arrive)) {
      System.out.println(e.afficher());
    }
    e.setCase(arrive, depart.getPiece());
    depart.setPiece(null);
    System.out.println(e.afficher());
    System.out.println(depart);
    System.out.println(arrive);

  }

}
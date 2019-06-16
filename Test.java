import java.util.Scanner;

public class Test
{
  public static void main(String [] arg)
  {
    Echiquier e = new Echiquier();
    Case depart = e.getCase(6,0);
    Case arrive = e.getCase(5,0);

    System.out.println(e.afficher());

    System.out.println(depart);
    System.out.println(arrive);

    System.out.println(depart.getPiece().verifDeplacement(e, arrive));
<<<<<<< HEAD
    depart.getPiece().deplacerPieces(e,arrive);

=======
    if(depart.getPiece().deplacerPieces(e,arrive))
    {
      System.out.println(e.afficher());
    }
    
    e.setCase(arrive, depart.getPiece());
    depart.setPiece(null);
>>>>>>> 8799f8d1cd08901fbf664a8510fe7ec0da118c48
    System.out.println(e.afficher());
    System.out.println(depart);
    System.out.println(arrive);



  }

}

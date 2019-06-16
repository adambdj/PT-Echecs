import java.util.Scanner;

public class Test
{
  public static void main(String [] arg)
  {
    Echiquier e = new Echiquier();
    
    
    
   Piece t = new Pion(4,3,1);
    e.setCase(e.getCase(4, 3), t);
    
    Piece t1 = new Pion(4,4,1);
    e.setCase(e.getCase(4, 4), t1);
    
    Piece t2= new Pion(4,5,1);
    e.setCase(e.getCase(4, 5), t2);
    
    Piece t3= new Pion(3,5,1);
    e.setCase(e.getCase(3, 5), t3);
    
    Piece t4 = new Pion(2,4,1);
    e.setCase(e.getCase(2, 4), t4);
    
    Piece t5 = new Pion(2,3,1);
    e.setCase(e.getCase(2, 3), t5);
    
    Piece t6= new Pion(3,3,1);
    e.setCase(e.getCase(3, 3), t6);
    
    Piece t7= new Pion(2,5,1);
    e.setCase(e.getCase(2, 5), t7);
    

    
    Piece d = new Roi(3,4,1);
    e.setCase(e.getCase(3, 4), d);
    
    
    
    
    
    
    Case depart = e.getCase(d.getPosX(), d.getPosY());
    Case arrive = e.getCase(4,5);
    
    System.out.println(e.afficher());
    
    System.out.println(depart);
    System.out.println(arrive);
    //p.deplacementPossible(e,depart,arrive); 
    System.out.println(d.verifDeplacement(e, arrive));

  }

/*___________Saisie générale*/

      //  Scanner saisie = new Scanner(System.in);

/*____________Saisie des joueurs*/

      //  System.out.println("Joueur 1 : Votre nom ?");
      //  String j1nom = saisie.nextLine();
      //  Joueur j1 = new Joueur(j1nom,1);

      //  System.out.println("Joueur 2 : Votre nom ?");
      //  String j2nom = saisie.nextLine();
      //  Joueur j2 = new Joueur(j2nom,0);

      //  System.out.println(j1 + "\n" + j2);
      //  Partie pp = new Partie(j1,j2);

  /*______________Terrain*/

      //  Piece p= new Reine();
      //  pp.getTerrain().setCase(new Case(3,3), p);
      //  System.out.println(pp.getTerrain().afficher());

      //  p.deplacerPieces(pp.getTerrain(), pp.getTerrain().getCase(6, 0), pp.getTerrain().getCase(4, 0));
      // System.out.println(pp.getTerrain().afficher());


    /*_______________________ SAMPLE pour tester les déplacements */


  /*  Echiquier e = new Echiquier();

    e.setCase(e.getCase(4,2),new Cavalier());               // Changer la piece à initialiser selon le test souhaité
    System.out.println(e.afficher());
    try
    {
      System.out.println(e.getCase(4,2).getPiece().verifDeplacement(e,5,4));        // Jouer avec les coordonnées
    }
    catch(Exception ex)
    {
      System.out.println(ex);
    }*/
}

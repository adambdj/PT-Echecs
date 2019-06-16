import java.util.Scanner;

public class Test
{
  public static void main(String [] arg)
  {
<<<<<<< HEAD
        Echiquier e = new Echiquier();



    //Pion p = (Pion) depart.getPiece();

    Piece t = new Pion(1,1,0);
    e.setCase(e.getCase(1, 1), t);

    Piece test = new Reine(2,0,1);
    e.setCase(e.getCase(2, 0), test);
    Case arrive = e.getCase(t.getPosX(), t.getPosY());
    Case depart = e.getCase(test.getPosX(), test.getPosY());

=======
   Echiquier e = new Echequier();
    
    
    
    //Pion p = (Pion) depart.getPiece();
    
    Piece t = new Pion(3,4,0);
    e.setCase(e.getCase(3, 4), t);
    
    Piece d = new Reine(5,2,1);
    e.setCase(e.getCase(5, 2), d);
    
    
    
    
    
    Case depart = e.getCase(d.getPosX(), d.getPosY());
    Case arrive = e.getCase(3,4);
    
>>>>>>> 22524212f293e70d269e9dc1da481822e944871a
    System.out.println(e.afficher());
    System.out.println(depart);
    System.out.println(arrive);
<<<<<<< HEAD
    //p.deplacementPossible(e,depart,arrive);
    test.boucleDiagonale(e,depart,arrive);
    //p.positionInitiale(e, depart, arrive);


=======
    //p.deplacementPossible(e,depart,arrive); 
    d.boucleDiagonale(e, depart, arrive);
    
    
>>>>>>> 22524212f293e70d269e9dc1da481822e944871a
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

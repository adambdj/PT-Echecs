import java.util.Scanner;

public class Test
{
  public static void main(String [] arg)
  {
    Partie p = new Partie(new Joueur("Salim",0), new Joueur("Rahim",1));
    try{
    p.sauvegarderPartie();
//    p.restaurerPartie("sauve.txt");
}catch(Exception e)
{
  System.out.println(e);
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
}

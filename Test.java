public class Test
{
  public static void main(String [] arg)
  {
 /*___________Saisie générale*/
      Scanner saisie = new Scanner(System.in);
      
  /*____________Saisie des joueurs*/
      System.out.println("Joueur 1 : Votre nom ?");
      String j1nom = saisie.nextLine();
      Joueur j1 = new Joueur(j1nom,1);
      
      System.out.println("Joueur 2 : Votre nom ?");
      String j2nom = saisie.nextLine();
      Joueur j2 = new Joueur(j2nom,0);
      
      System.out.println(j1 + "\n" + j2);
      Partie pp = new Partie(j1,j2);      
/*______________Terrain*/
      Piece p= new Reine();
      pp.getTerrain().setCase(new Case(3,3), p);
      System.out.println(pp.getTerrain().afficher());
      
      p.deplacerPieces(pp.getTerrain(), pp.getTerrain().getCase(6, 0), pp.getTerrain().getCase(4, 0));
      System.out.println(pp.getTerrain().afficher());
  }

}

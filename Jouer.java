import java.util.Scanner;

public class Jouer
{
    public static void main(String[] args)
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

        Partie p = new Partie(j1,j2);
        int tours = 2;
        while(tours != 0)
        {
          if (tours %2 == 0)
            p.tourDeJeu(j1,tours);
          p.tourDeJeu(j2,tours);
          p.alternationJoueur(tours,j1,j2);
          tours++;
        }

        System.out.println("Vous avez quitté la partie");
    }


}

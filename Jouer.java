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
        
        Partie pp = new Partie(j1,j2);  
  /*___________Debut Partie*/
        System.out.println("Voulez vous reprendre votre partie ?(O/N)");
        String rep = saisie.nextLine();
        if(rep.equals("0") || rep.equals("o"))
        {
            try {
                pp.restaurerPartie("C:/Users/soume/eclipse-workspace/JeuDames/src/sauv.txt");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else
            System.out.println("C'est parti !");
/*______________Terrain*/

        System.out.println(pp.getTerrain().afficher());
        System.out.println(j1.getPrenom()+"------> Pièces blanches" +"\n" +j2.getPrenom()+"------> Pieces noire");

/*____________Saisie des déplacements*/
    /*Piece a déplacer*/
        int tours = 1;
        String quit ="N";
        while(quit.equals("N") || quit.equals("n"))
        {
            Joueur j = pp.alternationJoueur(tours, j1, j2);
            
            System.out.println(j.getPrenom() + ", quelle pièce voulez-vous déplacer? (saisir coordonnées)");
            int ligi,lig;
            String posPiece,pos;
            //Boucle se répète tant qu'on a pas saisie une case contenant une Piece
            do
            {
                posPiece = saisie.nextLine();
                ligi = posPiece.charAt(1)-'0'; //-'0' : pour que le char se transforme en int
                
            //Si la case selectionné ne contient pas de piece
                if(pp.getTerrain().etatCase(j.getChoixCase(pp.getTerrain(),ligi,posPiece.charAt(0))))
                    System.out.println("Cette case ne contient pas de Pièce, veuillez réessayer :");    
                
            }while(pp.getTerrain().etatCase(j.getChoixCase(pp.getTerrain(),ligi,posPiece.charAt(0))));
            
            System.out.println("Position saisie -> "+posPiece+" : "+j.getChoixPiece(pp.getTerrain(),ligi,posPiece.charAt(0)));
            
        
        /*Case où se déplacer   */
            //Boucle se répète tant qu'on a pas saisie une case vide
            
            System.out.println(j.getPrenom() + " où voulez vous vous déplacer?");
            do {
                
                pos = saisie.nextLine();
                lig = pos.charAt(1)-'0'; //-'0' : pour que le char se transforme en int
                if(j.getChoixPiece(pp.getTerrain(),lig,pos.charAt(0)) != null)
                    System.out.println("Cette case contient une Piece, veuillez réessayer :");
                
            }while(j.getChoixPiece(pp.getTerrain(),lig,pos.charAt(0)) != null);
            
            
            System.out.println("Position saisie -> "+pos+" : "+j.getChoixCase(pp.getTerrain(),lig,pos.charAt(0)));
            Case depart=j.getChoixCase(pp.getTerrain(),ligi,posPiece.charAt(0));
            Case arrive=j.getChoixCase(pp.getTerrain(),lig,pos.charAt(0));

            depart.getPiece().deplacerPieces(pp.getTerrain(),arrive);
        
                System.out.println("Piece déplacé");
                System.out.println(pp.getTerrain().afficher());
        /*
            else
                System.out.println("Impossible,la piece ne peux pas se déplacée");
            */

            System.out.println("Voulez vous quitter la partie ? (O/N)");
                quit = saisie.nextLine();
                
            tours++;
        }
        
        System.out.println("Vous avez quitté la partie");
    }

  
}

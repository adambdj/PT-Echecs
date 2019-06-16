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
        
/*______________Terrain*/
        Partie pp = new Partie(j1,j2);  
        System.out.println(pp.getTerrain().afficher());
/*______________*/

        System.out.println(j1.getPrenom()+"------> Pieces blanche" + "\n" + j2.getPrenom() + "------> Pieces noire");


  /*___________Debut Partie*/
        /*System.out.println("Voulez vous reprendre votre partie ?(O/N)");
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
            System.out.println("C'est partie !");*/


/*____________Saisie des déplacements*/
    /*Piece a déplacer*/
        int tours = 1;
        String quit ="N";
        while(quit.equals("N") || quit.equals("n"))
        {
            Joueur j = pp.alternationJoueur(tours, j1, j2);
            
            System.out.println(j.getPrenom() + " Quel piece voulez-vous déplacer (saisir coordonnée)?");
            int lig;
            String posPiece,pos;
            //Boucle se répète tant qu'on a pas saisie une case contenant une Piece
            do {
                posPiece = saisie.nextLine();
                lig = posPiece.charAt(1)-'0'; //-'0' : pour que le char se transforme en int
                
            //Si la case selectionné ne contient pas de piece
                if(pp.getTerrain().etatCase(j.getChoixCase(pp.getTerrain(),lig,posPiece.charAt(0))))
                    System.out.println("Cette case ne contient pas de Piece, veuillez réessayer :");    
                
            }while(pp.getTerrain().etatCase(j.getChoixCase(pp.getTerrain(),lig,posPiece.charAt(0))));
            
            System.out.println("Position saisie -> "+posPiece+" : "+j.getChoixPiece(pp.getTerrain(),lig,posPiece.charAt(0)));
            
        
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
            Case depart=j.getChoixCase(pp.getTerrain(),lig,posPiece.charAt(0));
            Case arrive=j.getChoixCase(pp.getTerrain(),lig,pos.charAt(0));

            if(depart.getPiece().deplacerPieces(pp.getTerrain(),arrive))
            {
                System.out.println("Piece deplace");
                System.out.println(pp.getTerrain().afficher());
            }
            else
                System.out.println("Impossible,la piece ne peux pas se deplacer");
            
            System.out.println("Voulez vous quitter la partie ? (O/N)");
                quit = saisie.nextLine();
                
            tours++;
        }
        
        System.out.println("Vous avez quitté la partie");
    }

  

    /*
   	Comment se déroule une partie ?
	-> On lance la partie (fonction : lancer Partie)
	-> JOUEUR 1 :
		->"ql pièce voulez-vous déplacer ? "
		appelle fonction : saisie return coordonnée
		if Existe coordonnée == positionPiece (classe piece)

		-> "où voulez-vous vous déplacer la piece de coordonnéePosition(i,j) ?"
		appelle fonction : saisie return coordonnée
		appelle fonction : verifDéplacement (coordonnée) return
			True : appelle fonction déplacerPiece(nomPiece)
					"déplacement effectué"
				appelle fonction verifMAT/PAT return True = fin Partie ou null
				false : fonction d'affichage JOUEUR 2

			false : déplacement impossible !
				return en haut de la boucle

		->voulez-vous quitter la partie ?
		appelle fonction : saisie return non - on continue
			oui - appelle fonction : sauvegarderPartie return
			sauvegarder partie apl verifMAT/PAT if True alors return False ON NE PEUX PAS SAUVEGARDER
			Sinon on sauvegarde car partie non null ni FINI
   */
}

//Fin du test
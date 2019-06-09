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
    	
    	System.out.println(j1 + "\n" + j2);
    	Partie pp = new Partie(j1,j2);    	
/*______________Terrain*/
    	
    	System.out.println(pp.getTerrain().afficher());   	
    	
/*____________Saisie des déplacements*/
    /*Piece a déplacer*/
    	System.out.println(j1.getPrenom() + " Quel piece voulez-vous déplacer (saisir coordonnée)?");
    	int lig;
    	String posPiece,pos;
    	//Boucle se répète tant qu'on a pas saisie une case contenant une Piece
    	do {
    		posPiece = saisie.nextLine();
    		lig = posPiece.charAt(1)-'0'; //-'0' : pour que le char se transforme en int
    		if(pp.getTerrain().etatCase(j1.getChoixCase(pp.getTerrain(),lig,posPiece.charAt(0))))
    			System.out.println("Cette case ne contient pas de Piece, veuillez réessayer :");
    			
    	}while(pp.getTerrain().etatCase(j1.getChoixCase(pp.getTerrain(),lig,posPiece.charAt(0))));
    	
    	System.out.println("Position saisie -> "+posPiece+" : "+j1.getChoixPiece(pp.getTerrain(),lig,posPiece.charAt(0)));
		
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
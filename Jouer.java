public class Jouer
{
    public static void main(String[] args)
    {
    	Scanner saisie = new Scanner(System.in);
    	
    	System.out.println("Joueur 1 : Votre nom ?");
    	String j1nom = saisie.nextLine();
    	Joueur j1 = new Joueur(j1nom,1);
    	
    	System.out.println("Joueur 2 : Votre nom ?");
    	String j2nom = saisie.nextLine();
    	Joueur j2 = new Joueur(j2nom,0);
    	
    	System.out.println(j1 + "\n" + j2);
    	Partie pp = new Partie(j1,j2);

    	System.out.println(pp.getTerrain().afficher());

    	System.out.println(j1.getPrenom() + " où voulez vous vous déplacer?");
    	String pos = saisie.nextLine();
    	int lig = pos.charAt(1)-'0'; //-'0' : pour que le char se transforme en int

    	System.out.println("Position saisie -> "+pos+" : "+j1.getChoix(pp.getTerrain(),lig,pos.charAt(0)));
    
    
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

public class Jouer
{
    public static void main(String[] args)
    {
        System.out.println("AAAAAAAAAAAAAAAAA");
    }



    /*
   		Comment se déroule une partie ? 
	-> On lance la partie (fonction : lancer Partie)
	-> JOUEUR 1 : 
		->"ql pièce voulez-vous déplacer ? "
		apelle fonction : saisie return coordonnée
		if Existe coordonnée == poisitonPiece (classe piece) 

		-> "où voulez-vous vous déplacer la piece de coordonnéePosition(i,j) ?"
		apelle fonction : saisie return coordonnée
		apelle fonction : verifDéplacement (coordonnée) return 
			True : apelle fonction déplacerPiece(nomPiece)
					"déplacement effectué" 
				apelle fonction verifMAT/PAT return True = fin Partie ou null
				false : fonction d'affichage JOUEUR 2
	
			false : déplacement impossible !
				return en haut de la boucle
   */
}

//Fin du test
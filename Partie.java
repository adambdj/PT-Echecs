//Ce qu'on peux faire pendant une partie
//une partie est composé d'un échiquier
import java.io.*;
import java.util.*;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;


public class Partie
{
	Scanner saisie = new Scanner(System.in);
	private Echiquier terrain; //Une Partie est composé d'un Echequier
	private Joueur joueur1;
	private Joueur joueur2;

	public Partie()
	{
		this.terrain=new Echiquier();
	}

	public Partie(Joueur j1, Joueur j2)
	{
		this.terrain=new Echiquier();
		this.joueur1=j1;
		this.joueur2=j2;

	}

//--------------Soumeya
	/*Le jeu annonce un MAT lorsque le Roi est attaqué et qu’il n’y a aucune possibilité de le sauver.*/

	// public boolean verifMAT()
	// {
	// }

	/*	Le jeu annonce un PAT lorsque le joueur ne peut déplacer aucune pièces
	 *	et que le roi n’est pas en attaque et ne peut se déplacer sans se mettre en échec .*/

	// public boolean verifPAT()
	// {
	// }

	public boolean verifDeplacement(Piece p)
	{
		return true;		// JUSTE POUR LA COMPILATION
	}


	public Joueur joueurEnCour(Partie p) {
		return joueur1;
	}

		/*Soumeya
	 * Pour alterner les joueurs, j'utilise une variable int tours que j'incrémenterais
	 * a chaque tour. (tours = 1 au debut)
	 * Si tour paire alors c'est le joueurs qui joue en 2 (les pieces noires)
	 * Sinon impaire c'est le premier joueurs
	 */
	public Joueur alternationJoueur(int tours, Joueur j1, Joueur j2) {
		if(tours%2 == 0)//Paire
			return j2;
		return j1;
	}
//-------------------


	public void lancerPartie()
	{
	}

	/*
	public void sauvegarderPartie(String fichier) throws IOException
	{

		BufferedWriter f = new BufferedWriter(new FileWriter(fichier,true));
		f.write(this.joueur1.getPrenom() + "\t" + this.joueur1.getCouleur());
		f.newLine();
		f.write(this.joueur2.getPrenom() + "\t" +this.joueur2.getCouleur());
		System.out.println(this.terrain.getCase(0,7).getPiece().getForme());
		for (int i = 0; i < 8; i++)
		{
			for (int j = 0; j < 8; j++)
			{
				f.newLine();
				f.write(this.terrain.getCase(i,j).getPiece() + "\t" + this.terrain.getCase(i,j).getPosX() + "\t" + this.terrain.getCase(i,j).getPosY());
			}
		}
		f.close();
	}

	public void restaurerPartie(String fichier) throws IOException
	{
		BufferedReader f = new BufferedReader(new FileReader(fichier));
		int i = 0;
		int v = 0;
		String r = f.readLine();
		StringTokenizer st = new StringTokenizer(r,"\t");
		String j = st.nextToken();	// recupere le prenom du joueur1
		int c = Integer.parseInt(st.nextToken()); // recupere la couleur du joueur1
		this.joueur1 = new Joueur(j,c);// creer le joueur 2
		r = f.readLine();
		st = new StringTokenizer(r,"\t");
		j = st.nextToken();	//	recupere le prenom du joueur2
		c = Integer.parseInt(st.nextToken()); //	recupere la couleur du joueur2
		this.joueur2 = new Joueur(j,c); // creer le joueur 2
		r = f.readLine();
		String nomForme;
		while (r != null) // tant qu'il y a encore une ligne
		{
			StringTokenizer st = new StringTokenizer(r,"\t");
			nomForme = st.nextToken();

			r = f.readLine();
		}
	}

	public void sauvegarderPartie()
	{
		try {
				File fichier = new File("sauvegarder.ser");
				ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fichier));
				oos.writeObject(this.terrain);
				oos.close();
		}catch(Exception e){
			System.out.println("Le fichier n'est pas sauvegarde !!");
		}
	}
	*/
	public void effacerTerrain()
	{
	}

	public void historique()
	{
	}

	public void tourDeJeu(Joueur j, int tours)
	{
		Scanner saisie = new Scanner(System.in);
		int coul;
		int coulChoix = 2;
		Piece choix;
		System.out.println(this.getTerrain().afficher());
		System.out.println(j.getPrenom() + ", quelle pièce voulez-vous déplacer? (saisir coordonnées)");
		int ligi,lig;
		String posPiece,pos;
		//Boucle se répète tant qu'on a pas saisie une case contenant une Piece
		try {
			do
			{
					posPiece = saisie.nextLine();
					ligi = posPiece.charAt(1)-'0'; //-'0' : pour que le char se transforme en int

			//Si la case selectionné ne contient pas de piece
					if(this.getTerrain().etatCase(j.getChoixCase(this.getTerrain(),ligi,posPiece.charAt(0))))
							System.out.println("Cette case ne contient pas de Pièce, veuillez réessayer :");

			}while(this.getTerrain().etatCase(j.getChoixCase(this.getTerrain(),ligi,posPiece.charAt(0))));

			System.out.println("Position saisie -> "+posPiece+" : "+j.getChoixPiece(this.getTerrain(),ligi,posPiece.charAt(0)));
			Case cD = j.getChoixCase(this.getTerrain(),ligi,posPiece.charAt(0));
			int coulChoixD = cD.getPiece().getCouleur();
			/*Case où se déplacer   */
					//Boucle se répète tant qu'on a pas saisie une case vide

			System.out.println(j.getPrenom() + " où voulez vous vous déplacer?");
			do {
					pos = saisie.nextLine();
					lig = pos.charAt(1)-'0'; //-'0' : pour que le char se transforme en int
					choix = j.getChoixPiece(this.getTerrain(),lig,pos.charAt(0));
					if (choix != null ) {
						coulChoix = choix.getCouleur();
					}

					if(coulChoix == coulChoixD)
							System.out.println("Cette case contient une Piece, veuillez réessayer :");

			}while(coulChoix == coulChoixD);


			System.out.println("Position saisie -> "+pos+" : "+j.getChoixCase(this.getTerrain(),lig,pos.charAt(0)));

			Case depart=j.getChoixCase(this.getTerrain(),ligi,posPiece.charAt(0));
			Case arrive=j.getChoixCase(this.getTerrain(),lig,pos.charAt(0));
			System.out.println(depart.getPosX() + " et : " + depart.getPosY());
			System.out.println(arrive.getPosX() + " et : " + arrive.getPosY());
			depart.getPiece().deplacerPieces(this.getTerrain(),arrive);
			System.out.println("Piece déplacé");
			System.out.println(this.getTerrain().afficher());
		}catch(Exception ex){
			System.out.println("La saisie est bizzare");
		}

	}

	public Echiquier getTerrain()
	{
		return terrain;
	}

	public void setTerrain(Echiquier nouvTerrain)
	{
		this.terrain = nouvTerrain;
	}


	public Joueur getJoueur1() {
		return this.joueur1;
	}

	public Joueur getJoueur2() {
		return this.joueur2;
	}

}

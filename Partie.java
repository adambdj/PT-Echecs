//Ce qu'on peux faire pendant une partie
//une partie est composé d'un échiquier
import java.io.*;
import java.util.*;
import java.io.InputStream;
import java.io.OutputStream;

public class Partie
{
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


   //Pour déplacer une piece - Fonctionne pour toute les pieces
    public boolean deplacerPieces(Case depart, Case arrive) {
    //Mettre des EXCEPTIONS !
      if(depart.getPiece().verifDeplacement(this.terrain))
      {
        if( (!(depart.estVide())) && arrive.estVide()) {
          this.terrain.setCase(arrive, depart.getPiece());
          depart.setPiece(null);
          return true;
        }

      }
      return false;
    }

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

	public void tourDeJeu()
	{
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

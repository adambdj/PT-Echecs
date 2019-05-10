public class Cavalier  extends Piece
{
	private String forme;

	public Cavalier(int ligne, char colonne, int coul)
	{
		super(ligne,colonne,coul);
		this.forme="";
	}
	
	public void déplacerPiece()
	{	
	}


	public boolean verifDeplacement(Echiquier e)
	{
		/* Vérifie tout les points en L :
		si on prend la piece a déplacer comme orgine on a (i,j) (abscisse,ordonné) :
		(1,2) (2,1) (2,-1) (1,-2) (-1,-2) (-2,-1) (-2,1) (-1,2)


		Ou bien si le cavalier est sur une case blanche alors 
		il peut se déplacer dans toutes les cases noir du deuxieme carré qui l'encercle
		*: ou je peux me déplacer
				_____________
				|B  * B *  B|
				|* |B N B| *|
				|B |N C N| B|
				|* |B N B| *|
				|B  * B *  B|
	*/
		
	}
}

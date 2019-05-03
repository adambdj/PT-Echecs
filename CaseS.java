public class Case
{
	private String positionCase; // position de la case ex : 1A
  	private boolean caseLibre; // return true si la case est libre sinon false
  	private Piece p; // case peut etre compose de piece
  	
  	public Case()
    {
    	this.positionCase = "";
      	this.caseLibre = true; // true (case libre)   false (case occupé)
    }
  
  	/* GETTER */
  
  	public Piece getPiece()
    {
		return this.p;
    }
  
  	/*	MET UNE PIECE DANS LA CASE */
  
  	public void setPiece(Piece piece)
    {
    	this.p = piece;	// met la piece dans la case
      	this.caseLibre = false;	// dit que la case n'est plus libre 
    }
 	
  	/*  GETTER  RETURN L'ETAT DE LA CASE */
  
  	public boolean getCaseLibre()
    {
    	return this.caseLibre;
    }
  
  	/*	 ON VIDE LA CASE */
  
  	public void setCaseLibre(boolean caseL)
    {
    	this.caseLibre = caseL;
      	if(caseL == true) 
          this.p = null;
    }
  	
  	/*	VERIFIE SI LA POSITION DE LA CASE EST VALIDE */
  
  	public boolean positionValide()
    {
      char[] tabChar = {"A","B","C","D","E","F","G","H"};
      boolean t = false;
      if(this.positionCase.lenght != 2)	// faut pas que ca fasse A12 d'ou taille de la position different de 2
        return t;
      else
      {
      	for(int i = 0; i < tabChar.lenght; i++)
        {
          if( this.positionCase[0] >= 1 && this.positionCase[0] <= 8 && this.positionCase[1] == tabChar[i])
            p = true;	//	met true si la position est bien valide
        }
      }
 	  return p;
    }   
  	
  
}

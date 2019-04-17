//Ce qu'on peux faire pendant une partie

public class Partie {
	private Echequier terrain; //Une Partie est composé d'un Echequier
	
	public Partie() {
		this.terrain=new Echequier();
	}
	
//--------------Soumeya
	public boolean verifDeplacement(Piece p) {
		boolean reponse = true;
		if(p instanceof Tour) //Si la piece est une tour
		{
		
		}
		if(p instanceof Roi) //Si la piece est un Roi
		{
			
		}
		if(p instanceof Reine) //Si la piece est une Reine
		{
			
		}
		if(p instanceof Fou) //Si la piece est un fou
		{
			
		}
		if(p instanceof Cavalier) //Si la piece est un Cavalier
		{
			
		}
			
		return reponse;
	}
	
//-------------------
	public Echequier getTerrain() {
		return terrain;
	}

	public void setTerrain(Echequier nouvTerrain) {
		this.terrain = nouvTerrain;
	}
	
	
}
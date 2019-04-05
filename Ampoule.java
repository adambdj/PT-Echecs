public class Ampoule {

	private int couleur;
	private int puissance;
	
	public Ampoule (){
		this.couleur=400;
		this.puissance=3500;
	}
	
	public Ampoule (int coul, int pui) {
		this.couleur=coul;
		this.puissance=pui;
	}
	
	public int getCouleur() {
		return this.couleur;
	}
	
	public int getPuissance() {
		return this.puissance;
	}
	
	public void setCouleur(int nouvCoul) {
		this.couleur=nouvCoul;
	}
	
	public void setPuissance(int nouvPui) {
		this.puissance=nouvPui;
	}
	
	public void allumer() {
		if (this.getPuissance()>400 && this.getCouleur()>6000)
		{
			System.out.println("Allumer : + 400lm à 6000K");
		}
	}
	
	public void eteindre() {
		if (this.getPuissance()<400 && this.getCouleur()<6000)
		{
			System.out.println("Eteindre : - 400lm à 6000K");
		}
	}
	
	public void setCouleurPuissance(int nouvCoul, int nouvPui) {
		this.couleur=nouvCoul;
		this.puissance=nouvPui;
	}
	
	public String toString() {
		String s = "couleur:"+this.couleur+"K, puissance:"+this.puissance+"lm.";
		return s;
	}
}

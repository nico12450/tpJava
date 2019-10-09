package tp.java.objet;

public enum Couleur {
	
	Rouge("R"),
	Vert("V"),
	Bleu("B"),
	Jaune("J"),
	Noir("N");
	
	private String abreviation;
	
	private Couleur() {
		
	}
	
	private Couleur(String s) {
		
		this.abreviation = s;
		
	}
	
	public static Couleur getCouleurDefault() {
		
		return Noir;
		
	}
	
	public String getAbreviation() {
		
		return this.abreviation;
		
	}

}

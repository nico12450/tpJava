package tp.java.objet;

public class Carre extends Rectangle {
	
	//private int c;
	//private Point p;
	

	public Carre(Point p, int c) {
		super(p,c,c);
		//this.c = c;
		//this.p = p;
		
	}
	
	public Carre(Point p, int c, Couleur co) {
		super(p,c,c,co);
		//this.c = c;
		//this.p = p;
		
	}
	
	protected String getType() {
		return "CARRE";
		
	}
	
	public String toString() {
		String s = "[" + this.getType() + this.getPointBasGauche() + ";" + this.getPointBasDroit() + ";" + this.getPointHautGauche() + ";" + this.getPointHautDroit() + "] " + "couleur : " + this.getCouleur();
		
		return s;
	}

}

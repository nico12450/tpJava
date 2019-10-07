package tp.java.objet;

public class Rectangle extends Figure {
	
	private Point p; //point en haut à gauche
	private int longueur;
	private int largeur;
	
	public Rectangle(Point p, int longueur, int largeur) {
		
		this.p = p;
		this.longueur = longueur;
		this.largeur = largeur;
		
	}
	
	public Point getPointBasGauche() {
		return new Point(p.getX(),p.getY()+largeur);
	}
	
	public Point getPointBasDroit() {
		return new Point(p.getX()+longueur,p.getY()+largeur);
	}
	
	public Point getPointHautGauche() {
		return p;
	}
	
	public Point getPointHautDroit() {
		return new Point(p.getX()+longueur,p.getY());
	}
	
	public String toString() {
		
		String s = "[" + this.getType() + this.getPointBasGauche() + ";" + this.getPointBasDroit() + ";" + this.getPointHautGauche() + ";" + this.getPointHautDroit() + "]";
		
		return s;
	}
	
	protected String getType() {
		return "RECT";
	}
	
	
}

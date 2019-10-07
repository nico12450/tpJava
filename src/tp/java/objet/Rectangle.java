package tp.java.objet;

public class Rectangle extends Figure implements Surfacable{
	
	//private Point p; //point en haut à gauche
	private int longueur;
	private int largeur;
	
	public Rectangle(Point p, int longueur, int largeur) {
		
		super(p);
		
		//this.p = p;
		this.longueur = longueur;
		this.largeur = largeur;
		
	}
	
	public Point getPointBasGauche() {
		return new Point(origine.getX(),origine.getY()+largeur);
	}
	
	public Point getPointBasDroit() {
		return new Point(origine.getX()+longueur,origine.getY()+largeur);
	}
	
	public Point getPointHautGauche() {
		return origine;
	}
	
	public Point getPointHautDroit() {
		return new Point(origine.getX()+longueur,origine.getY());
	}
	
	public String toString() {
		
		String s = "[" + this.getType() + this.getPointBasGauche() + ";" + this.getPointBasDroit() + ";" + this.getPointHautGauche() + ";" + this.getPointHautDroit() + "]";
		
		return s;
	}
	
	protected String getType() {
		return "RECT";
	}

	@Override
	public double surface() {
		// TODO Auto-generated method stub
		return longueur*largeur;
	}

	@Override
	public Point[] getPoints() {
		// TODO Auto-generated method stub
		return new Point[] {getPointBasGauche(),getPointBasDroit(),getPointHautGauche(),getPointHautDroit()};
	}

	@Override
	public int getNbPoints() {
		// TODO Auto-generated method stub
		return 4;
	}
	
	
}

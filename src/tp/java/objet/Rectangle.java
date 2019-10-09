package tp.java.objet;

import java.util.LinkedList;
import java.util.Objects;

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
	
	public Rectangle(Point p, int longueur, int largeur, Couleur c) {
		
		super(p,c);
		
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

	@Override
	public LinkedList<Point> getPointsList() {
		// TODO Auto-generated method stub
		
		LinkedList<Point> l = new LinkedList<Point>();
		l.add(getPointBasGauche());
		l.add(getPointBasDroit());
		l.add(getPointHautGauche());
		l.add(getPointHautDroit());
		
		return l;
	}

	@Override
	public boolean couvre(Point p) {
		// TODO Auto-generated method stub	
		
		return p.getX()>=this.origine.getX() && p.getX()<=this.getPointHautDroit().getX() && p.getY()>=this.origine.getY() && p.getY()<=this.getPointBasGauche().getY();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(largeur, longueur);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (!(obj instanceof Rectangle)) {
			return false;
		}
		Rectangle other = (Rectangle) obj;
		return largeur == other.largeur && longueur == other.longueur;
	}

	@Override
	public double distanceOrigine() {
		// TODO Auto-generated method stub
		
		Point pInit = new Point();
		
		double minDist = this.origine.distance(pInit);
		
		for(Point p : this.getPoints()) {
			
			if(p.distance(pInit)<minDist) {
				
				minDist = p.distance(pInit);
				
			}
			
		}
		
		return minDist;
	}


	@Override
	public int compareTo(Figure f) {
		// TODO Auto-generated method stub
		return (int) (this.distanceOrigine()-f.distanceOrigine());
	}

	@Override
	public boolean isSurfacable() {
		// TODO Auto-generated method stub
		return true;
	}
	
	
}

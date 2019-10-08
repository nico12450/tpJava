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
		
		
		
		return false;
	}

	@Override
	public int hashCode() {
		return Objects.hash(largeur, longueur);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Rectangle)) {
			return false;
		}
		Rectangle other = (Rectangle) obj;
		return largeur == other.largeur && longueur == other.longueur;
	}
	
	
}

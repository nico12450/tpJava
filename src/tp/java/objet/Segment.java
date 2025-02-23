package tp.java.objet;

import java.util.LinkedList;
import java.util.Objects;

public class Segment extends Figure {
	
	private int longueur;
	private boolean horizontal;
		
	
	public Segment(Point debut, int longueur, boolean horizontal) {
		
		super(debut);
		this.longueur = longueur;
		this.horizontal = horizontal;
		
	}
	
	public Segment(Point debut, int longueur, boolean horizontal, Couleur c) {
		
		super(debut,c);
		this.longueur = longueur;
		this.horizontal = horizontal;
		
	}


	private Point getPointFinal() {
		
		if(horizontal) {
			
			return new Point(origine.getX()+longueur,origine.getY());
			
		}
		
		else {
			
			return new Point(origine.getX(), origine.getY()+longueur);
		
		}
		
	}
	
	public String toString() {
		
		String s = "Segment " + origine + " � " + this.getPointFinal() + " couleur : " + this.getCouleur();
		
		return s;
	}


	@Override
	public Point[] getPoints() {
		// TODO Auto-generated method stub
		return new Point[] {origine,getPointFinal()};
	}


	@Override
	public int getNbPoints() {
		// TODO Auto-generated method stub
		return 2;
	}


	public LinkedList<Point> getPointsList() {
		// TODO Auto-generated method stub
		
		LinkedList<Point> l = new LinkedList<Point>();
		l.add(origine);
		l.add(getPointFinal());
	
		return l;
	}


	@Override
	public boolean couvre(Point p) {
		// TODO Auto-generated method stub
		
		if(horizontal) {
			return p.getX()>=this.origine.getX() && p.getX()<=this.getPointFinal().getX() && p.getY()==this.origine.getY();
		}
		
		else {
			return p.getY()>=this.origine.getY() && p.getY()<=this.getPointFinal().getY() && p.getX()==this.origine.getX();
		}
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(horizontal, longueur);
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
		if (!(obj instanceof Segment)) {
			return false;
		}
		Segment other = (Segment) obj;
		return horizontal == other.horizontal && longueur == other.longueur;
	}


	@Override
	public double distanceOrigine() {
		// TODO Auto-generated method stub
		return Math.min(this.origine.distance(new Point()), this.getPointFinal().distance(new Point()));
	}


	@Override
	public int compareTo(Figure f) {
		// TODO Auto-generated method stub
		return (int) (this.distanceOrigine() - f.distanceOrigine());
	}


	@Override
	public boolean isSurfacable() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String dessin() {
		// TODO Auto-generated method stub
		return "";
	}


}

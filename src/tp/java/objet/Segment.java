package tp.java.objet;

import java.util.LinkedList;
import java.util.Objects;

public class Segment extends Figure {
	
	//private Point debut;
	private int longueur;
	private boolean horizontal;
		
	
	public Segment(Point debut, int longueur, boolean horizontal) {
		super(debut);
		//this.debut = debut;
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
		
		String s = "Segment " + origine + " à " + this.getPointFinal();
		
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


}

package tp.java.objet;

import java.util.Collection;
//import java.util.LinkedList;

public abstract class Figure {
	
	public Point origine;
	
	public Figure(Point origine) {
		this.origine = origine;
	}
	
	public void affiche() {
		System.out.println(this);
	}
	
	public abstract Point[] getPoints();
	
	public abstract Collection<Point> getPointsList();
	
	public abstract int getNbPoints();
	
	public abstract boolean couvre(Point p);

}

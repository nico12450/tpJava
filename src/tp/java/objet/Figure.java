package tp.java.objet;

import java.util.Collection;
//import java.util.LinkedList;
import java.util.Objects;

public abstract class Figure implements Comparable<Figure>{
	
	public Point origine;
	private String key;
	
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

	@Override
	public int hashCode() {
		return Objects.hash(origine);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Figure)) {
			return false;
		}
		Figure other = (Figure) obj;
		return Objects.equals(origine, other.origine);
	}
	
	public abstract double distanceOrigine();
	
	public abstract int compareTo(Figure f);
	
	public abstract boolean isSurfacable();
	
	public String getKey() {
		return this.key;
	}

}

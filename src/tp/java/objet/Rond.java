package tp.java.objet;

import java.util.LinkedList;
import java.util.Objects;

public class Rond extends Figure implements Surfacable{
	
	//private Point p;
	private int r;
	
	public Rond(Point p, int r) {
		
		super(p);
		
		//this.p = p;
		this.r = r;
		
	}
	
	public String toString() {
		return "[ROND [" + origine + ", " + r + "]]";
	}

	@Override
	public double surface() {
		// TODO Auto-generated method stub
		return Math.PI*Math.pow(r,2);
	}

	@Override
	public Point[] getPoints() {
		// TODO Auto-generated method stub
		return new Point[] {origine};
	}

	@Override
	public int getNbPoints() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public LinkedList<Point> getPointsList() {
		// TODO Auto-generated method stub
		
		LinkedList<Point> l = new LinkedList<Point>();
		l.add(origine);
	
		return l;
	}

	@Override
	public boolean couvre(Point p) {
		// TODO Auto-generated method stub
		return FigureUtil.distance(this.origine,p)<this.r;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(r);
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
		if (!(obj instanceof Rond)) {
			return false;
		}
		Rond other = (Rond) obj;
		return r == other.r;
	}

	@Override
	public double distanceOrigine() {
		// TODO Auto-generated method stub
		return this.origine.distance(new Point());
	}


	@Override
	public int compareTo(Figure f) {
		// TODO Auto-generated method stub
		return (int) ( this.distanceOrigine()-f.distanceOrigine());
	}

	@Override
	public boolean isSurfacable() {
		// TODO Auto-generated method stub
		return true;
	}

}

package tp.java.objet;

import java.util.LinkedList;

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
		return this.origine == p && FigureUtil.distance(this.origine,p)<this.r;
	}

}

package tp.java.objet;

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

}

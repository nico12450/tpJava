package tp.java.objet;

public class Rond extends Figure{
	
	private Point p;
	private int r;
	
	public Rond(Point p, int r) {
		
		this.p = p;
		this.r = r;
		
	}
	
	public String toString() {
		return "[ROND [" + p + ", " + r + "]]";
	}
	
	public void affiche() {
		System.out.println(this);
	}

}

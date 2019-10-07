package tp.java.objet;

public class Segment extends Figure {
	
	private Point debut;
	private int longueur;
	private boolean horizontal;
		
	
	public Segment(Point debut, int longueur, boolean horizontal) {
		super();
		this.debut = debut;
		this.longueur = longueur;
		this.horizontal = horizontal;
	}


	private Point getPointFinal() {
		
		if(horizontal) {
			
			return new Point(debut.getX()+longueur,debut.getY());
			
		}
		
		else {
			
			return new Point(debut.getX(), debut.getY()+longueur);
		
		}
		
	}
	
	public String toString() {
		
		String s = "" + debut + " à " + this.getPointFinal();
		
		return s;
	}


}

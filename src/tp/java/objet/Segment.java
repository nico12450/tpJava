package tp.java.objet;

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


}

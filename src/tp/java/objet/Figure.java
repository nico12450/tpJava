package tp.java.objet;

public abstract class Figure {
	
	public Point origine;
	
	public Figure(Point origine) {
		this.origine = origine;
	}
	
	public void affiche() {
		System.out.println(this);
	}
	
	public abstract Point[] getPoints();
	
	public abstract int getNbPoints();

}

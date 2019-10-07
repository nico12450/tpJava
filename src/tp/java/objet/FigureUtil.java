package tp.java.objet;

public class FigureUtil {
	
	private static int getRandomInt(int min, int max) {
		
		return (int) (Math.random()*(max-min) + min);
		
	}
	
	private static Point getRandomPoint() {
		
		return new Point(getRandomInt(0,100),getRandomInt(0,100));
		
	}
	
	public static Rond getRandomRond() {
		
		return new Rond(getRandomPoint(),getRandomInt(1, 100));
		
	}
	
	public static Rectangle getRandomRectangle() {
		
		return new Rectangle(getRandomPoint(), getRandomInt(0, 100), getRandomInt(0, 100));
		
	}
	
	public static Carre getRandomCarre() {
		
		return new Carre(getRandomPoint(), getRandomInt(0, 100));
		
	}
	
	public static Figure getRandomFigure() {
		
		int n = getRandomInt(0,3);
		Figure f ;
		
		switch (n) {
		
			case 0:
				f = getRandomRond();
				break;
				
			case 1:
				f = getRandomRectangle();
				break;
				
			case 2:
				f = getRandomCarre();
				break;
				
			default:
				f = null;
				break;				
			
		}
		
		return f;
	}

}

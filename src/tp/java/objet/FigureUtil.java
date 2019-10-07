package tp.java.objet;

public class FigureUtil {
	
	private static int getRandomInt(int min, int max) {
		
		return (int) (Math.random()*(max-min) + min);
		
	}
	
	private static Point getRandomPoint() {
		return new Point(getRandomInt(0,100),getRandomInt(0,100));
	}
	
	public static Rond getRandomRond() {
		
		return new Rond(getRandomPoint(),getRandomInt(1, 20));
		
	}
	
	public static Rectangle getRandomRectangle() {
		
		return new Rectangle(getRandomPoint(), getRandomInt(0, 100), getRandomInt(0, 100));
		
	}

}

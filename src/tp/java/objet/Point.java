package tp.java.objet;

public class Point {
	
	private int x;
	private int y;
	private final int INIT_X = 25;
	private final int INIT_Y = 25;
	
	public Point() {
		this.x = INIT_X;
		this.y = INIT_Y;
	}
	
	public Point(int x, int y) {
		
		this.x = x;
		this.y= y;
		
	}

	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	public String toString() {
		
		String s = "[" + x +";" + y + "]";
		
		return s;
		
	}
	
	public static boolean equals(Point p1, Point p2) {
		return p1.getX()==p2.getX() && p1.getY()==p2.getY();
	}


}

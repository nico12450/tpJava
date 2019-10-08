package tp.java.objet;

import java.util.Objects;

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
	
	/*public boolean equals(Point p) {
		return this.x == p.getX() && this.y == p.getY(); 
	}*/

	@Override
	public int hashCode() {
		return Objects.hash(INIT_X, INIT_Y, x, y);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Point)) {
			return false;
		}
		Point other = (Point) obj;
		return INIT_X == other.INIT_X && INIT_Y == other.INIT_Y && x == other.x && y == other.y;
	}


}

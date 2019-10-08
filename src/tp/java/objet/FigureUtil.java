package tp.java.objet;

import java.util.Collection;
import java.util.HashSet;
//import java.util.LinkedList;

public class FigureUtil {
	
	private static int getRandomInt(int min, int max) {
		
		return (int) (Math.random()*(max-min) + min);
		
	}
	
	private static Point getRandomPoint(int min, int max) {
		
		return new Point(getRandomInt(min,max),getRandomInt(min,max));
		
	}
	
	public static Rond getRandomRond(int min, int max, int maxr) {
		
		return new Rond(getRandomPoint(min,max),getRandomInt(1, maxr));
		
	}
	
	public static Rectangle getRandomRectangle(int min, int max, int maxl) {
		
		return new Rectangle(getRandomPoint(min,max), getRandomInt(1, maxl), getRandomInt(1, maxl));
		
	}
	
	public static Carre getRandomCarre(int min, int max, int maxl) {
		
		return new Carre(getRandomPoint(min,max), getRandomInt(0, maxl));
		
	}
	
	public static Segment getRandomSegment(int min, int max, int maxl) {
		
		return new Segment(getRandomPoint(min,max), getRandomInt(1, maxl), (Math.random()<0.5));
		
	}
	
	public static Figure getRandomFigure(int min, int max) {
		
		final int maxl = 100;
		int n = getRandomInt(0,4);
		Figure f ;
		
		switch (n) {
		
			case 0:
				f = getRandomRond(min,max,maxl);
				break;
				
			case 1:
				f = getRandomRectangle(min,max,maxl);
				break;
				
			case 2:
				f = getRandomCarre(min,max,maxl);
				break;
				
			case 3:
				f = getRandomSegment(min,max,maxl);
				break;
				
			default:
				f = null;
				break;				
			
		}
		
		return f;
	}
	
	public static Surfacable getRandomSurfacable(int min, int max) {
		
		final int maxl = 100;
		int n = getRandomInt(0,3);
		Surfacable f ;
		
		switch (n) {
		
			case 0:
				f = getRandomRond(min,max,maxl);
				break;
				
			case 1:
				f = getRandomRectangle(min,max,maxl);
				break;
				
			case 2:
				f = getRandomCarre(min,max,maxl);
				break;
				
			default:
				f = null;
				break;				
			
		}
		
		return f;
	}
	
	public Point[] getPoints(Figure... F) {
		
		int nbPoints = 0;
		
		for(Figure f : F) {
			nbPoints += f.getNbPoints();
		}
		
		Point[] t = new Point[nbPoints];
		int n = 0;
		
		for(Figure f : F) {
			for(Point p : f.getPoints()) {
				
				t[n] = p;
				n++;
				
			}
		}
		
		return t;
	}
	
	public Collection<Point> getPointsList(Figure... F){
		
		Collection<Point> l = new HashSet<Point>();
		
		for(Figure f : F) {
			l.addAll(f.getPointsList());
		}
		
		
		return l;
		
		
	}
	
	public static Collection<Figure> genere(int n){
		
		Collection<Figure> l = new HashSet<Figure>();
		
		for(int i = 0; i<n; i++) {
			
			l.add(getRandomFigure(0,100));
			
		}
		
		return l;
		
	}

	public static double distance(Point p1, Point p2) {
		// TODO Auto-generated method stub
		return Math.sqrt(Math.pow((p1.getX()-p2.getX()), 2) + Math.pow((p1.getY()-p2.getY()), 2));
	}
	
	public static Figure getFigureEn(Point p, Dessin d) {
		
		for(Figure f : d.getFigures()) {
			if(f.couvre(p)) {
				return f;
			}
		}
		
		return null;
		
	}

}

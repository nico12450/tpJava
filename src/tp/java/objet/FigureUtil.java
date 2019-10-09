package tp.java.objet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
//import java.util.LinkedList;
import java.util.Iterator;
import java.util.List;

public class FigureUtil{
	
	public static HashMap<String,Figure> figureMap = new HashMap<String,Figure>();
	private static int nbFigures; 
	
	private static int getRandomInt(int min, int max) {
		
		return (int) (Math.random()*(max-min) + min);
		
	}
	
	private static Point getRandomPoint(int min, int max) {
		
		return new Point(getRandomInt(min,max),getRandomInt(min,max));
		
	}
	
	public static Rond getRandomRond(int min, int max, int maxr) {
		
		Rond r = new Rond(getRandomPoint(min,max),getRandomInt(1, maxr));
		nbFigures++;
		figureMap.put(generateKey(), r);
		
		return r;
		
	}
	
	public static Rectangle getRandomRectangle(int min, int max, int maxl) {
		
		Rectangle r = new Rectangle(getRandomPoint(min,max), getRandomInt(1, maxl), getRandomInt(1, maxl));
		nbFigures++;
		figureMap.put(generateKey(), r);
		
		return r;
		
	}
	
	public static Carre getRandomCarre(int min, int max, int maxl) {
		
		Carre c = new Carre(getRandomPoint(min,max), getRandomInt(0, maxl));
		nbFigures++;
		figureMap.put(generateKey(), c);
		
		return c;
		
	}
	
	public static Segment getRandomSegment(int min, int max, int maxl) {
		
		Segment s = new Segment(getRandomPoint(min,max), getRandomInt(1, maxl), (Math.random()<0.5));
		nbFigures++;
		figureMap.put(generateKey(), s);
		
		return s;
		
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
	
	public static List<Figure> genere(int n){
		
		ArrayList<Figure> l = new ArrayList<Figure>();
		
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
		
		/*for(Figure f : d.getFigures()) {
			if(f.couvre(p)) {
				return f;
			}
		}*/
		
		Iterator<Figure> it = d.getFigures().iterator();
		
		while(it.hasNext()) {
			
			Figure f = it.next();
			
			if(f.couvre(p)) {
				return f;
			}			
			
		}
		
		return null;
		
	}
	
	public static List<Figure> trieProcheOrigine(Dessin d){
		
		List<Figure> sortedFigs =  new ArrayList<Figure>(d.getFigures());
		Collections.sort(sortedFigs);
		
		return sortedFigs;
		
	}
	
	public static List<Surfacable> trieDominant(Dessin dessin){
		
		List<Surfacable> surfacables =  new ArrayList<Surfacable>();
		
		for (Figure f : dessin.getFigures()) {
			if (f instanceof Surfacable) {
				surfacables.add((Surfacable) f);
			}
		}
		
		
		Collections.sort(surfacables, new ComparaisonSurface());
		
		return surfacables;

		
	}
	
	public static void afficheListe(List<Figure> l) {
		
		for(Figure f : l) {
			f.affiche();
		}
		
	}
	
	private static String generateKey() {
		return "FigureN°" + FigureUtil.nbFigures;
		
	}
	
	public static Figure get(String s) {
		return figureMap.get(s);
	}
	
	public static boolean figureOutOfBounds(Figure f, int min, int max) {
		
		Point[] t = f.getPoints();
		
		for(Point p : t) {
			if(p.getX()<min || p.getX()>max || p.getY()<min || p.getY()>max) {
				return false;
			}
		}
		
		return false;
		
	}

}

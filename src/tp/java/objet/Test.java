package tp.java.objet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
//import java.util.LinkedList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("création d'un point : ");
		
		Point p = new Point(2,2);
		System.out.println(p);
		
		System.out.print("création d'un rond : ");
		
		Rond ro = new Rond(p,10);
		ro.affiche();
		
		System.out.print("création d'un rectangle : ");
		
		Rectangle re = new Rectangle(p,10,20);
		re.affiche();
		
		System.out.print("création d'un carré : ");
		
		Carre c = new Carre(p,10);
		c.affiche();
		
		System.out.print("création d'une figure aléatoire : ");
		
		Figure f = FigureUtil.getRandomFigure(0,100);
		f.affiche();
		
		System.out.print("création d'un segment : ");
		
		Segment s = new Segment(p,10,true);
		s.affiche();
		
		System.out.print("création d'une figure surfaçable aléatoire : ");
		
		Surfacable f2 = FigureUtil.getRandomSurfacable(0,100);
		f2.affiche();
		
		System.out.println("de surface : " + f2.surface());
		
		List<Figure> l = FigureUtil.genere(10);
		
		Dessin d = new Dessin(l);
		d.affiche();
		
		Point p2 = new Point (20,20);
		//Point p3 = new Point (8,8);
		//Rond r2 = new Rond(p,20);
		//Rectangle r2 = new Rectangle(p3,10,10);
		//System.out.println(r2.couvre(p2));
		//System.out.println(r2.couvre(p2));
		
		
		Figure f3 = FigureUtil.getFigureEn(p2, d);
		
		if(f3 != null) {
			System.out.println("la figure : " + f3);
			System.out.println("couvre le point : " + p2);
		}
		
		d = new Dessin(FigureUtil.trieProcheOrigine(d));
		d.affiche();
		
		ArrayList<Surfacable> t = (ArrayList<Surfacable>) FigureUtil.trieDominant(d);
		System.out.println(t.toString());
		
		System.out.println(FigureUtil.get("FigureN°1"));
		System.out.println(FigureUtil.figureMap);

	}

}

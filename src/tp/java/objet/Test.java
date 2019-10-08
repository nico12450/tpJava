package tp.java.objet;

import java.util.HashSet;
//import java.util.LinkedList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("cr�ation d'un point : ");
		
		Point p = new Point(1,1);
		System.out.println(p);
		
		System.out.print("cr�ation d'un rond : ");
		
		Rond ro = new Rond(p,10);
		ro.affiche();
		
		System.out.print("cr�ation d'un rectangle : ");
		
		Rectangle re = new Rectangle(p,10,20);
		re.affiche();
		
		System.out.print("cr�ation d'un carr� : ");
		
		Carre c = new Carre(p,10);
		c.affiche();
		
		System.out.print("cr�ation d'une figure al�atoire : ");
		
		Figure f = FigureUtil.getRandomFigure(0,100);
		f.affiche();
		
		System.out.print("cr�ation d'un segment : ");
		
		Segment s = new Segment(p,10,true);
		s.affiche();
		
		System.out.print("cr�ation d'une figure surfa�able al�atoire : ");
		
		Surfacable f2 = FigureUtil.getRandomSurfacable(0,100);
		f2.affiche();
		
		System.out.println("de surface : " + f2.surface());
		
		HashSet<Figure> l = (HashSet<Figure>) FigureUtil.genere(10);
		Dessin d = new Dessin(l);
		d.affiche();

	}

}

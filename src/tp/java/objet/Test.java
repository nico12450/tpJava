package tp.java.objet;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("création d'un point : ");
		
		Point p = new Point(1,1);
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
		
		Figure f = FigureUtil.getRandomFigure();
		f.affiche();
		
		System.out.print("création d'un segment : ");
		
		Segment s = new Segment(p,10,true);
		s.affiche();
		
		System.out.print("création d'une figure surfaçable aléatoire : ");
		
		Surfacable f2 = FigureUtil.getRandomSurfacable();
		f2.affiche();
		
		System.out.println("de surface : " + f2.surface());

	}

}

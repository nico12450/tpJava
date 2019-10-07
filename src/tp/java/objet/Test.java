package tp.java.objet;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point p = new Point(1,1);
		System.out.println(p);
		
		Rond ro = new Rond(p,10);
		ro.affiche();
		
		Rectangle re = new Rectangle(p,10,10);
		re.affiche();

	}

}

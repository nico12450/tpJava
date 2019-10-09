package tp.java.objet;

import java.util.Comparator;

public class ComparaisonSurface implements Comparator<Surfacable>{

	public int compare(Surfacable f1, Surfacable f2) {
		// TODO Auto-generated method stub
		return (int) (f1.surface()-f2.surface());
	}

}

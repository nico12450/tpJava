package tp.java.objet;

import java.util.Collection;
import java.util.HashSet;
//import java.util.LinkedList;

public class Dessin {	
	
	//choix de la linked list car plus rapide pour les ajouts et suppressions
	//private LinkedList<Figure> l = new LinkedList<Figure>();
	
	//le hashset permet d'éviter les doublons
	private HashSet<Figure> h = new HashSet<Figure>();
	
	public Dessin() {
		
	}
	
	public Dessin(Collection<Figure> l) {
		this.h = (HashSet<Figure>) l;
	}
	
	public boolean add(Figure f) {
		
		return h.add(f);
		
	}

	public Collection<Figure> getFigures() {
		
		return h;
		
	}
	
	public void affiche() {
		
		System.out.println("affichage des figures du dessin");
		
		for(Figure f : h) {
			f.affiche();
		}
		
	}
	
	

}

package tp.java.objet;

import java.util.ArrayList;
//import java.util.Collection;
import java.util.List;
//import java.util.HashSet;
//import java.util.LinkedList;

public class Dessin {	
	
	//choix de la linked list car plus rapide pour les ajouts et suppressions
	//private LinkedList<Figure> l = new LinkedList<Figure>();
	
	//le hashset permet d'éviter les doublons
	private ArrayList<Figure> l = new ArrayList<Figure>();
	
	public Dessin() {
		
	}
	
	public Dessin(List<Figure> l) {
		//this.h = (HashSet<Figure>) l;
		
		this.l.addAll(l);
	}
	
	public boolean add(Figure f) {
		
		return l.add(f);
		
	}

	public List<Figure> getFigures() {
		
		return l;
		
	}
	
	public void affiche() {
		
		System.out.println("affichage des figures du dessin");
		
		for(Figure f : l) {
			f.affiche();
		}
		
	}
	
	

}

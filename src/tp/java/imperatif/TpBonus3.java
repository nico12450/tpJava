package tp.java.imperatif;

public class TpBonus3 {
	
	public static void triBulle(int[] t) {
		
		int l = t.length;
		int i = l-1;
		
		while(i>0) {
			
			for(int j = 0; j<i; j++) {
				
				/*if(t[i]<t[j]) {
					
					permuter(t,i,j);
					
				}*/
				
				if(t[j]>t[j+1]) {
					
					permuter(t,j,j+1);					
					
				}
				
			}
			
			i--;
			
		}
		
	}
	
	
	public static void permuter(int[] t, int i, int j) {
		
		int v = t[i];
		t[i] = t[j];
		t[j] = v;
		
	}
	
	
	public static void triSelection(int[] t) {
		
		int l = t.length;
		
		for(int i = 0; i<l; i++) {
			
			permuter(t,i,trouverIndiceMin(t,i,l));
			
		}
		
	}
	
	public static int trouverIndiceMin(int[] t, int i, int j) {
		
		int min = i;
		
		for(int x = i; x<j; x++) {
			
			if(t[x]<t[min]) {
				
				min = x;
			}
			
		}
		
		return min;
		
	}
	
	public static void afficherTableau(int[] t) {
		
		for(int n : t) {
			System.out.print(n);
		}
		
		System.out.println("");		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] tableau = {2,5,4,8,9,7,4,5};
		
		System.out.print("tableau initial : ");
		
		afficherTableau(tableau);
		
		triBulle(tableau);
		
		System.out.print("tableau trié  par tri à bulle : ");
		
		afficherTableau(tableau);
		
		int[] tableau2 = {6,1,8,8,3,7,2,9};
		
		System.out.print("tableau initial : ");
		
		afficherTableau(tableau2);
		
		triSelection(tableau2);
		
		System.out.print("tableau trié  par tri sélection : ");
		
		afficherTableau(tableau2);

	}

}

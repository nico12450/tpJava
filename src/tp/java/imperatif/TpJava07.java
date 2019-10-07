package tp.java.imperatif;

public class TpJava07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = Integer.parseInt(args[0]);
		
		System.out.println("affichage des "+ n + " premiers nombres premiers");

		int nbPremiers = 1;
		int i = 3;
		
		if(n>0) {
			System.out.println(2);
		}
		
		
		while(nbPremiers<n) {
			
			
			boolean estPremier = true;
			
			for(int j=2; j<i; j++) {
				
				//System.out.println("j : " + j);
				
				if(i%j == 0) {
					estPremier = false;
				}
				
			}
			
			if(estPremier) {
				nbPremiers++;
				System.out.println(i);
			}
			
			i++;
						
		}
		
	}

}

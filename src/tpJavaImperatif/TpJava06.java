package tpJavaImperatif;

public class TpJava06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = Integer.parseInt(args[0]);
		
		System.out.println("calcul de la factorielle de " + n);
		
		for(int i = n-1; i>0; i--) {
			
			n *= i;
			
		}
		
		if(n==0) {
			n = 1;
		}
		
		System.out.println("résultat : " + n);

	}

}

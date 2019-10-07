package tpJavaImperatif;

public class TpBonus2 {
	
	public static int px = 2;
	public static int py = 2;
	
	public static boolean positionExist(int x, int y) {
		
		if(x>7 || y>7 || x<0 || y<0) {
			return false;
		}
		
		return true;
		
	}
	
	public static boolean testNewPosition(int x, int y, int nx, int ny) {
		
		if(!positionExist(nx,ny)) {
			return false;
		}
		
		if(Math.abs(x-nx) == 2) {
			
			return Math.abs(y-ny)==1;
			
		}
		
		else if(Math.abs(y-ny) == 2) {
			
			return Math.abs(x-nx)==1;
			
		}
		
		return false;
	}
	
	public static void deplacer(int nx, int ny) {
		
		if(testNewPosition(px, py, nx, ny)){
			
			px = nx;
			py = ny;
			
			System.out.println("déplacement valide");
		}
		
		else {
			
			System.out.println("déplacement invalide");
			
		}
		
	}
	
	public static void afficherGrille(int x, int y) {
		
		for(int i=0; i<8; i++) {
			
			for(int j=0; j<8; j++) {
				
				if(i==x && j==y) {
					
					System.out.print(" X ");
					
				}
				
				else {
					
					System.out.print(" O ");
					
				}
				
			}
			
			System.out.println("");
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		afficherGrille(px, py);
		
		deplacer(2,3);
		deplacer(4,3);
		
		afficherGrille(px, py);
		
		/*char[] tc = {'a','b'};
		int[] ti = {1,2};
		
		System.out.println(tc);
		System.out.println(ti);*/
		
	}

}

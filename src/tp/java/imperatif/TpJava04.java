package tp.java.imperatif;

public class TpJava04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("premi�re partie\n");
		
		float p1 = Float.parseFloat(args[0]);
		
		System.out.println("param�tre : " + p1);
		
		if(p1>=1000 && p1<2000) {
			
			System.out.println("remise de 1%");
			System.out.println("nouveau param�tre : " + (p1*0.99));
		
		}
		
		else if(p1>=2000 && p1<5000) {
			
			System.out.println("remise de 3%");
			System.out.println("nouveau param�tre : " + (p1*0.97));
			
		}
		
		else if(p1>=5000) {
			
			System.out.println("remise de 5%");
			System.out.println("nouveau param�tre : " + (p1*0.95));
			
		}
		
		System.out.println("\ndeuxi�me partie\n");
		
		int p2 = Integer.parseInt(args[1]);
		
		System.out.println("param�tre : " + p2);
		
		switch(p2) {
		
		 case 1:
			System.out.println("petit");
			break;
			
		 case 2:
			 System.out.println("moyen");
			 break;
			 
		 default:
			 System.out.println("grand");
			 break;
			
		}

	}

}

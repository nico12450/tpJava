package tp.java.imperatif;

public class TpBonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int m = Integer.parseInt(args[0]);
		
		int nb50 = 0, nb20 = 0, nb10 = 0, nb5 = 0, nb2 = 0, nb1 = 0;
		
		while(m>0) {
			
			if(m>=50) {
				
				nb50++;
				m-=50;
				
			}
			
			else if(m>=20) {
				nb20++;
				m-=20;
			}
			
			else if(m>=10) {
				nb10++;
				m-=10;
			}
			
			else if(m>=5) {
				nb5++;
				m-=5;
			}
			
			else if(m>=2) {
				nb2++;
				m-=2;
			}
			
			else{
				nb1++;
				m--;
			}
			
		}
		
		System.out.println("50 : " + nb50);
		System.out.println("20 : " + nb20);
		System.out.println("10 : " + nb10);
		System.out.println("5 : " + nb5);
		System.out.println("2 : " + nb2);
		System.out.println("1 : " + nb1);

	}

}

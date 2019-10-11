package tp.java8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Date;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ancienne façon
		
		String dateNaissance = "06/19/1996";
		
		SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
		
		Date d1 = null;
		try {
			d1 = format.parse(dateNaissance);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Date d2 = new Date();
		
		
		long diff = d2.getTime() - d1.getTime();
		long diffDays = diff / (24 * 60 * 60 * 1000);
		
		System.out.println(diffDays + " days, ");
		
		
		//depuis java 8
		
		LocalDate d3 = LocalDate.of(1996, 6, 19);
		LocalDate d4 = LocalDate.now();
		
		Period p = Period.between(d3, d4);
		
		System.out.printf("%d ans %d mois %djours", p.getYears(),p.getMonths(),p.getDays());
		
		
		
		

	}

}

package clayfinTrainee;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Task9 {
	public static void main(String[] args) {
		LocalDate today =  LocalDate.now();        
		LocalDate tomorrow = today.plusDays(1);    
		LocalDate yesterday = today.minusDays(1);  
		System.out.println(today);
		System.out.println(tomorrow);
		System.out.println(yesterday);
		System.out.println();
		
		LocalDateTime now =  LocalDateTime.now();     
		LocalDateTime sameDayNextMonth = now.plusMonths(1);     
		LocalDateTime sameDayLastMonth = now.minusMonths(1);
		System.out.println(now);
		System.out.println(sameDayNextMonth +" ");
		System.out.println(sameDayLastMonth+" ");
		System.out.println();
		
		LocalDateTime sameDayNextYear = now.plusYears(1);    
		LocalDateTime sameDayLastYear = now.minusYears(1);
		System.out.println(sameDayNextYear);
		System.out.println(sameDayLastYear);
	}
}

package clayfinTrainee;

import java.time.LocalDate;
import java.time.YearMonth;

//() of java.time.*
public class Task6 {
	public static void main(String[] args) {
		
		//getMonth()
		YearMonth thisYearMonth = YearMonth.of(2022, 8);
		System.out.println(thisYearMonth.getMonth());
		
		//getYear()
		System.out.println(thisYearMonth.getYear());
		
		//dayOfYear()
		LocalDate dat = LocalDate.parse("2022-08-23");
		System.out.println(dat.getDayOfYear());
		
		//dayOfMonth()
		System.out.println(dat.getDayOfMonth());
	}

}

package clayfinTrainee;

import java.time.LocalDate;

public class Task8 {
	public static void main(String[] args) {
		
		//isAfter()
		LocalDate dat1 = LocalDate.parse("2022-08-23");
        LocalDate dat2 = LocalDate.parse("2021-08-23");
        System.out.println(dat1.isAfter(dat2));
        
        //isBefore()
        System.out.println(dat1.isBefore(dat2));
	}

}

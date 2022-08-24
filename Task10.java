package clayfinTrainee;

import java.time.LocalDate;
import java.time.LocalTime;

public class Task10 {
	public static void main(String[] args) {
		LocalTime ltime1 = LocalTime.parse("17:52:49");
		LocalTime ltime2 = LocalTime.parse("13:08:00");
		
		LocalDate ldate1 = LocalDate.parse("2022-05-20");
		LocalDate ldate2 = LocalDate.parse("2022-03-09");
		
		
		int value = ltime1.compareTo(ltime2);
		//long value = ltime1.compareTo(ltime2);
		//float value = ltime1.compareTo(ltime2);
		//double value = ltime1.compareTo(ltime2);
		System.out.println("Int Value:" + value);
		System.out.println();
		int dateValue = ldate1.compareTo(ldate2);
		System.out.println("Date value: "+ dateValue);
		  
        if (value > 0)
            System.out.println("LocalTime1 is started");
        else if (value == 0)
            System.out.println("LocalTime1 is equal to" + " LocalTime2");
        else
            System.out.println("LocalTime2 is stopped");

        if (dateValue > 0)
            System.out.println("LocalDate1 is started");
        else if (dateValue == 0)
            System.out.println("LocalDate1 is equal to" + " LocalDate2");
        else
            System.out.println("LocalDate2 is stopped");
	}

}

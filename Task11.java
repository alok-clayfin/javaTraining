package clayfinTrainee;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Task11 {
	public static void main(String[] args) {
		LocalTime time = LocalTime.parse("14:11:54.63");
		System.out.println("Time before truncate: "+ time);
		
		LocalTime returnValue= time.truncatedTo(ChronoUnit.SECONDS);
		LocalTime returnValue1= time.truncatedTo(ChronoUnit.MINUTES);
		LocalTime returnValue2= time.truncatedTo(ChronoUnit.HOURS);
		
		System.out.println("Time after truncate: "+ returnValue);
		System.out.println("Time after truncate: "+ returnValue1);
		System.out.println("Time after truncate: "+ returnValue2);
	}

}
